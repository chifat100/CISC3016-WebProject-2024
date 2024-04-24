import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Web {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";

    public void createCombinedWebPage() {
        String htmlContent = "<html><head><title>Aggregated Content and Spell Check</title></head><body>";

        try {
            // Fetch and process news, events, and updates
            Document doc1 = Jsoup.connect("http://example.com/news").userAgent(USER_AGENT).get();
            Document doc2 = Jsoup.connect("http://example.org/events").userAgent(USER_AGENT).get();
            Document doc3 = Jsoup.connect("http://example.net/updates").userAgent(USER_AGENT).get();

            Elements newsHeadlines = doc1.select("h1.headline");
            Elements eventDetails = doc2.select("div.events");
            Elements updates = doc3.select("section.updates");

            htmlContent += "<h1>News Headlines</h1>";
            for (Element headline : newsHeadlines) {
                htmlContent += "<p>" + headline.text() + "</p>";
            }

            htmlContent += "<h1>Upcoming Events</h1>";
            for (Element event : eventDetails) {
                htmlContent += "<div>" + event.html() + "</div>";
            }

            htmlContent += "<h1>Latest Updates</h1>";
            for (Element update : updates) {
                htmlContent += "<section>" + update.html() + "</section>";
            }

            // Spell check functionality (form only)
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

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Web web = new Web();
        web.createCombinedWebPage();
        System.out.println("Web page generated successfully.");
    }
}