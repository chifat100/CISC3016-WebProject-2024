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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class IndexController extends Controller {
    private static final String Site1 = "https://www.gov.mo/zh-hant/news/?display_mode=grid";
    private static final String Site2 = "https://www.um.edu.mo/category/news-and-press-releases/";
    private static final String Site3 = "https://www.modaily.cn/amucsite/web/index.html#/home";
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";

    private static final List<String> comments = Arrays.asList(
            "Interesting content!",
            "This is relevant to my interests.",
            "I've learned something new today.",
            "Great read, would recommend.",
            "This content is top-notch."
    );

    private String generateComment() {
        Random random = new Random();
        // Pick a random comment from the list
        int index = random.nextInt(comments.size());
        return comments.get(index);
    }

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
    }

    private void fetchGov(IndexData data) throws IOException {
        Document doc = Jsoup.connect(Site1).userAgent(USER_AGENT).get();
        Elements elements = doc.getElementsByClass("news--item-body");

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
    }

    private void fetchUM(IndexData data) throws IOException {
        Document doc = Jsoup.connect(Site2).userAgent(USER_AGENT).get();
        Elements elements = doc.getElementsByClass("archive__post");

        for (Element e : elements) {
            Element date = e.getElementsByClass("archive__postdate").first();
            Element title = e.getElementsByClass("archive__posttitle").first();
            if (Objects.isNull(date) || Objects.isNull(title))
                continue;
            if (Objects.equals(date.text(), "") || Objects.equals(title.text(), ""))
                continue;

            data.umTitles.add(title.text());
            data.umDates.add(date.text());
            if (data.umTitles.size() >= 8)
                break;
        }
    }

    private void fetchMODaily(IndexData data) throws IOException {
        Document doc = Jsoup.connect(Site3).userAgent(USER_AGENT).get();
        Elements elements = doc.getElementsByClass("conWidth mianConLeft");

        for (Element e : elements) {
            Element title = e.getElementsByClass("ng-binding").first();
            if (Objects.isNull(title))
                continue;
            if (Objects.equals(title.text(), ""))
                continue;

            data.moDailyTitles.add(title.html());
            if (data.moDailyTitles.size() >= 8)
                break;
        }
    }

    @Action("/")
    public Object index(@FromRoute("word") String word) throws IOException {
        IndexData data = new IndexData();

        if (Objects.isNull(word)) {
            fetchGov(data);
            fetchUM(data);
            fetchMODaily(data);
        }

        data.comment = generateComment();

        if (Objects.nonNull(word))
            fetchDictionary(data, word);

        return new IndexView(data);
    }
}
