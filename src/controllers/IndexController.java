package controllers;

import httpserver.Action;
import httpserver.Controller;
import httpserver.FromRoute;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import views.IndexData;
import views.IndexView;

import java.io.IOException;
import java.util.Objects;


public class IndexController extends Controller {
    private static final String Site1 = "https://www.gov.mo/zh-hant/news/?display_mode=grid";
    private static final String Site2 = "https://news.cctv.com/china/";
    private static final String Site3 = "https://www.modaily.cn/amucsite/web/index.html#/home";
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";

    private void fetchDictionary(IndexData data, String word) throws IOException {
        word = word.trim();
        data.word = word;
        Document doc = Jsoup.connect("https://dictionary.cambridge.org/us/dictionary/english/" + word).userAgent(USER_AGENT).get();
        Element title = doc.getElementsByClass("di-title").first();
        if (Objects.isNull(title)) {
            data.doesWordExists = false;
            return;
        }
        data.doesWordExists = true;
        Element defBlock = doc.getElementsByClass("def-block").first();
        if (Objects.isNull(defBlock))
            return;
        Element def = defBlock.getElementsByClass("def").first();
        if (Objects.isNull(def))
            return;
        data.wordDesc = def.text();
//        String str = Fetch.getString(URI.create("https://api.dictionaryapi.dev/api/v2/entries/en/hello"));
//        JSONArray array = new JSONArray(str);
//        if (array.isEmpty()) {
//            data.doesWordExists = false;
//            return;
//        }
//        JSONObject obj = array.getJSONObject(0);
//        if (!obj.has("word")) {
//            data.doesWordExists = false;
//            return;
//        }
    }

    @Action("/")
    public Object index(@FromRoute("word") String word) throws IOException {
        IndexData data = new IndexData();

        Document doc1 = Jsoup.connect(Site1).userAgent(USER_AGENT).get();
        Document doc2 = Jsoup.connect(Site2).userAgent(USER_AGENT).get();
        Document doc3 = Jsoup.connect(Site3).userAgent(USER_AGENT).get();
        Elements elements = doc1.getElementsByClass("news--item-body");
        Elements elements2 = doc2.getElementsByClass("con");
        Elements elements3 = doc3.getElementsByClass("conWidth mianConLeft");

        for (Element e : elements) {
            Element date = e.getElementsByClass("news--item-date").first();
            Element title = e.getElementsByClass("news--item-title").first();
            Element desc = e.getElementsByClass("news--item-desc").first();
            if (Objects.isNull(date) || Objects.isNull(title) || Objects.isNull(desc))
                continue;
            if (Objects.equals(date.text(), "") || Objects.equals(title.text(), "") || Objects.equals(desc.text(), ""))
                continue;

            data.govTitles.add(title.html());
            data.govDates.add(date.html());
            data.govDescs.add(desc.html());
            if (data.govTitles.size() >= 8)
                break;
        }

        for (Element e : elements3) {
            Element title = e.getElementsByClass("ng-binding").first();
            data.modailyTitles.add(title.html());
        }

        for (Element e : elements2) {
            Elements last = e.getElementsByClass("last");
            data.govDescs.add(last.html());
        }


        if (Objects.nonNull(word))
            fetchDictionary(data, word);

//        htmlContent += "<audio controls><source src='sound.wav' type='audio/mpeg'>Your browser does not support the audio element.</audio>";
//        htmlContent += "<img src='image.jpeg' alt=' '>";
//        htmlContent += "<script>function enlargeImage(img) { img.style.transform = 'scale(1.5)'; img.style.transition = 'transform 0.25s ease'; } document.querySelectorAll('img').forEach(img => img.addEventListener('click', () => enlargeImage(img)));</script>";
//        htmlContent += "</body></html>";
//
//        htmlContent += "<h2>Spell Check</h2>";
//        htmlContent += "<form action='/SpellCheckApp/checkSpelling' method='get'>";
//        htmlContent += "<label for='word'>Enter a word to check its spelling:</label>";
//        htmlContent += "<input type='text' id='word' name='word'><br>";
//        htmlContent += "<input type='submit' value='Check Spelling'>";
//        htmlContent += "</form>";
//
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter("src/aggregatedContent.html"));
//        writer.write(htmlContent);
//        writer.close();

        return new IndexView(data);
    }
}
