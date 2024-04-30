import controllers.IndexController;
import httpserver.HTTPApplication;
import httpserver.WebConfig;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Web {
    private static final String Site1 = "https://www.gov.mo/zh-hant/news/?display_mode=grid";
    private static final String Site2 = "https://news.cctv.com/china/";
    private static final String Site3 = "https://www.modaily.cn/amucsite/web/index.html#/home";
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";

    private List<String> comments = Arrays.asList(
            "Interesting content!",
            "This is relevant to my interests.",
            "I've learned something new today.",
            "Great read, would recommend.",
            "This content is top-notch."
    );


    private Random random = new Random();

    public static void main(String[] args) throws Exception {
//        Web web = new Web();
//        web.fetch();
        WebConfig.port = 5100;
        HTTPApplication app = new HTTPApplication();
        app.router().registerController(IndexController.class);
        app.run();
    }

    private String generateComment() {
        // Pick a random comment from the list
        int index = random.nextInt(comments.size());
        return comments.get(index);
    }

    private void fetch() throws IOException {
        Document doc1 = Jsoup.connect(Site1).userAgent(USER_AGENT).get();
        Document doc2 = Jsoup.connect(Site2).userAgent(USER_AGENT).get();
        Document doc3 = Jsoup.connect(Site3).userAgent(USER_AGENT).get();
        Elements elements = doc1.getElementsByClass("news--item-body");
        Elements elements2 = doc2.getElementsByClass("con");
        Elements elements3 = doc3.getElementsByClass("conWidth mianConLeft");

        String htmlContent = "<html><head><title>Aggregated Content and Spell Check</title></head><body>";


        for (Element e : elements) {
            Element date = e.getElementsByClass("news--item-date").first();
            Element title = e.getElementsByClass("news--item-title").first();
            Element desc = e.getElementsByClass("news--item-desc").first();
            if (Objects.isNull(title) || Objects.isNull(desc))
                continue;
            if (Objects.isNull(date)) {
                htmlContent += "<div>" + title.html() + "</div>" + desc.html();
            }
            //System.out.printf("%s %s%n", title.html(), desc.html());
            else
                htmlContent += "<div>" + date.html() + "</div>" + "<div>" + title.html() + "</div>" + "<div>" + desc.html() + "</div>";
            //System.out.printf("%s %s %s%n", date.html(), title.html(), desc.html());
        }

        for (Element e : elements3) {
            Element title = e.getElementsByClass("ng-scrop").first();
            Element text = e.getElementsByClass("home-text").getFirst();
        }

        for (Element e : elements2) {
            Elements last = e.getElementsByClass("last");
        }

        htmlContent += "<audio controls><source src='sound.wav' type='audio/mpeg'>Your browser does not support the audio element.</audio>";
        htmlContent += "<img src='image.jpeg' alt=' '>";
        htmlContent += "<script>function enlargeImage(img) { img.style.transform = 'scale(1.5)'; img.style.transition = 'transform 0.25s ease'; } document.querySelectorAll('img').forEach(img => img.addEventListener('click', () => enlargeImage(img)));</script>";
        htmlContent += "<p>" + "comment" + "</p>";
        htmlContent += "</body></html>";

        htmlContent += "<h2>Spell Check</h2>";
        htmlContent += "<form action='/SpellCheckApp/checkSpelling' method='get'>";
        htmlContent += "<label for='word'>Enter a word to check its spelling:</label>";
        htmlContent += "<input type='text' id='word' name='word'><br>";
        htmlContent += "<input type='submit' value='Check Spelling'>";
        htmlContent += "</form>";

        // Additional interactive elements
        htmlContent += "<audio controls><source src='sound.mp3' type='audio/mpeg'>Your browser does not support the audio element.</audio>";
        htmlContent += "<script>function enlargeImage(img) { img.style.transform = 'scale(1.5)'; img.style.transition = 'transform 0.25s ease'; } document.querySelectorAll('img').forEach(img => img.addEventListener('click', () => enlargeImage(img)));</script>";
        htmlContent += "</body></html>";

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/aggregatedContent.html"));
        writer.write(htmlContent);
        writer.close();
    }
}