import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SpellCheckServlet extends HttpServlet {
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the word from the request parameter
        String word = request.getParameter("word");

        // Prepare the response HTML
        String htmlResponse = "<html><head><title>Spell Check Result</title></head><body>";

        if (word != null && !word.isEmpty()) {
            // Perform the spell check
            Document doc = Jsoup.connect("https://www.dictionary.com/browse/" + word).userAgent(USER_AGENT).get();
            boolean isCorrect = doc.select("h1.head-entry").text().equalsIgnoreCase(word);

            // Add the result to the response HTML
            if (isCorrect) {
                htmlResponse += "<h1>Spelling is correct!</h1>";
            } else {
                htmlResponse += "<h1>Spelling is incorrect!</h1>";
            }
        } else {
            htmlResponse += "<h1>No word provided.</h1>";
        }

        htmlResponse += "</body></html>";

        // Write the response
        response.setContentType("text/html");
        response.getWriter().write(htmlResponse);
    }
}