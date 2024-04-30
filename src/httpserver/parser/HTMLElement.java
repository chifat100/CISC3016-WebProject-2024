package httpserver.parser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HTMLElement {
    private String html;

    public HTMLElement(URI uri) {
        html = Fetch.getString(uri);
        HttpResponse<String> res;
        try (HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
                .build()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .timeout(Duration.ofMinutes(2))
                    .header("Content-Type", "application/json")
                    .GET()
                    .build();
            res = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
        html = res.body();
    }

    public HTMLElement(String html) {
        this.html = html;
    }

//    public List<HTMLElement> getsByClassName(String className) {
//        String regex = "<[^>]+class\\s*=\\s*\"[^\"]*\\b" + className + "\\b[^>]*>"; //(.*?)<\\/[^>]+>";
//        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
//
//        Matcher matcher = pattern.matcher(html);
//
//        if (matcher.find()) {
//            return matcher.group(1);
//        }
//
//        return null;
//    }
}
