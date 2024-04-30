package httpserver;

public class StructureBuilder {
    private final boolean mini;
    private final StringBuilder sb;
    private int depth = 0;

    public StructureBuilder(boolean mini) {
        this.mini = mini;
        sb = new StringBuilder("<!DOCTYPE html>\r\n");
    }

    public void tag(String name, HTMLSlot slot) {
        tag(name, null, null, slot);
    }

    public void tag(String name, String classes, HTMLSlot slot) {
        tag(name, classes, null, slot);
    }

    public void tag(String name, String classes, StructureAttributes attributes, HTMLSlot slot) {
        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append("<");
        sb.append(name);
        if (classes != null) {
            sb.append(" class=\"");
            sb.append(classes);
            sb.append("\"");
        }
        if (attributes != null) {
            sb.append(" ");
            sb.append(attributes);
        }
        if (mini) sb.append(">");
        else sb.append(">\r\n");

        depth++;
        slot.call();
        depth--;

        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append("</");
        sb.append(name);
        if (mini) sb.append(">");
        else sb.append(">\r\n");
    }

    public void text(String text) {
        if (!mini)
            sb.append("  ".repeat(depth));
        sb.append(text);
        if (!mini)
            sb.append("\r\n");
    }

    public void textRaw(String text) {
        sb.append(text);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    /**
     * The abbreviation tag in HTML is used to define the abbreviation or short form of an element.
     * hint: &lt;abbr title=” “&gt; … &lt;/abbr&gt;
     */
    public void abbr(HTMLSlot slot) {
        tag("abbr", null, null, slot);
    }

    /**
     * The abbreviation tag in HTML is used to define the abbreviation or short form of an element.
     * hint: &lt;abbr title=” “&gt; … &lt;/abbr&gt;
     */
    public void abbr(String classes, HTMLSlot slot) {
        tag("abbr", classes, null, slot);
    }

    /**
     * The abbreviation tag in HTML is used to define the abbreviation or short form of an element.
     * hint: &lt;abbr title=” “&gt; … &lt;/abbr&gt;
     */
    public void abbr(StructureAttributes attributes, HTMLSlot slot) {
        tag("abbr", null, attributes, slot);
    }

    /**
     * The abbreviation tag in HTML is used to define the abbreviation or short form of an element.
     * hint: &lt;abbr title=” “&gt; … &lt;/abbr&gt;
     */
    public void abbr(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("abbr", classes, attributes, slot);
    }

    /**
     * The acronym tag in HTML is used to define the acronym that gives useful information to browsers, translation systems, and search engines.
     * hint: &lt;acronym title=” “&gt; … &lt;/acronym&gt;
     */
    public void acronym(HTMLSlot slot) {
        tag("acronym", null, null, slot);
    }

    /**
     * The acronym tag in HTML is used to define the acronym that gives useful information to browsers, translation systems, and search engines.
     * hint: &lt;acronym title=” “&gt; … &lt;/acronym&gt;
     */
    public void acronym(String classes, HTMLSlot slot) {
        tag("acronym", classes, null, slot);
    }

    /**
     * The acronym tag in HTML is used to define the acronym that gives useful information to browsers, translation systems, and search engines.
     * hint: &lt;acronym title=” “&gt; … &lt;/acronym&gt;
     */
    public void acronym(StructureAttributes attributes, HTMLSlot slot) {
        tag("acronym", null, attributes, slot);
    }

    /**
     * The acronym tag in HTML is used to define the acronym that gives useful information to browsers, translation systems, and search engines.
     * hint: &lt;acronym title=” “&gt; … &lt;/acronym&gt;
     */
    public void acronym(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("acronym", classes, attributes, slot);
    }

    /**
     * The address tag in HTML indicates the contact information of a person or an organization.
     * hint: &lt;address&gt; … &lt;/address&gt;
     */
    public void address(HTMLSlot slot) {
        tag("address", null, null, slot);
    }

    /**
     * The address tag in HTML indicates the contact information of a person or an organization.
     * hint: &lt;address&gt; … &lt;/address&gt;
     */
    public void address(String classes, HTMLSlot slot) {
        tag("address", classes, null, slot);
    }

    /**
     * The address tag in HTML indicates the contact information of a person or an organization.
     * hint: &lt;address&gt; … &lt;/address&gt;
     */
    public void address(StructureAttributes attributes, HTMLSlot slot) {
        tag("address", null, attributes, slot);
    }

    /**
     * The address tag in HTML indicates the contact information of a person or an organization.
     * hint: &lt;address&gt; … &lt;/address&gt;
     */
    public void address(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("address", classes, attributes, slot);
    }

    /**
     * The anchor tag in HTML is used to create a hyperlink on the webpage.
     * hint: &lt;a herf=” “&gt; …&lt;/a&gt;
     */
    public void a(HTMLSlot slot) {
        tag("a", null, null, slot);
    }

    /**
     * The anchor tag in HTML is used to create a hyperlink on the webpage.
     * hint: &lt;a herf=” “&gt; …&lt;/a&gt;
     */
    public void a(String classes, HTMLSlot slot) {
        tag("a", classes, null, slot);
    }

    /**
     * The anchor tag in HTML is used to create a hyperlink on the webpage.
     * hint: &lt;a herf=” “&gt; …&lt;/a&gt;
     */
    public void a(StructureAttributes attributes, HTMLSlot slot) {
        tag("a", null, attributes, slot);
    }

    /**
     * The anchor tag in HTML is used to create a hyperlink on the webpage.
     * hint: &lt;a herf=” “&gt; …&lt;/a&gt;
     */
    public void a(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("a", classes, attributes, slot);
    }

    /**
     * The applet tag in HTML was used to embed Java applets into any HTML document, discontinued starting from HTML 5.
     * hint: &lt;applet&gt;….&lt;/applet&gt;
     */
    public void applet(HTMLSlot slot) {
        tag("applet", null, null, slot);
    }

    /**
     * The applet tag in HTML was used to embed Java applets into any HTML document, discontinued starting from HTML 5.
     * hint: &lt;applet&gt;….&lt;/applet&gt;
     */
    public void applet(String classes, HTMLSlot slot) {
        tag("applet", classes, null, slot);
    }

    /**
     * The applet tag in HTML was used to embed Java applets into any HTML document, discontinued starting from HTML 5.
     * hint: &lt;applet&gt;….&lt;/applet&gt;
     */
    public void applet(StructureAttributes attributes, HTMLSlot slot) {
        tag("applet", null, attributes, slot);
    }

    /**
     * The applet tag in HTML was used to embed Java applets into any HTML document, discontinued starting from HTML 5.
     * hint: &lt;applet&gt;….&lt;/applet&gt;
     */
    public void applet(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("applet", classes, attributes, slot);
    }

    /**
     * This area tag is used in an HTML document to map a portion of an image to make it clickable by the end-user.
     * hint: &lt;area&gt;
     */
    public void area(HTMLSlot slot) {
        tag("area", null, null, slot);
    }

    /**
     * This area tag is used in an HTML document to map a portion of an image to make it clickable by the end-user.
     * hint: &lt;area&gt;
     */
    public void area(String classes, HTMLSlot slot) {
        tag("area", classes, null, slot);
    }

    /**
     * This area tag is used in an HTML document to map a portion of an image to make it clickable by the end-user.
     * hint: &lt;area&gt;
     */
    public void area(StructureAttributes attributes, HTMLSlot slot) {
        tag("area", null, attributes, slot);
    }

    /**
     * This area tag is used in an HTML document to map a portion of an image to make it clickable by the end-user.
     * hint: &lt;area&gt;
     */
    public void area(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("area", classes, attributes, slot);
    }

    /**
     * The &lt;article&gt; tag is one of the new sectioning element in HTML5. The tag is used to represent an article.
     * hint: &lt;article&gt;..&lt;/article&gt;
     */
    public void article(HTMLSlot slot) {
        tag("article", null, null, slot);
    }

    /**
     * The &lt;article&gt; tag is one of the new sectioning element in HTML5. The tag is used to represent an article.
     * hint: &lt;article&gt;..&lt;/article&gt;
     */
    public void article(String classes, HTMLSlot slot) {
        tag("article", classes, null, slot);
    }

    /**
     * The &lt;article&gt; tag is one of the new sectioning element in HTML5. The tag is used to represent an article.
     * hint: &lt;article&gt;..&lt;/article&gt;
     */
    public void article(StructureAttributes attributes, HTMLSlot slot) {
        tag("article", null, attributes, slot);
    }

    /**
     * The &lt;article&gt; tag is one of the new sectioning element in HTML5. The tag is used to represent an article.
     * hint: &lt;article&gt;..&lt;/article&gt;
     */
    public void article(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("article", classes, attributes, slot);
    }

    /**
     * The &lt;aside&gt; tag is used to describe the main object of the web page in a shorter way like a highlighter.
     * hint: &lt;aside&gt;..&lt;/aside&gt;
     */
    public void aside(HTMLSlot slot) {
        tag("aside", null, null, slot);
    }

    /**
     * The &lt;aside&gt; tag is used to describe the main object of the web page in a shorter way like a highlighter.
     * hint: &lt;aside&gt;..&lt;/aside&gt;
     */
    public void aside(String classes, HTMLSlot slot) {
        tag("aside", classes, null, slot);
    }

    /**
     * The &lt;aside&gt; tag is used to describe the main object of the web page in a shorter way like a highlighter.
     * hint: &lt;aside&gt;..&lt;/aside&gt;
     */
    public void aside(StructureAttributes attributes, HTMLSlot slot) {
        tag("aside", null, attributes, slot);
    }

    /**
     * The &lt;aside&gt; tag is used to describe the main object of the web page in a shorter way like a highlighter.
     * hint: &lt;aside&gt;..&lt;/aside&gt;
     */
    public void aside(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("aside", classes, attributes, slot);
    }

    /**
     * It is a useful tag if you want to add audio such as songs, interviews, etc. on your webpage.
     * hint: &lt;audio&gt;..&lt;/audio&gt;
     */
    public void audio(HTMLSlot slot) {
        tag("audio", null, null, slot);
    }

    /**
     * It is a useful tag if you want to add audio such as songs, interviews, etc. on your webpage.
     * hint: &lt;audio&gt;..&lt;/audio&gt;
     */
    public void audio(String classes, HTMLSlot slot) {
        tag("audio", classes, null, slot);
    }

    /**
     * It is a useful tag if you want to add audio such as songs, interviews, etc. on your webpage.
     * hint: &lt;audio&gt;..&lt;/audio&gt;
     */
    public void audio(StructureAttributes attributes, HTMLSlot slot) {
        tag("audio", null, attributes, slot);
    }

    /**
     * It is a useful tag if you want to add audio such as songs, interviews, etc. on your webpage.
     * hint: &lt;audio&gt;..&lt;/audio&gt;
     */
    public void audio(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("audio", classes, attributes, slot);
    }

    /**
     * The HTML base tag is used to specify a base URI, or URL, for relative links. This URL will be the base URL for every link on the page.
     * hint: &lt;base href = ” “&gt;
     */
    public void base(HTMLSlot slot) {
        tag("base", null, null, slot);
    }

    /**
     * The HTML base tag is used to specify a base URI, or URL, for relative links. This URL will be the base URL for every link on the page.
     * hint: &lt;base href = ” “&gt;
     */
    public void base(String classes, HTMLSlot slot) {
        tag("base", classes, null, slot);
    }

    /**
     * The HTML base tag is used to specify a base URI, or URL, for relative links. This URL will be the base URL for every link on the page.
     * hint: &lt;base href = ” “&gt;
     */
    public void base(StructureAttributes attributes, HTMLSlot slot) {
        tag("base", null, attributes, slot);
    }

    /**
     * The HTML base tag is used to specify a base URI, or URL, for relative links. This URL will be the base URL for every link on the page.
     * hint: &lt;base href = ” “&gt;
     */
    public void base(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("base", classes, attributes, slot);
    }

    /**
     * This tag is used to set the default text-color, font-size, & font-family of all the text in the browser. Not supported in HTML5.
     * hint: &lt;basefont&gt;
     */
    public void basefont(HTMLSlot slot) {
        tag("basefont", null, null, slot);
    }

    /**
     * This tag is used to set the default text-color, font-size, & font-family of all the text in the browser. Not supported in HTML5.
     * hint: &lt;basefont&gt;
     */
    public void basefont(String classes, HTMLSlot slot) {
        tag("basefont", classes, null, slot);
    }

    /**
     * This tag is used to set the default text-color, font-size, & font-family of all the text in the browser. Not supported in HTML5.
     * hint: &lt;basefont&gt;
     */
    public void basefont(StructureAttributes attributes, HTMLSlot slot) {
        tag("basefont", null, attributes, slot);
    }

    /**
     * This tag is used to set the default text-color, font-size, & font-family of all the text in the browser. Not supported in HTML5.
     * hint: &lt;basefont&gt;
     */
    public void basefont(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("basefont", classes, attributes, slot);
    }

    /**
     * The bdi tag refers to Bi-Directional Isolation. It differentiates a text from other text that may be formatted in a different direction.
     * hint: &lt;bdi&gt; … &lt;/bdi&gt;
     */
    public void bdi(HTMLSlot slot) {
        tag("bdi", null, null, slot);
    }

    /**
     * The bdi tag refers to Bi-Directional Isolation. It differentiates a text from other text that may be formatted in a different direction.
     * hint: &lt;bdi&gt; … &lt;/bdi&gt;
     */
    public void bdi(String classes, HTMLSlot slot) {
        tag("bdi", classes, null, slot);
    }

    /**
     * The bdi tag refers to Bi-Directional Isolation. It differentiates a text from other text that may be formatted in a different direction.
     * hint: &lt;bdi&gt; … &lt;/bdi&gt;
     */
    public void bdi(StructureAttributes attributes, HTMLSlot slot) {
        tag("bdi", null, attributes, slot);
    }

    /**
     * The bdi tag refers to Bi-Directional Isolation. It differentiates a text from other text that may be formatted in a different direction.
     * hint: &lt;bdi&gt; … &lt;/bdi&gt;
     */
    public void bdi(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("bdi", classes, attributes, slot);
    }

    /**
     * The bdo stands for Bi-Directional Override. This tag is used to specify the text direction or used to change the current direction.
     * hint: &lt;bdo dir&gt; Contents… &lt;/bdo&gt;
     */
    public void bdo(HTMLSlot slot) {
        tag("bdo", null, null, slot);
    }

    /**
     * The bdo stands for Bi-Directional Override. This tag is used to specify the text direction or used to change the current direction.
     * hint: &lt;bdo dir&gt; Contents… &lt;/bdo&gt;
     */
    public void bdo(String classes, HTMLSlot slot) {
        tag("bdo", classes, null, slot);
    }

    /**
     * The bdo stands for Bi-Directional Override. This tag is used to specify the text direction or used to change the current direction.
     * hint: &lt;bdo dir&gt; Contents… &lt;/bdo&gt;
     */
    public void bdo(StructureAttributes attributes, HTMLSlot slot) {
        tag("bdo", null, attributes, slot);
    }

    /**
     * The bdo stands for Bi-Directional Override. This tag is used to specify the text direction or used to change the current direction.
     * hint: &lt;bdo dir&gt; Contents… &lt;/bdo&gt;
     */
    public void bdo(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("bdo", classes, attributes, slot);
    }

    /**
     * The bgsound tag is used to play the soundtrack in the background.
     * hint: &lt;bgsound src=””&gt;
     */
    public void bgsound(HTMLSlot slot) {
        tag("bgsound", null, null, slot);
    }

    /**
     * The bgsound tag is used to play the soundtrack in the background.
     * hint: &lt;bgsound src=””&gt;
     */
    public void bgsound(String classes, HTMLSlot slot) {
        tag("bgsound", classes, null, slot);
    }

    /**
     * The bgsound tag is used to play the soundtrack in the background.
     * hint: &lt;bgsound src=””&gt;
     */
    public void bgsound(StructureAttributes attributes, HTMLSlot slot) {
        tag("bgsound", null, attributes, slot);
    }

    /**
     * The bgsound tag is used to play the soundtrack in the background.
     * hint: &lt;bgsound src=””&gt;
     */
    public void bgsound(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("bgsound", classes, attributes, slot);
    }

    /**
     * The big tag in HTML is used to increase the selected text size by one larger than the surrounding text. In HTML 5.
     * hint: &lt;big&gt; Contents… &lt;/big&gt;
     */
    public void big(HTMLSlot slot) {
        tag("big", null, null, slot);
    }

    /**
     * The big tag in HTML is used to increase the selected text size by one larger than the surrounding text. In HTML 5.
     * hint: &lt;big&gt; Contents… &lt;/big&gt;
     */
    public void big(String classes, HTMLSlot slot) {
        tag("big", classes, null, slot);
    }

    /**
     * The big tag in HTML is used to increase the selected text size by one larger than the surrounding text. In HTML 5.
     * hint: &lt;big&gt; Contents… &lt;/big&gt;
     */
    public void big(StructureAttributes attributes, HTMLSlot slot) {
        tag("big", null, attributes, slot);
    }

    /**
     * The big tag in HTML is used to increase the selected text size by one larger than the surrounding text. In HTML 5.
     * hint: &lt;big&gt; Contents… &lt;/big&gt;
     */
    public void big(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("big", classes, attributes, slot);
    }

    /**
     * The blockquote tag in HTML is used to display the long quotations (a section that is quoted from another source).
     * hint: &lt;blockquote&gt; Contents… &lt;/blockquote&gt;
     */
    public void blockquote(HTMLSlot slot) {
        tag("blockquote", null, null, slot);
    }

    /**
     * The blockquote tag in HTML is used to display the long quotations (a section that is quoted from another source).
     * hint: &lt;blockquote&gt; Contents… &lt;/blockquote&gt;
     */
    public void blockquote(String classes, HTMLSlot slot) {
        tag("blockquote", classes, null, slot);
    }

    /**
     * The blockquote tag in HTML is used to display the long quotations (a section that is quoted from another source).
     * hint: &lt;blockquote&gt; Contents… &lt;/blockquote&gt;
     */
    public void blockquote(StructureAttributes attributes, HTMLSlot slot) {
        tag("blockquote", null, attributes, slot);
    }

    /**
     * The blockquote tag in HTML is used to display the long quotations (a section that is quoted from another source).
     * hint: &lt;blockquote&gt; Contents… &lt;/blockquote&gt;
     */
    public void blockquote(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("blockquote", classes, attributes, slot);
    }

    /**
     * The body tag in HTML is used to define the main content present inside an HTML page.
     * hint: &lt;body&gt; Contents… &lt;/body&gt;
     */
    public void body(HTMLSlot slot) {
        tag("body", null, null, slot);
    }

    /**
     * The body tag in HTML is used to define the main content present inside an HTML page.
     * hint: &lt;body&gt; Contents… &lt;/body&gt;
     */
    public void body(String classes, HTMLSlot slot) {
        tag("body", classes, null, slot);
    }

    /**
     * The body tag in HTML is used to define the main content present inside an HTML page.
     * hint: &lt;body&gt; Contents… &lt;/body&gt;
     */
    public void body(StructureAttributes attributes, HTMLSlot slot) {
        tag("body", null, attributes, slot);
    }

    /**
     * The body tag in HTML is used to define the main content present inside an HTML page.
     * hint: &lt;body&gt; Contents… &lt;/body&gt;
     */
    public void body(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("body", classes, attributes, slot);
    }

    /**
     * The bold tag in HTML is used to specify the bold text without any extra importance.
     * hint: &lt;b&gt;… &lt;/b&gt;
     */
    public void b(HTMLSlot slot) {
        tag("b", null, null, slot);
    }

    /**
     * The bold tag in HTML is used to specify the bold text without any extra importance.
     * hint: &lt;b&gt;… &lt;/b&gt;
     */
    public void b(String classes, HTMLSlot slot) {
        tag("b", classes, null, slot);
    }

    /**
     * The bold tag in HTML is used to specify the bold text without any extra importance.
     * hint: &lt;b&gt;… &lt;/b&gt;
     */
    public void b(StructureAttributes attributes, HTMLSlot slot) {
        tag("b", null, attributes, slot);
    }

    /**
     * The bold tag in HTML is used to specify the bold text without any extra importance.
     * hint: &lt;b&gt;… &lt;/b&gt;
     */
    public void b(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("b", classes, attributes, slot);
    }

    /**
     * The break tag inserts a single carriage return or breaks in the document. This element has no end tag.
     * hint: &lt;br&gt;
     */
    public void br(HTMLSlot slot) {
        tag("br", null, null, slot);
    }

    /**
     * The break tag inserts a single carriage return or breaks in the document. This element has no end tag.
     * hint: &lt;br&gt;
     */
    public void br(String classes, HTMLSlot slot) {
        tag("br", classes, null, slot);
    }

    /**
     * The break tag inserts a single carriage return or breaks in the document. This element has no end tag.
     * hint: &lt;br&gt;
     */
    public void br(StructureAttributes attributes, HTMLSlot slot) {
        tag("br", null, attributes, slot);
    }

    /**
     * The break tag inserts a single carriage return or breaks in the document. This element has no end tag.
     * hint: &lt;br&gt;
     */
    public void br(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("br", classes, attributes, slot);
    }

    /**
     * The button tag in HTML is used to define the clickable button. &lt;button&gt; tag is used to submit the content.
     * hint: &lt;button type = “button”&gt;
     */
    public void button(HTMLSlot slot) {
        tag("button", null, null, slot);
    }

    /**
     * The button tag in HTML is used to define the clickable button. &lt;button&gt; tag is used to submit the content.
     * hint: &lt;button type = “button”&gt;
     */
    public void button(String classes, HTMLSlot slot) {
        tag("button", classes, null, slot);
    }

    /**
     * The button tag in HTML is used to define the clickable button. &lt;button&gt; tag is used to submit the content.
     * hint: &lt;button type = “button”&gt;
     */
    public void button(StructureAttributes attributes, HTMLSlot slot) {
        tag("button", null, attributes, slot);
    }

    /**
     * The button tag in HTML is used to define the clickable button. &lt;button&gt; tag is used to submit the content.
     * hint: &lt;button type = “button”&gt;
     */
    public void button(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("button", classes, attributes, slot);
    }

    /**
     * The caption tag is used to specify the caption of a table. Only one caption can be specified for one table.
     * hint: &lt;caption align = “value”&gt;&lt;/caption&gt;
     */
    public void caption(HTMLSlot slot) {
        tag("caption", null, null, slot);
    }

    /**
     * The caption tag is used to specify the caption of a table. Only one caption can be specified for one table.
     * hint: &lt;caption align = “value”&gt;&lt;/caption&gt;
     */
    public void caption(String classes, HTMLSlot slot) {
        tag("caption", classes, null, slot);
    }

    /**
     * The caption tag is used to specify the caption of a table. Only one caption can be specified for one table.
     * hint: &lt;caption align = “value”&gt;&lt;/caption&gt;
     */
    public void caption(StructureAttributes attributes, HTMLSlot slot) {
        tag("caption", null, attributes, slot);
    }

    /**
     * The caption tag is used to specify the caption of a table. Only one caption can be specified for one table.
     * hint: &lt;caption align = “value”&gt;&lt;/caption&gt;
     */
    public void caption(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("caption", classes, attributes, slot);
    }

    /**
     * It can be used to draw paths, boxes, texts, gradients, and add images.
     * hint: &lt;canvas id = “script”&gt; Contents&lt;/canvas&gt;
     */
    public void canvas(HTMLSlot slot) {
        tag("canvas", null, null, slot);
    }

    /**
     * It can be used to draw paths, boxes, texts, gradients, and add images.
     * hint: &lt;canvas id = “script”&gt; Contents&lt;/canvas&gt;
     */
    public void canvas(String classes, HTMLSlot slot) {
        tag("canvas", classes, null, slot);
    }

    /**
     * It can be used to draw paths, boxes, texts, gradients, and add images.
     * hint: &lt;canvas id = “script”&gt; Contents&lt;/canvas&gt;
     */
    public void canvas(StructureAttributes attributes, HTMLSlot slot) {
        tag("canvas", null, attributes, slot);
    }

    /**
     * It can be used to draw paths, boxes, texts, gradients, and add images.
     * hint: &lt;canvas id = “script”&gt; Contents&lt;/canvas&gt;
     */
    public void canvas(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("canvas", classes, attributes, slot);
    }

    /**
     * The center tag in HTML is used to set the alignment of text in the center. Not supported in HTML5.
     * hint: &lt;center&gt; Contents.&lt;/center&gt;
     */
    public void center(HTMLSlot slot) {
        tag("center", null, null, slot);
    }

    /**
     * The center tag in HTML is used to set the alignment of text in the center. Not supported in HTML5.
     * hint: &lt;center&gt; Contents.&lt;/center&gt;
     */
    public void center(String classes, HTMLSlot slot) {
        tag("center", classes, null, slot);
    }

    /**
     * The center tag in HTML is used to set the alignment of text in the center. Not supported in HTML5.
     * hint: &lt;center&gt; Contents.&lt;/center&gt;
     */
    public void center(StructureAttributes attributes, HTMLSlot slot) {
        tag("center", null, attributes, slot);
    }

    /**
     * The center tag in HTML is used to set the alignment of text in the center. Not supported in HTML5.
     * hint: &lt;center&gt; Contents.&lt;/center&gt;
     */
    public void center(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("center", classes, attributes, slot);
    }

    /**
     * The cite tag in HTML is used to define the title of a work. It displays the text in italic format.
     * hint: &lt;cite&gt;Content&lt;/cite&gt;
     */
    public void cite(HTMLSlot slot) {
        tag("cite", null, null, slot);
    }

    /**
     * The cite tag in HTML is used to define the title of a work. It displays the text in italic format.
     * hint: &lt;cite&gt;Content&lt;/cite&gt;
     */
    public void cite(String classes, HTMLSlot slot) {
        tag("cite", classes, null, slot);
    }

    /**
     * The cite tag in HTML is used to define the title of a work. It displays the text in italic format.
     * hint: &lt;cite&gt;Content&lt;/cite&gt;
     */
    public void cite(StructureAttributes attributes, HTMLSlot slot) {
        tag("cite", null, attributes, slot);
    }

    /**
     * The cite tag in HTML is used to define the title of a work. It displays the text in italic format.
     * hint: &lt;cite&gt;Content&lt;/cite&gt;
     */
    public void cite(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("cite", classes, attributes, slot);
    }

    /**
     * The code tag in HTML is used to define the piece of computer code.
     * hint: &lt;code&gt;Contents&lt;/code&gt;
     */
    public void code(HTMLSlot slot) {
        tag("code", null, null, slot);
    }

    /**
     * The code tag in HTML is used to define the piece of computer code.
     * hint: &lt;code&gt;Contents&lt;/code&gt;
     */
    public void code(String classes, HTMLSlot slot) {
        tag("code", classes, null, slot);
    }

    /**
     * The code tag in HTML is used to define the piece of computer code.
     * hint: &lt;code&gt;Contents&lt;/code&gt;
     */
    public void code(StructureAttributes attributes, HTMLSlot slot) {
        tag("code", null, attributes, slot);
    }

    /**
     * The code tag in HTML is used to define the piece of computer code.
     * hint: &lt;code&gt;Contents&lt;/code&gt;
     */
    public void code(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("code", classes, attributes, slot);
    }

    /**
     * It is useful for applying styles to entire columns, instead of repeating the styles for each column, and for each row
     * hint: &lt;colgroup&gt; Column lists &lt;/colgroup&gt;
     */
    public void colgroup(HTMLSlot slot) {
        tag("colgroup", null, null, slot);
    }

    /**
     * It is useful for applying styles to entire columns, instead of repeating the styles for each column, and for each row
     * hint: &lt;colgroup&gt; Column lists &lt;/colgroup&gt;
     */
    public void colgroup(String classes, HTMLSlot slot) {
        tag("colgroup", classes, null, slot);
    }

    /**
     * It is useful for applying styles to entire columns, instead of repeating the styles for each column, and for each row
     * hint: &lt;colgroup&gt; Column lists &lt;/colgroup&gt;
     */
    public void colgroup(StructureAttributes attributes, HTMLSlot slot) {
        tag("colgroup", null, attributes, slot);
    }

    /**
     * It is useful for applying styles to entire columns, instead of repeating the styles for each column, and for each row
     * hint: &lt;colgroup&gt; Column lists &lt;/colgroup&gt;
     */
    public void colgroup(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("colgroup", classes, attributes, slot);
    }

    /**
     * The col tag in HTML is used to set the column properties for each column within a colgroup tag.
     * hint: &lt;col attribute = “value”&gt;
     */
    public void col(HTMLSlot slot) {
        tag("col", null, null, slot);
    }

    /**
     * The col tag in HTML is used to set the column properties for each column within a colgroup tag.
     * hint: &lt;col attribute = “value”&gt;
     */
    public void col(String classes, HTMLSlot slot) {
        tag("col", classes, null, slot);
    }

    /**
     * The col tag in HTML is used to set the column properties for each column within a colgroup tag.
     * hint: &lt;col attribute = “value”&gt;
     */
    public void col(StructureAttributes attributes, HTMLSlot slot) {
        tag("col", null, attributes, slot);
    }

    /**
     * The col tag in HTML is used to set the column properties for each column within a colgroup tag.
     * hint: &lt;col attribute = “value”&gt;
     */
    public void col(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("col", classes, attributes, slot);
    }

    /**
     * The data element gives an address to a given content with a machine-readable translator.
     * hint: &lt;data value=””&gt; Contents &lt;/data&gt;
     */
    public void data(HTMLSlot slot) {
        tag("data", null, null, slot);
    }

    /**
     * The data element gives an address to a given content with a machine-readable translator.
     * hint: &lt;data value=””&gt; Contents &lt;/data&gt;
     */
    public void data(String classes, HTMLSlot slot) {
        tag("data", classes, null, slot);
    }

    /**
     * The data element gives an address to a given content with a machine-readable translator.
     * hint: &lt;data value=””&gt; Contents &lt;/data&gt;
     */
    public void data(StructureAttributes attributes, HTMLSlot slot) {
        tag("data", null, attributes, slot);
    }

    /**
     * The data element gives an address to a given content with a machine-readable translator.
     * hint: &lt;data value=””&gt; Contents &lt;/data&gt;
     */
    public void data(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("data", classes, attributes, slot);
    }

    /**
     * The datalist tag is used to provide autocomplete feature & used with an input tag so that users can easily fill the data in the forms using select the data.
     * hint: &lt;datalist&gt;Contents&lt;/datalist&gt;
     */
    public void datalist(HTMLSlot slot) {
        tag("datalist", null, null, slot);
    }

    /**
     * The datalist tag is used to provide autocomplete feature & used with an input tag so that users can easily fill the data in the forms using select the data.
     * hint: &lt;datalist&gt;Contents&lt;/datalist&gt;
     */
    public void datalist(String classes, HTMLSlot slot) {
        tag("datalist", classes, null, slot);
    }

    /**
     * The datalist tag is used to provide autocomplete feature & used with an input tag so that users can easily fill the data in the forms using select the data.
     * hint: &lt;datalist&gt;Contents&lt;/datalist&gt;
     */
    public void datalist(StructureAttributes attributes, HTMLSlot slot) {
        tag("datalist", null, attributes, slot);
    }

    /**
     * The datalist tag is used to provide autocomplete feature & used with an input tag so that users can easily fill the data in the forms using select the data.
     * hint: &lt;datalist&gt;Contents&lt;/datalist&gt;
     */
    public void datalist(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("datalist", classes, attributes, slot);
    }

    /**
     * The dd tag is used to denote the description or definition of an item in a description list.
     * hint: &lt;dd&gt;Contents&lt;/dd&gt;
     */
    public void dd(HTMLSlot slot) {
        tag("dd", null, null, slot);
    }

    /**
     * The dd tag is used to denote the description or definition of an item in a description list.
     * hint: &lt;dd&gt;Contents&lt;/dd&gt;
     */
    public void dd(String classes, HTMLSlot slot) {
        tag("dd", classes, null, slot);
    }

    /**
     * The dd tag is used to denote the description or definition of an item in a description list.
     * hint: &lt;dd&gt;Contents&lt;/dd&gt;
     */
    public void dd(StructureAttributes attributes, HTMLSlot slot) {
        tag("dd", null, attributes, slot);
    }

    /**
     * The dd tag is used to denote the description or definition of an item in a description list.
     * hint: &lt;dd&gt;Contents&lt;/dd&gt;
     */
    public void dd(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("dd", classes, attributes, slot);
    }

    /**
     * The define tag in HTML represents the definition element and is used to represent a defining instance in HTML.
     * hint: &lt;dfn&gt;Contents&lt;/dfn&gt;
     */
    public void dfn(HTMLSlot slot) {
        tag("dfn", null, null, slot);
    }

    /**
     * The define tag in HTML represents the definition element and is used to represent a defining instance in HTML.
     * hint: &lt;dfn&gt;Contents&lt;/dfn&gt;
     */
    public void dfn(String classes, HTMLSlot slot) {
        tag("dfn", classes, null, slot);
    }

    /**
     * The define tag in HTML represents the definition element and is used to represent a defining instance in HTML.
     * hint: &lt;dfn&gt;Contents&lt;/dfn&gt;
     */
    public void dfn(StructureAttributes attributes, HTMLSlot slot) {
        tag("dfn", null, attributes, slot);
    }

    /**
     * The define tag in HTML represents the definition element and is used to represent a defining instance in HTML.
     * hint: &lt;dfn&gt;Contents&lt;/dfn&gt;
     */
    public void dfn(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("dfn", classes, attributes, slot);
    }

    /**
     * Delete tag is used to mark a portion of text which has been deleted from the document.
     * hint: &lt;del&gt;Contents&lt;/del&gt;
     */
    public void del(HTMLSlot slot) {
        tag("del", null, null, slot);
    }

    /**
     * Delete tag is used to mark a portion of text which has been deleted from the document.
     * hint: &lt;del&gt;Contents&lt;/del&gt;
     */
    public void del(String classes, HTMLSlot slot) {
        tag("del", classes, null, slot);
    }

    /**
     * Delete tag is used to mark a portion of text which has been deleted from the document.
     * hint: &lt;del&gt;Contents&lt;/del&gt;
     */
    public void del(StructureAttributes attributes, HTMLSlot slot) {
        tag("del", null, attributes, slot);
    }

    /**
     * Delete tag is used to mark a portion of text which has been deleted from the document.
     * hint: &lt;del&gt;Contents&lt;/del&gt;
     */
    public void del(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("del", classes, attributes, slot);
    }

    /**
     * This tag is used to create an interactive widget that the user can open or close.
     * hint: &lt;details&gt;Contents&lt;/details&gt;
     */
    public void details(HTMLSlot slot) {
        tag("details", null, null, slot);
    }

    /**
     * This tag is used to create an interactive widget that the user can open or close.
     * hint: &lt;details&gt;Contents&lt;/details&gt;
     */
    public void details(String classes, HTMLSlot slot) {
        tag("details", classes, null, slot);
    }

    /**
     * This tag is used to create an interactive widget that the user can open or close.
     * hint: &lt;details&gt;Contents&lt;/details&gt;
     */
    public void details(StructureAttributes attributes, HTMLSlot slot) {
        tag("details", null, attributes, slot);
    }

    /**
     * This tag is used to create an interactive widget that the user can open or close.
     * hint: &lt;details&gt;Contents&lt;/details&gt;
     */
    public void details(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("details", classes, attributes, slot);
    }

    /**
     * This tag is used to create a popup dialog and models on a web page. This tag is new in HTML5.
     * hint: &lt;dialog open&gt; Contents… &lt;/dialog&gt;
     */
    public void dialog(HTMLSlot slot) {
        tag("dialog", null, null, slot);
    }

    /**
     * This tag is used to create a popup dialog and models on a web page. This tag is new in HTML5.
     * hint: &lt;dialog open&gt; Contents… &lt;/dialog&gt;
     */
    public void dialog(String classes, HTMLSlot slot) {
        tag("dialog", classes, null, slot);
    }

    /**
     * This tag is used to create a popup dialog and models on a web page. This tag is new in HTML5.
     * hint: &lt;dialog open&gt; Contents… &lt;/dialog&gt;
     */
    public void dialog(StructureAttributes attributes, HTMLSlot slot) {
        tag("dialog", null, attributes, slot);
    }

    /**
     * This tag is used to create a popup dialog and models on a web page. This tag is new in HTML5.
     * hint: &lt;dialog open&gt; Contents… &lt;/dialog&gt;
     */
    public void dialog(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("dialog", classes, attributes, slot);
    }

    /**
     * The dir tag is used to make a list of directory titles. It is not supported in HTML 5 &lt;ul&gt; or CSS are used instead of &lt;dir&gt; tag.
     * hint: &lt;dir&gt; Lists… &lt;/dir&gt;
     */
    public void dir(HTMLSlot slot) {
        tag("dir", null, null, slot);
    }

    /**
     * The dir tag is used to make a list of directory titles. It is not supported in HTML 5 &lt;ul&gt; or CSS are used instead of &lt;dir&gt; tag.
     * hint: &lt;dir&gt; Lists… &lt;/dir&gt;
     */
    public void dir(String classes, HTMLSlot slot) {
        tag("dir", classes, null, slot);
    }

    /**
     * The dir tag is used to make a list of directory titles. It is not supported in HTML 5 &lt;ul&gt; or CSS are used instead of &lt;dir&gt; tag.
     * hint: &lt;dir&gt; Lists… &lt;/dir&gt;
     */
    public void dir(StructureAttributes attributes, HTMLSlot slot) {
        tag("dir", null, attributes, slot);
    }

    /**
     * The dir tag is used to make a list of directory titles. It is not supported in HTML 5 &lt;ul&gt; or CSS are used instead of &lt;dir&gt; tag.
     * hint: &lt;dir&gt; Lists… &lt;/dir&gt;
     */
    public void dir(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("dir", classes, attributes, slot);
    }

    /**
     * The div tag is used in HTML to make divisions of content in the web page (text, images, header, footer, navigation bar, etc).
     * hint: &lt;div&gt;Content&lt;/div&gt;
     */
    public void div(HTMLSlot slot) {
        tag("div", null, null, slot);
    }

    /**
     * The div tag is used in HTML to make divisions of content in the web page (text, images, header, footer, navigation bar, etc).
     * hint: &lt;div&gt;Content&lt;/div&gt;
     */
    public void div(String classes, HTMLSlot slot) {
        tag("div", classes, null, slot);
    }

    /**
     * The div tag is used in HTML to make divisions of content in the web page (text, images, header, footer, navigation bar, etc).
     * hint: &lt;div&gt;Content&lt;/div&gt;
     */
    public void div(StructureAttributes attributes, HTMLSlot slot) {
        tag("div", null, attributes, slot);
    }

    /**
     * The div tag is used in HTML to make divisions of content in the web page (text, images, header, footer, navigation bar, etc).
     * hint: &lt;div&gt;Content&lt;/div&gt;
     */
    public void div(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("div", classes, attributes, slot);
    }

    /**
     * The dl tag in HTML is used to represent the description list. In HTML4.1, it defines definition list and in HTML5, it defines description list.
     * hint: &lt;dl&gt; Contents… &lt;/dl&gt;
     */
    public void dl(HTMLSlot slot) {
        tag("dl", null, null, slot);
    }

    /**
     * The dl tag in HTML is used to represent the description list. In HTML4.1, it defines definition list and in HTML5, it defines description list.
     * hint: &lt;dl&gt; Contents… &lt;/dl&gt;
     */
    public void dl(String classes, HTMLSlot slot) {
        tag("dl", classes, null, slot);
    }

    /**
     * The dl tag in HTML is used to represent the description list. In HTML4.1, it defines definition list and in HTML5, it defines description list.
     * hint: &lt;dl&gt; Contents… &lt;/dl&gt;
     */
    public void dl(StructureAttributes attributes, HTMLSlot slot) {
        tag("dl", null, attributes, slot);
    }

    /**
     * The dl tag in HTML is used to represent the description list. In HTML4.1, it defines definition list and in HTML5, it defines description list.
     * hint: &lt;dl&gt; Contents… &lt;/dl&gt;
     */
    public void dl(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("dl", classes, attributes, slot);
    }

    /**
     * The dt tag in HTML is used to specify the description list. It is used inside the &lt;dl&gt; element. It is usually followed by a &lt;dd&gt; tag.
     * hint: &lt;dt&gt; Content… &lt;/dt&gt;
     */
    public void dt(HTMLSlot slot) {
        tag("dt", null, null, slot);
    }

    /**
     * The dt tag in HTML is used to specify the description list. It is used inside the &lt;dl&gt; element. It is usually followed by a &lt;dd&gt; tag.
     * hint: &lt;dt&gt; Content… &lt;/dt&gt;
     */
    public void dt(String classes, HTMLSlot slot) {
        tag("dt", classes, null, slot);
    }

    /**
     * The dt tag in HTML is used to specify the description list. It is used inside the &lt;dl&gt; element. It is usually followed by a &lt;dd&gt; tag.
     * hint: &lt;dt&gt; Content… &lt;/dt&gt;
     */
    public void dt(StructureAttributes attributes, HTMLSlot slot) {
        tag("dt", null, attributes, slot);
    }

    /**
     * The dt tag in HTML is used to specify the description list. It is used inside the &lt;dl&gt; element. It is usually followed by a &lt;dd&gt; tag.
     * hint: &lt;dt&gt; Content… &lt;/dt&gt;
     */
    public void dt(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("dt", classes, attributes, slot);
    }

    /**
     * It is used as a container for embedding plug-ins such as flash animations.
     * hint: &lt;embed attributes&gt;
     */
    public void embed(HTMLSlot slot) {
        tag("embed", null, null, slot);
    }

    /**
     * It is used as a container for embedding plug-ins such as flash animations.
     * hint: &lt;embed attributes&gt;
     */
    public void embed(String classes, HTMLSlot slot) {
        tag("embed", classes, null, slot);
    }

    /**
     * It is used as a container for embedding plug-ins such as flash animations.
     * hint: &lt;embed attributes&gt;
     */
    public void embed(StructureAttributes attributes, HTMLSlot slot) {
        tag("embed", null, attributes, slot);
    }

    /**
     * It is used as a container for embedding plug-ins such as flash animations.
     * hint: &lt;embed attributes&gt;
     */
    public void embed(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("embed", classes, attributes, slot);
    }

    /**
     * The fieldset tag in HTML5 is used to make a group of related elements in the form, and it creates the box over the elements.
     * hint: &lt;fieldset&gt;Contents&lt;/fieldset&gt;
     */
    public void fieldset(HTMLSlot slot) {
        tag("fieldset", null, null, slot);
    }

    /**
     * The fieldset tag in HTML5 is used to make a group of related elements in the form, and it creates the box over the elements.
     * hint: &lt;fieldset&gt;Contents&lt;/fieldset&gt;
     */
    public void fieldset(String classes, HTMLSlot slot) {
        tag("fieldset", classes, null, slot);
    }

    /**
     * The fieldset tag in HTML5 is used to make a group of related elements in the form, and it creates the box over the elements.
     * hint: &lt;fieldset&gt;Contents&lt;/fieldset&gt;
     */
    public void fieldset(StructureAttributes attributes, HTMLSlot slot) {
        tag("fieldset", null, attributes, slot);
    }

    /**
     * The fieldset tag in HTML5 is used to make a group of related elements in the form, and it creates the box over the elements.
     * hint: &lt;fieldset&gt;Contents&lt;/fieldset&gt;
     */
    public void fieldset(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("fieldset", classes, attributes, slot);
    }

    /**
     * The figurecaption tag in HTML is used to set a caption to the figure element in a document. This tag is new in HTML5.
     * hint: &lt;figcaption&gt; Figure caption &lt;/figcaption&gt;
     */
    public void figcaption(HTMLSlot slot) {
        tag("figcaption", null, null, slot);
    }

    /**
     * The figurecaption tag in HTML is used to set a caption to the figure element in a document. This tag is new in HTML5.
     * hint: &lt;figcaption&gt; Figure caption &lt;/figcaption&gt;
     */
    public void figcaption(String classes, HTMLSlot slot) {
        tag("figcaption", classes, null, slot);
    }

    /**
     * The figurecaption tag in HTML is used to set a caption to the figure element in a document. This tag is new in HTML5.
     * hint: &lt;figcaption&gt; Figure caption &lt;/figcaption&gt;
     */
    public void figcaption(StructureAttributes attributes, HTMLSlot slot) {
        tag("figcaption", null, attributes, slot);
    }

    /**
     * The figurecaption tag in HTML is used to set a caption to the figure element in a document. This tag is new in HTML5.
     * hint: &lt;figcaption&gt; Figure caption &lt;/figcaption&gt;
     */
    public void figcaption(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("figcaption", classes, attributes, slot);
    }

    /**
     * The figure tag in HTML is used to add self-contained content like illustrations, diagrams, photos, or codes listed in a document.
     * hint: &lt;figure&gt; Image content… &lt;/figure&gt;
     */
    public void figure(HTMLSlot slot) {
        tag("figure", null, null, slot);
    }

    /**
     * The figure tag in HTML is used to add self-contained content like illustrations, diagrams, photos, or codes listed in a document.
     * hint: &lt;figure&gt; Image content… &lt;/figure&gt;
     */
    public void figure(String classes, HTMLSlot slot) {
        tag("figure", classes, null, slot);
    }

    /**
     * The figure tag in HTML is used to add self-contained content like illustrations, diagrams, photos, or codes listed in a document.
     * hint: &lt;figure&gt; Image content… &lt;/figure&gt;
     */
    public void figure(StructureAttributes attributes, HTMLSlot slot) {
        tag("figure", null, attributes, slot);
    }

    /**
     * The figure tag in HTML is used to add self-contained content like illustrations, diagrams, photos, or codes listed in a document.
     * hint: &lt;figure&gt; Image content… &lt;/figure&gt;
     */
    public void figure(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("figure", classes, attributes, slot);
    }

    /**
     * The font tag in HTML plays an important role in the web page to create an attractive and readable web page.
     * hint: &lt;font attribute = “value”&gt; Content &lt;/font&gt;
     */
    public void font(HTMLSlot slot) {
        tag("font", null, null, slot);
    }

    /**
     * The font tag in HTML plays an important role in the web page to create an attractive and readable web page.
     * hint: &lt;font attribute = “value”&gt; Content &lt;/font&gt;
     */
    public void font(String classes, HTMLSlot slot) {
        tag("font", classes, null, slot);
    }

    /**
     * The font tag in HTML plays an important role in the web page to create an attractive and readable web page.
     * hint: &lt;font attribute = “value”&gt; Content &lt;/font&gt;
     */
    public void font(StructureAttributes attributes, HTMLSlot slot) {
        tag("font", null, attributes, slot);
    }

    /**
     * The font tag in HTML plays an important role in the web page to create an attractive and readable web page.
     * hint: &lt;font attribute = “value”&gt; Content &lt;/font&gt;
     */
    public void font(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("font", classes, attributes, slot);
    }

    /**
     * The footer tag in HTML is used to define a footer of HTML document. This section contains the footer information.
     * hint: &lt;footer&gt; … &lt;/footer&gt;
     */
    public void footer(HTMLSlot slot) {
        tag("footer", null, null, slot);
    }

    /**
     * The footer tag in HTML is used to define a footer of HTML document. This section contains the footer information.
     * hint: &lt;footer&gt; … &lt;/footer&gt;
     */
    public void footer(String classes, HTMLSlot slot) {
        tag("footer", classes, null, slot);
    }

    /**
     * The footer tag in HTML is used to define a footer of HTML document. This section contains the footer information.
     * hint: &lt;footer&gt; … &lt;/footer&gt;
     */
    public void footer(StructureAttributes attributes, HTMLSlot slot) {
        tag("footer", null, attributes, slot);
    }

    /**
     * The footer tag in HTML is used to define a footer of HTML document. This section contains the footer information.
     * hint: &lt;footer&gt; … &lt;/footer&gt;
     */
    public void footer(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("footer", classes, attributes, slot);
    }

    /**
     * This form is used basically for the registration process, logging into your profile on a website or creating your profile on a website, etc …
     * hint: &lt;form&gt; Form Content… &lt;/form&gt;
     */
    public void form(HTMLSlot slot) {
        tag("form", null, null, slot);
    }

    /**
     * This form is used basically for the registration process, logging into your profile on a website or creating your profile on a website, etc …
     * hint: &lt;form&gt; Form Content… &lt;/form&gt;
     */
    public void form(String classes, HTMLSlot slot) {
        tag("form", classes, null, slot);
    }

    /**
     * This form is used basically for the registration process, logging into your profile on a website or creating your profile on a website, etc …
     * hint: &lt;form&gt; Form Content… &lt;/form&gt;
     */
    public void form(StructureAttributes attributes, HTMLSlot slot) {
        tag("form", null, attributes, slot);
    }

    /**
     * This form is used basically for the registration process, logging into your profile on a website or creating your profile on a website, etc …
     * hint: &lt;form&gt; Form Content… &lt;/form&gt;
     */
    public void form(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("form", classes, attributes, slot);
    }

    /**
     * HTML Frames are used to divide the web browser window into multiple sections. Not supported in HTML5.
     * hint: &lt;frame/&gt;
     */
    public void frame(HTMLSlot slot) {
        tag("frame", null, null, slot);
    }

    /**
     * HTML Frames are used to divide the web browser window into multiple sections. Not supported in HTML5.
     * hint: &lt;frame/&gt;
     */
    public void frame(String classes, HTMLSlot slot) {
        tag("frame", classes, null, slot);
    }

    /**
     * HTML Frames are used to divide the web browser window into multiple sections. Not supported in HTML5.
     * hint: &lt;frame/&gt;
     */
    public void frame(StructureAttributes attributes, HTMLSlot slot) {
        tag("frame", null, attributes, slot);
    }

    /**
     * HTML Frames are used to divide the web browser window into multiple sections. Not supported in HTML5.
     * hint: &lt;frame/&gt;
     */
    public void frame(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("frame", classes, attributes, slot);
    }

    /**
     * The frameset element contains one or more frame elements. It is used to specify the number of rows and columns in a frameset with their pixel of spaces.
     * hint: &lt;frameset cols = “pixels|%|*”&gt;
     */
    public void frameset(HTMLSlot slot) {
        tag("frameset", null, null, slot);
    }

    /**
     * The frameset element contains one or more frame elements. It is used to specify the number of rows and columns in a frameset with their pixel of spaces.
     * hint: &lt;frameset cols = “pixels|%|*”&gt;
     */
    public void frameset(String classes, HTMLSlot slot) {
        tag("frameset", classes, null, slot);
    }

    /**
     * The frameset element contains one or more frame elements. It is used to specify the number of rows and columns in a frameset with their pixel of spaces.
     * hint: &lt;frameset cols = “pixels|%|*”&gt;
     */
    public void frameset(StructureAttributes attributes, HTMLSlot slot) {
        tag("frameset", null, attributes, slot);
    }

    /**
     * The frameset element contains one or more frame elements. It is used to specify the number of rows and columns in a frameset with their pixel of spaces.
     * hint: &lt;frameset cols = “pixels|%|*”&gt;
     */
    public void frameset(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("frameset", classes, attributes, slot);
    }

    /**
     * The head tag in HTML is used to define the head portion of the document which contains information related to the document.
     * hint: &lt;head&gt;…&lt;/head&gt;
     */
    public void head(HTMLSlot slot) {
        tag("head", null, null, slot);
    }

    /**
     * The head tag in HTML is used to define the head portion of the document which contains information related to the document.
     * hint: &lt;head&gt;…&lt;/head&gt;
     */
    public void head(String classes, HTMLSlot slot) {
        tag("head", classes, null, slot);
    }

    /**
     * The head tag in HTML is used to define the head portion of the document which contains information related to the document.
     * hint: &lt;head&gt;…&lt;/head&gt;
     */
    public void head(StructureAttributes attributes, HTMLSlot slot) {
        tag("head", null, attributes, slot);
    }

    /**
     * The head tag in HTML is used to define the head portion of the document which contains information related to the document.
     * hint: &lt;head&gt;…&lt;/head&gt;
     */
    public void head(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("head", classes, attributes, slot);
    }

    /**
     * The header tag is used to contain the information related to the title and heading of the related content.
     * hint: &lt;header&gt; …&lt;/header&gt;
     */
    public void header(HTMLSlot slot) {
        tag("header", null, null, slot);
    }

    /**
     * The header tag is used to contain the information related to the title and heading of the related content.
     * hint: &lt;header&gt; …&lt;/header&gt;
     */
    public void header(String classes, HTMLSlot slot) {
        tag("header", classes, null, slot);
    }

    /**
     * The header tag is used to contain the information related to the title and heading of the related content.
     * hint: &lt;header&gt; …&lt;/header&gt;
     */
    public void header(StructureAttributes attributes, HTMLSlot slot) {
        tag("header", null, attributes, slot);
    }

    /**
     * The header tag is used to contain the information related to the title and heading of the related content.
     * hint: &lt;header&gt; …&lt;/header&gt;
     */
    public void header(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("header", classes, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h1(HTMLSlot slot) {
        tag("h1", null, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h1(String classes, HTMLSlot slot) {
        tag("h1", classes, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h1(StructureAttributes attributes, HTMLSlot slot) {
        tag("h1", null, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h1(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("h1", classes, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h2(HTMLSlot slot) {
        tag("h2", null, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h2(String classes, HTMLSlot slot) {
        tag("h2", classes, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h2(StructureAttributes attributes, HTMLSlot slot) {
        tag("h2", null, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h2(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("h2", classes, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h3(HTMLSlot slot) {
        tag("h3", null, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h3(String classes, HTMLSlot slot) {
        tag("h3", classes, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h3(StructureAttributes attributes, HTMLSlot slot) {
        tag("h3", null, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h3(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("h3", classes, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h4(HTMLSlot slot) {
        tag("h4", null, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h4(String classes, HTMLSlot slot) {
        tag("h4", classes, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h4(StructureAttributes attributes, HTMLSlot slot) {
        tag("h4", null, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h4(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("h4", classes, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h5(HTMLSlot slot) {
        tag("h5", null, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h5(String classes, HTMLSlot slot) {
        tag("h5", classes, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h5(StructureAttributes attributes, HTMLSlot slot) {
        tag("h5", null, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h5(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("h5", classes, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h6(HTMLSlot slot) {
        tag("h6", null, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h6(String classes, HTMLSlot slot) {
        tag("h6", classes, null, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h6(StructureAttributes attributes, HTMLSlot slot) {
        tag("h6", null, attributes, slot);
    }

    /**
     * An HTML heading tag is used to define the headings of a page.
     * hint: &lt;h1&gt;Heading1&lt;/h1&gt;&lt;h2&gt;Heading2&lt;/h2&gt;
     */
    public void h6(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("h6", classes, attributes, slot);
    }

    /**
     * The hgroup tag in HTML is used to wrap one or more heading elements from &lt;h1&gt; to &lt;h6&gt;, such as the headings and sub-headings.
     * hint: &lt;hgroup&gt; … &lt;/hgroup&gt;
     */
    public void hgroup(HTMLSlot slot) {
        tag("hgroup", null, null, slot);
    }

    /**
     * The hgroup tag in HTML is used to wrap one or more heading elements from &lt;h1&gt; to &lt;h6&gt;, such as the headings and sub-headings.
     * hint: &lt;hgroup&gt; … &lt;/hgroup&gt;
     */
    public void hgroup(String classes, HTMLSlot slot) {
        tag("hgroup", classes, null, slot);
    }

    /**
     * The hgroup tag in HTML is used to wrap one or more heading elements from &lt;h1&gt; to &lt;h6&gt;, such as the headings and sub-headings.
     * hint: &lt;hgroup&gt; … &lt;/hgroup&gt;
     */
    public void hgroup(StructureAttributes attributes, HTMLSlot slot) {
        tag("hgroup", null, attributes, slot);
    }

    /**
     * The hgroup tag in HTML is used to wrap one or more heading elements from &lt;h1&gt; to &lt;h6&gt;, such as the headings and sub-headings.
     * hint: &lt;hgroup&gt; … &lt;/hgroup&gt;
     */
    public void hgroup(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("hgroup", classes, attributes, slot);
    }

    /**
     * The hr tag in HTML stands for horizontal rule and is used to insert a horizontal rule.
     * hint: &lt;hr&gt;
     */
    public void hr(HTMLSlot slot) {
        tag("hr", null, null, slot);
    }

    /**
     * The hr tag in HTML stands for horizontal rule and is used to insert a horizontal rule.
     * hint: &lt;hr&gt;
     */
    public void hr(String classes, HTMLSlot slot) {
        tag("hr", classes, null, slot);
    }

    /**
     * The hr tag in HTML stands for horizontal rule and is used to insert a horizontal rule.
     * hint: &lt;hr&gt;
     */
    public void hr(StructureAttributes attributes, HTMLSlot slot) {
        tag("hr", null, attributes, slot);
    }

    /**
     * The hr tag in HTML stands for horizontal rule and is used to insert a horizontal rule.
     * hint: &lt;hr&gt;
     */
    public void hr(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("hr", classes, attributes, slot);
    }

    /**
     * The html tag in HTML is used to define the root of HTML and XHTML documents.
     * hint: &lt;html&gt; Contents &lt;/html&gt;
     */
    public void html(HTMLSlot slot) {
        tag("html", null, null, slot);
    }

    /**
     * The html tag in HTML is used to define the root of HTML and XHTML documents.
     * hint: &lt;html&gt; Contents &lt;/html&gt;
     */
    public void html(String classes, HTMLSlot slot) {
        tag("html", classes, null, slot);
    }

    /**
     * The html tag in HTML is used to define the root of HTML and XHTML documents.
     * hint: &lt;html&gt; Contents &lt;/html&gt;
     */
    public void html(StructureAttributes attributes, HTMLSlot slot) {
        tag("html", null, attributes, slot);
    }

    /**
     * The html tag in HTML is used to define the root of HTML and XHTML documents.
     * hint: &lt;html&gt; Contents &lt;/html&gt;
     */
    public void html(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("html", classes, attributes, slot);
    }

    /**
     * The iframe tag defines a rectangular region within the document in which the browser can display a separate document.
     * hint: &lt;iframe src=”URL” title=”description”&gt;&lt;/iframe&gt;
     */
    public void iframe(HTMLSlot slot) {
        tag("iframe", null, null, slot);
    }

    /**
     * The iframe tag defines a rectangular region within the document in which the browser can display a separate document.
     * hint: &lt;iframe src=”URL” title=”description”&gt;&lt;/iframe&gt;
     */
    public void iframe(String classes, HTMLSlot slot) {
        tag("iframe", classes, null, slot);
    }

    /**
     * The iframe tag defines a rectangular region within the document in which the browser can display a separate document.
     * hint: &lt;iframe src=”URL” title=”description”&gt;&lt;/iframe&gt;
     */
    public void iframe(StructureAttributes attributes, HTMLSlot slot) {
        tag("iframe", null, attributes, slot);
    }

    /**
     * The iframe tag defines a rectangular region within the document in which the browser can display a separate document.
     * hint: &lt;iframe src=”URL” title=”description”&gt;&lt;/iframe&gt;
     */
    public void iframe(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("iframe", classes, attributes, slot);
    }

    /**
     * HTML Image, how to add the image in HTML. In earlier times, the web pages only contains textual content, which made them appear quite boring and uninteresting.
     * hint: &lt;img src=”url” alt=”some_text” width=”” height=””&gt;
     */
    public void img(HTMLSlot slot) {
        tag("img", null, null, slot);
    }

    /**
     * HTML Image, how to add the image in HTML. In earlier times, the web pages only contains textual content, which made them appear quite boring and uninteresting.
     * hint: &lt;img src=”url” alt=”some_text” width=”” height=””&gt;
     */
    public void img(String classes, HTMLSlot slot) {
        tag("img", classes, null, slot);
    }

    /**
     * HTML Image, how to add the image in HTML. In earlier times, the web pages only contains textual content, which made them appear quite boring and uninteresting.
     * hint: &lt;img src=”url” alt=”some_text” width=”” height=””&gt;
     */
    public void img(StructureAttributes attributes, HTMLSlot slot) {
        tag("img", null, attributes, slot);
    }

    /**
     * HTML Image, how to add the image in HTML. In earlier times, the web pages only contains textual content, which made them appear quite boring and uninteresting.
     * hint: &lt;img src=”url” alt=”some_text” width=”” height=””&gt;
     */
    public void img(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("img", classes, attributes, slot);
    }

    /**
     * The input tag is used within &lt; form&gt; element to declare input controls that allow users to input data.
     * hint: &lt;input type = “value” …. /&gt;
     */
    public void input(HTMLSlot slot) {
        tag("input", null, null, slot);
    }

    /**
     * The input tag is used within &lt; form&gt; element to declare input controls that allow users to input data.
     * hint: &lt;input type = “value” …. /&gt;
     */
    public void input(String classes, HTMLSlot slot) {
        tag("input", classes, null, slot);
    }

    /**
     * The input tag is used within &lt; form&gt; element to declare input controls that allow users to input data.
     * hint: &lt;input type = “value” …. /&gt;
     */
    public void input(StructureAttributes attributes, HTMLSlot slot) {
        tag("input", null, attributes, slot);
    }

    /**
     * The input tag is used within &lt; form&gt; element to declare input controls that allow users to input data.
     * hint: &lt;input type = “value” …. /&gt;
     */
    public void input(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("input", classes, attributes, slot);
    }

    /**
     * The ins tag is typically used to mark a range of text that has been added to the document.
     * hint: &lt;ins&gt; Contents… &lt;/ins&gt;
     */
    public void ins(HTMLSlot slot) {
        tag("ins", null, null, slot);
    }

    /**
     * The ins tag is typically used to mark a range of text that has been added to the document.
     * hint: &lt;ins&gt; Contents… &lt;/ins&gt;
     */
    public void ins(String classes, HTMLSlot slot) {
        tag("ins", classes, null, slot);
    }

    /**
     * The ins tag is typically used to mark a range of text that has been added to the document.
     * hint: &lt;ins&gt; Contents… &lt;/ins&gt;
     */
    public void ins(StructureAttributes attributes, HTMLSlot slot) {
        tag("ins", null, attributes, slot);
    }

    /**
     * The ins tag is typically used to mark a range of text that has been added to the document.
     * hint: &lt;ins&gt; Contents… &lt;/ins&gt;
     */
    public void ins(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("ins", classes, attributes, slot);
    }

    /**
     * The index tag is used to query any document through a text field.
     * hint: &lt;isindex prompt=”search”&gt;
     */
    public void isindex(HTMLSlot slot) {
        tag("isindex", null, null, slot);
    }

    /**
     * The index tag is used to query any document through a text field.
     * hint: &lt;isindex prompt=”search”&gt;
     */
    public void isindex(String classes, HTMLSlot slot) {
        tag("isindex", classes, null, slot);
    }

    /**
     * The index tag is used to query any document through a text field.
     * hint: &lt;isindex prompt=”search”&gt;
     */
    public void isindex(StructureAttributes attributes, HTMLSlot slot) {
        tag("isindex", null, attributes, slot);
    }

    /**
     * The index tag is used to query any document through a text field.
     * hint: &lt;isindex prompt=”search”&gt;
     */
    public void isindex(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("isindex", classes, attributes, slot);
    }

    /**
     * This tag is generally used to display a technical term, phrase, the important word in a different language.
     * hint: &lt;i&gt; Contents&lt;/i&gt;
     */
    public void i(HTMLSlot slot) {
        tag("i", null, null, slot);
    }

    /**
     * This tag is generally used to display a technical term, phrase, the important word in a different language.
     * hint: &lt;i&gt; Contents&lt;/i&gt;
     */
    public void i(String classes, HTMLSlot slot) {
        tag("i", classes, null, slot);
    }

    /**
     * This tag is generally used to display a technical term, phrase, the important word in a different language.
     * hint: &lt;i&gt; Contents&lt;/i&gt;
     */
    public void i(StructureAttributes attributes, HTMLSlot slot) {
        tag("i", null, attributes, slot);
    }

    /**
     * This tag is generally used to display a technical term, phrase, the important word in a different language.
     * hint: &lt;i&gt; Contents&lt;/i&gt;
     */
    public void i(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("i", classes, attributes, slot);
    }

    /**
     * The text enclosed within kbd tag is typically displayed in the browser’s default monospace font.
     * hint: &lt;kbd&gt; text content … &lt;/kbd&gt;
     */
    public void kbd(HTMLSlot slot) {
        tag("kbd", null, null, slot);
    }

    /**
     * The text enclosed within kbd tag is typically displayed in the browser’s default monospace font.
     * hint: &lt;kbd&gt; text content … &lt;/kbd&gt;
     */
    public void kbd(String classes, HTMLSlot slot) {
        tag("kbd", classes, null, slot);
    }

    /**
     * The text enclosed within kbd tag is typically displayed in the browser’s default monospace font.
     * hint: &lt;kbd&gt; text content … &lt;/kbd&gt;
     */
    public void kbd(StructureAttributes attributes, HTMLSlot slot) {
        tag("kbd", null, attributes, slot);
    }

    /**
     * The text enclosed within kbd tag is typically displayed in the browser’s default monospace font.
     * hint: &lt;kbd&gt; text content … &lt;/kbd&gt;
     */
    public void kbd(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("kbd", classes, attributes, slot);
    }

    /**
     * The keygen tag in HTML is used to specify a key-pair generator field in a form. When a form is submitted then two keys are generated, the private key and a public key.
     * hint: &lt;keygen name = “name”&gt;
     */
    public void keygen(HTMLSlot slot) {
        tag("keygen", null, null, slot);
    }

    /**
     * The keygen tag in HTML is used to specify a key-pair generator field in a form. When a form is submitted then two keys are generated, the private key and a public key.
     * hint: &lt;keygen name = “name”&gt;
     */
    public void keygen(String classes, HTMLSlot slot) {
        tag("keygen", classes, null, slot);
    }

    /**
     * The keygen tag in HTML is used to specify a key-pair generator field in a form. When a form is submitted then two keys are generated, the private key and a public key.
     * hint: &lt;keygen name = “name”&gt;
     */
    public void keygen(StructureAttributes attributes, HTMLSlot slot) {
        tag("keygen", null, attributes, slot);
    }

    /**
     * The keygen tag in HTML is used to specify a key-pair generator field in a form. When a form is submitted then two keys are generated, the private key and a public key.
     * hint: &lt;keygen name = “name”&gt;
     */
    public void keygen(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("keygen", classes, attributes, slot);
    }

    /**
     * The label tag in HTML is used to provide a usability improvement for mouse users.
     * hint: &lt;label&gt; form content… &lt;/label&gt;
     */
    public void label(HTMLSlot slot) {
        tag("label", null, null, slot);
    }

    /**
     * The label tag in HTML is used to provide a usability improvement for mouse users.
     * hint: &lt;label&gt; form content… &lt;/label&gt;
     */
    public void label(String classes, HTMLSlot slot) {
        tag("label", classes, null, slot);
    }

    /**
     * The label tag in HTML is used to provide a usability improvement for mouse users.
     * hint: &lt;label&gt; form content… &lt;/label&gt;
     */
    public void label(StructureAttributes attributes, HTMLSlot slot) {
        tag("label", null, attributes, slot);
    }

    /**
     * The label tag in HTML is used to provide a usability improvement for mouse users.
     * hint: &lt;label&gt; form content… &lt;/label&gt;
     */
    public void label(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("label", classes, attributes, slot);
    }

    /**
     * The legend tag is used to define the title for the child contents. The legend elements are the parent element.
     * hint: &lt;legend&gt; Text &lt;/legend&gt;
     */
    public void legend(HTMLSlot slot) {
        tag("legend", null, null, slot);
    }

    /**
     * The legend tag is used to define the title for the child contents. The legend elements are the parent element.
     * hint: &lt;legend&gt; Text &lt;/legend&gt;
     */
    public void legend(String classes, HTMLSlot slot) {
        tag("legend", classes, null, slot);
    }

    /**
     * The legend tag is used to define the title for the child contents. The legend elements are the parent element.
     * hint: &lt;legend&gt; Text &lt;/legend&gt;
     */
    public void legend(StructureAttributes attributes, HTMLSlot slot) {
        tag("legend", null, attributes, slot);
    }

    /**
     * The legend tag is used to define the title for the child contents. The legend elements are the parent element.
     * hint: &lt;legend&gt; Text &lt;/legend&gt;
     */
    public void legend(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("legend", classes, attributes, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ol(HTMLSlot slot) {
        tag("ol", null, null, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ol(String classes, HTMLSlot slot) {
        tag("ol", classes, null, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ol(StructureAttributes attributes, HTMLSlot slot) {
        tag("ol", null, attributes, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ol(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("ol", classes, attributes, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ul(HTMLSlot slot) {
        tag("ul", null, null, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ul(String classes, HTMLSlot slot) {
        tag("ul", classes, null, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ul(StructureAttributes attributes, HTMLSlot slot) {
        tag("ul", null, attributes, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void ul(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("ul", classes, attributes, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void li(HTMLSlot slot) {
        tag("li", null, null, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void li(String classes, HTMLSlot slot) {
        tag("li", classes, null, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void li(StructureAttributes attributes, HTMLSlot slot) {
        tag("li", null, attributes, slot);
    }

    /**
     * The list tag in HTML is used to define the list item in an HTML document. It is used within an Ordered List &lt;ol&gt; or Unordered List &lt;ul&gt;.
     * hint: &lt;li&gt; List Items &lt;/li&gt;
     */
    public void li(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("li", classes, attributes, slot);
    }

    /**
     * The main tag is used to give the main information of a document. The content inside the &lt;main&gt; element should be unique for the document.
     * hint: &lt;main&gt;Coontents&lt;/main&gt;
     */
    public void main(HTMLSlot slot) {
        tag("main", null, null, slot);
    }

    /**
     * The main tag is used to give the main information of a document. The content inside the &lt;main&gt; element should be unique for the document.
     * hint: &lt;main&gt;Coontents&lt;/main&gt;
     */
    public void main(String classes, HTMLSlot slot) {
        tag("main", classes, null, slot);
    }

    /**
     * The main tag is used to give the main information of a document. The content inside the &lt;main&gt; element should be unique for the document.
     * hint: &lt;main&gt;Coontents&lt;/main&gt;
     */
    public void main(StructureAttributes attributes, HTMLSlot slot) {
        tag("main", null, attributes, slot);
    }

    /**
     * The main tag is used to give the main information of a document. The content inside the &lt;main&gt; element should be unique for the document.
     * hint: &lt;main&gt;Coontents&lt;/main&gt;
     */
    public void main(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("main", classes, attributes, slot);
    }

    /**
     * The mark tag in HTML is used to define the marked text. It is used to highlight the part of the text in a paragraph.
     * hint: &lt;mark&gt; Contents… &lt;/mark&gt;
     */
    public void mark(HTMLSlot slot) {
        tag("mark", null, null, slot);
    }

    /**
     * The mark tag in HTML is used to define the marked text. It is used to highlight the part of the text in a paragraph.
     * hint: &lt;mark&gt; Contents… &lt;/mark&gt;
     */
    public void mark(String classes, HTMLSlot slot) {
        tag("mark", classes, null, slot);
    }

    /**
     * The mark tag in HTML is used to define the marked text. It is used to highlight the part of the text in a paragraph.
     * hint: &lt;mark&gt; Contents… &lt;/mark&gt;
     */
    public void mark(StructureAttributes attributes, HTMLSlot slot) {
        tag("mark", null, attributes, slot);
    }

    /**
     * The mark tag in HTML is used to define the marked text. It is used to highlight the part of the text in a paragraph.
     * hint: &lt;mark&gt; Contents… &lt;/mark&gt;
     */
    public void mark(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("mark", classes, attributes, slot);
    }

    /**
     * The marquee tag in HTML is used to create scrolling text or images on a webpage. It scrolls either horizontally or vertically.
     * hint: &lt;marquee&gt;Contents&lt;/marquee&gt;
     */
    public void marquee(HTMLSlot slot) {
        tag("marquee", null, null, slot);
    }

    /**
     * The marquee tag in HTML is used to create scrolling text or images on a webpage. It scrolls either horizontally or vertically.
     * hint: &lt;marquee&gt;Contents&lt;/marquee&gt;
     */
    public void marquee(String classes, HTMLSlot slot) {
        tag("marquee", classes, null, slot);
    }

    /**
     * The marquee tag in HTML is used to create scrolling text or images on a webpage. It scrolls either horizontally or vertically.
     * hint: &lt;marquee&gt;Contents&lt;/marquee&gt;
     */
    public void marquee(StructureAttributes attributes, HTMLSlot slot) {
        tag("marquee", null, attributes, slot);
    }

    /**
     * The marquee tag in HTML is used to create scrolling text or images on a webpage. It scrolls either horizontally or vertically.
     * hint: &lt;marquee&gt;Contents&lt;/marquee&gt;
     */
    public void marquee(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("marquee", classes, attributes, slot);
    }

    /**
     * The menuitem tag is used to define a command or menu that the user can utilize from the popup item. Not supported in HTML5.
     * hint: &lt;menuitem label=”” icon=”” type&gt; &lt;/menuitem&gt;
     */
    public void menuitem(HTMLSlot slot) {
        tag("menuitem", null, null, slot);
    }

    /**
     * The menuitem tag is used to define a command or menu that the user can utilize from the popup item. Not supported in HTML5.
     * hint: &lt;menuitem label=”” icon=”” type&gt; &lt;/menuitem&gt;
     */
    public void menuitem(String classes, HTMLSlot slot) {
        tag("menuitem", classes, null, slot);
    }

    /**
     * The menuitem tag is used to define a command or menu that the user can utilize from the popup item. Not supported in HTML5.
     * hint: &lt;menuitem label=”” icon=”” type&gt; &lt;/menuitem&gt;
     */
    public void menuitem(StructureAttributes attributes, HTMLSlot slot) {
        tag("menuitem", null, attributes, slot);
    }

    /**
     * The menuitem tag is used to define a command or menu that the user can utilize from the popup item. Not supported in HTML5.
     * hint: &lt;menuitem label=”” icon=”” type&gt; &lt;/menuitem&gt;
     */
    public void menuitem(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("menuitem", classes, attributes, slot);
    }

    /**
     * The meta tag is regularly used to give watchwords, portrayals, author data, and other metadata that might be utilized by the program to deliver the document accurately or in simple words, it provides important information about a document.
     * hint: &lt;meta attribute-name=”value”&gt;
     */
    public void meta(HTMLSlot slot) {
        tag("meta", null, null, slot);
    }

    /**
     * The meta tag is regularly used to give watchwords, portrayals, author data, and other metadata that might be utilized by the program to deliver the document accurately or in simple words, it provides important information about a document.
     * hint: &lt;meta attribute-name=”value”&gt;
     */
    public void meta(String classes, HTMLSlot slot) {
        tag("meta", classes, null, slot);
    }

    /**
     * The meta tag is regularly used to give watchwords, portrayals, author data, and other metadata that might be utilized by the program to deliver the document accurately or in simple words, it provides important information about a document.
     * hint: &lt;meta attribute-name=”value”&gt;
     */
    public void meta(StructureAttributes attributes, HTMLSlot slot) {
        tag("meta", null, attributes, slot);
    }

    /**
     * The meta tag is regularly used to give watchwords, portrayals, author data, and other metadata that might be utilized by the program to deliver the document accurately or in simple words, it provides important information about a document.
     * hint: &lt;meta attribute-name=”value”&gt;
     */
    public void meta(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("meta", classes, attributes, slot);
    }

    /**
     * It is used to define the scale for measurement in a well-defined range and also supports a fractional value.
     * hint: &lt;meter attributes…&gt; &lt;/meter&gt;
     */
    public void meter(HTMLSlot slot) {
        tag("meter", null, null, slot);
    }

    /**
     * It is used to define the scale for measurement in a well-defined range and also supports a fractional value.
     * hint: &lt;meter attributes…&gt; &lt;/meter&gt;
     */
    public void meter(String classes, HTMLSlot slot) {
        tag("meter", classes, null, slot);
    }

    /**
     * It is used to define the scale for measurement in a well-defined range and also supports a fractional value.
     * hint: &lt;meter attributes…&gt; &lt;/meter&gt;
     */
    public void meter(StructureAttributes attributes, HTMLSlot slot) {
        tag("meter", null, attributes, slot);
    }

    /**
     * It is used to define the scale for measurement in a well-defined range and also supports a fractional value.
     * hint: &lt;meter attributes…&gt; &lt;/meter&gt;
     */
    public void meter(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("meter", classes, attributes, slot);
    }

    /**
     * The nav tag is used for declaring the navigational section in HTML documents. Websites typically have sections dedicated to navigational links, which enables users to navigate the site.
     * hint: &lt;nav&gt; Links… &lt;/nav&gt;
     */
    public void nav(HTMLSlot slot) {
        tag("nav", null, null, slot);
    }

    /**
     * The nav tag is used for declaring the navigational section in HTML documents. Websites typically have sections dedicated to navigational links, which enables users to navigate the site.
     * hint: &lt;nav&gt; Links… &lt;/nav&gt;
     */
    public void nav(String classes, HTMLSlot slot) {
        tag("nav", classes, null, slot);
    }

    /**
     * The nav tag is used for declaring the navigational section in HTML documents. Websites typically have sections dedicated to navigational links, which enables users to navigate the site.
     * hint: &lt;nav&gt; Links… &lt;/nav&gt;
     */
    public void nav(StructureAttributes attributes, HTMLSlot slot) {
        tag("nav", null, attributes, slot);
    }

    /**
     * The nav tag is used for declaring the navigational section in HTML documents. Websites typically have sections dedicated to navigational links, which enables users to navigate the site.
     * hint: &lt;nav&gt; Links… &lt;/nav&gt;
     */
    public void nav(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("nav", classes, attributes, slot);
    }

    /**
     * The no break tag is used to create a single line text, that does not matter how long the statement is, this tag is used with &lt;wbr&gt; tag.
     * hint: &lt;nobr&gt; Statement &lt;/nobr&gt;
     */
    public void nobr(HTMLSlot slot) {
        tag("nobr", null, null, slot);
    }

    /**
     * The no break tag is used to create a single line text, that does not matter how long the statement is, this tag is used with &lt;wbr&gt; tag.
     * hint: &lt;nobr&gt; Statement &lt;/nobr&gt;
     */
    public void nobr(String classes, HTMLSlot slot) {
        tag("nobr", classes, null, slot);
    }

    /**
     * The no break tag is used to create a single line text, that does not matter how long the statement is, this tag is used with &lt;wbr&gt; tag.
     * hint: &lt;nobr&gt; Statement &lt;/nobr&gt;
     */
    public void nobr(StructureAttributes attributes, HTMLSlot slot) {
        tag("nobr", null, attributes, slot);
    }

    /**
     * The no break tag is used to create a single line text, that does not matter how long the statement is, this tag is used with &lt;wbr&gt; tag.
     * hint: &lt;nobr&gt; Statement &lt;/nobr&gt;
     */
    public void nobr(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("nobr", classes, attributes, slot);
    }

    /**
     * The noembed tag is used to show that the browser is not supported by &lt;embed&gt; tag.
     * hint: &lt;noembed&gt; Element &lt;/noembed&gt;
     */
    public void noembed(HTMLSlot slot) {
        tag("noembed", null, null, slot);
    }

    /**
     * The noembed tag is used to show that the browser is not supported by &lt;embed&gt; tag.
     * hint: &lt;noembed&gt; Element &lt;/noembed&gt;
     */
    public void noembed(String classes, HTMLSlot slot) {
        tag("noembed", classes, null, slot);
    }

    /**
     * The noembed tag is used to show that the browser is not supported by &lt;embed&gt; tag.
     * hint: &lt;noembed&gt; Element &lt;/noembed&gt;
     */
    public void noembed(StructureAttributes attributes, HTMLSlot slot) {
        tag("noembed", null, attributes, slot);
    }

    /**
     * The noembed tag is used to show that the browser is not supported by &lt;embed&gt; tag.
     * hint: &lt;noembed&gt; Element &lt;/noembed&gt;
     */
    public void noembed(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("noembed", classes, attributes, slot);
    }

    /**
     * The noscript tag in HTML is used to display the text for those browsers which does not support the script tag or the browsers disable the script by the user.
     * hint: &lt;noscript&gt; Contents… &lt;/noscript&gt;
     */
    public void noscript(HTMLSlot slot) {
        tag("noscript", null, null, slot);
    }

    /**
     * The noscript tag in HTML is used to display the text for those browsers which does not support the script tag or the browsers disable the script by the user.
     * hint: &lt;noscript&gt; Contents… &lt;/noscript&gt;
     */
    public void noscript(String classes, HTMLSlot slot) {
        tag("noscript", classes, null, slot);
    }

    /**
     * The noscript tag in HTML is used to display the text for those browsers which does not support the script tag or the browsers disable the script by the user.
     * hint: &lt;noscript&gt; Contents… &lt;/noscript&gt;
     */
    public void noscript(StructureAttributes attributes, HTMLSlot slot) {
        tag("noscript", null, attributes, slot);
    }

    /**
     * The noscript tag in HTML is used to display the text for those browsers which does not support the script tag or the browsers disable the script by the user.
     * hint: &lt;noscript&gt; Contents… &lt;/noscript&gt;
     */
    public void noscript(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("noscript", classes, attributes, slot);
    }

    /**
     * The object tag is an HTML tag used to display multimedia like audio, videos, images, PDFs, and Flash on web pages.
     * hint: &lt;object&gt;…&lt;/object&gt;
     */
    public void object(HTMLSlot slot) {
        tag("object", null, null, slot);
    }

    /**
     * The object tag is an HTML tag used to display multimedia like audio, videos, images, PDFs, and Flash on web pages.
     * hint: &lt;object&gt;…&lt;/object&gt;
     */
    public void object(String classes, HTMLSlot slot) {
        tag("object", classes, null, slot);
    }

    /**
     * The object tag is an HTML tag used to display multimedia like audio, videos, images, PDFs, and Flash on web pages.
     * hint: &lt;object&gt;…&lt;/object&gt;
     */
    public void object(StructureAttributes attributes, HTMLSlot slot) {
        tag("object", null, attributes, slot);
    }

    /**
     * The object tag is an HTML tag used to display multimedia like audio, videos, images, PDFs, and Flash on web pages.
     * hint: &lt;object&gt;…&lt;/object&gt;
     */
    public void object(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("object", classes, attributes, slot);
    }

    /**
     * This tag is used to create a group of the same category options in a drop-down list.
     * hint: &lt;optgroup&gt;…&lt;/optgroup&gt;
     */
    public void optgroup(HTMLSlot slot) {
        tag("optgroup", null, null, slot);
    }

    /**
     * This tag is used to create a group of the same category options in a drop-down list.
     * hint: &lt;optgroup&gt;…&lt;/optgroup&gt;
     */
    public void optgroup(String classes, HTMLSlot slot) {
        tag("optgroup", classes, null, slot);
    }

    /**
     * This tag is used to create a group of the same category options in a drop-down list.
     * hint: &lt;optgroup&gt;…&lt;/optgroup&gt;
     */
    public void optgroup(StructureAttributes attributes, HTMLSlot slot) {
        tag("optgroup", null, attributes, slot);
    }

    /**
     * This tag is used to create a group of the same category options in a drop-down list.
     * hint: &lt;optgroup&gt;…&lt;/optgroup&gt;
     */
    public void optgroup(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("optgroup", classes, attributes, slot);
    }

    /**
     * The option tag in HTML is used to choose an option from a Drop-Down menu.
     * hint: &lt;option&gt; Contents… &lt;/option&gt;
     */
    public void option(HTMLSlot slot) {
        tag("option", null, null, slot);
    }

    /**
     * The option tag in HTML is used to choose an option from a Drop-Down menu.
     * hint: &lt;option&gt; Contents… &lt;/option&gt;
     */
    public void option(String classes, HTMLSlot slot) {
        tag("option", classes, null, slot);
    }

    /**
     * The option tag in HTML is used to choose an option from a Drop-Down menu.
     * hint: &lt;option&gt; Contents… &lt;/option&gt;
     */
    public void option(StructureAttributes attributes, HTMLSlot slot) {
        tag("option", null, attributes, slot);
    }

    /**
     * The option tag in HTML is used to choose an option from a Drop-Down menu.
     * hint: &lt;option&gt; Contents… &lt;/option&gt;
     */
    public void option(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("option", classes, attributes, slot);
    }

    /**
     * The output tag in HTML is used to represent the result of a calculation performed by the client-side script such as JavaScript.
     * hint: &lt;output&gt; Results… &lt;/output&gt;
     */
    public void output(HTMLSlot slot) {
        tag("output", null, null, slot);
    }

    /**
     * The output tag in HTML is used to represent the result of a calculation performed by the client-side script such as JavaScript.
     * hint: &lt;output&gt; Results… &lt;/output&gt;
     */
    public void output(String classes, HTMLSlot slot) {
        tag("output", classes, null, slot);
    }

    /**
     * The output tag in HTML is used to represent the result of a calculation performed by the client-side script such as JavaScript.
     * hint: &lt;output&gt; Results… &lt;/output&gt;
     */
    public void output(StructureAttributes attributes, HTMLSlot slot) {
        tag("output", null, attributes, slot);
    }

    /**
     * The output tag in HTML is used to represent the result of a calculation performed by the client-side script such as JavaScript.
     * hint: &lt;output&gt; Results… &lt;/output&gt;
     */
    public void output(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("output", classes, attributes, slot);
    }

    /**
     * The &lt;p&gt; tag in HTML defines a paragraph. These have both opening and closing tags.
     * hint: &lt;p&gt; Content &lt;/p&gt;
     */
    public void p(HTMLSlot slot) {
        tag("p", null, null, slot);
    }

    /**
     * The &lt;p&gt; tag in HTML defines a paragraph. These have both opening and closing tags.
     * hint: &lt;p&gt; Content &lt;/p&gt;
     */
    public void p(String classes, HTMLSlot slot) {
        tag("p", classes, null, slot);
    }

    /**
     * The &lt;p&gt; tag in HTML defines a paragraph. These have both opening and closing tags.
     * hint: &lt;p&gt; Content &lt;/p&gt;
     */
    public void p(StructureAttributes attributes, HTMLSlot slot) {
        tag("p", null, attributes, slot);
    }

    /**
     * The &lt;p&gt; tag in HTML defines a paragraph. These have both opening and closing tags.
     * hint: &lt;p&gt; Content &lt;/p&gt;
     */
    public void p(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("p", classes, attributes, slot);
    }

    /**
     * The param tag in HTML is used to define a parameter for plug-ins which is associated with &lt;object&gt; element.
     * hint: &lt;param name=”” value=””&gt;
     */
    public void param(HTMLSlot slot) {
        tag("param", null, null, slot);
    }

    /**
     * The param tag in HTML is used to define a parameter for plug-ins which is associated with &lt;object&gt; element.
     * hint: &lt;param name=”” value=””&gt;
     */
    public void param(String classes, HTMLSlot slot) {
        tag("param", classes, null, slot);
    }

    /**
     * The param tag in HTML is used to define a parameter for plug-ins which is associated with &lt;object&gt; element.
     * hint: &lt;param name=”” value=””&gt;
     */
    public void param(StructureAttributes attributes, HTMLSlot slot) {
        tag("param", null, attributes, slot);
    }

    /**
     * The param tag in HTML is used to define a parameter for plug-ins which is associated with &lt;object&gt; element.
     * hint: &lt;param name=”” value=””&gt;
     */
    public void param(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("param", classes, attributes, slot);
    }

    /**
     * In HTML, phrase tag is used to indicate the structural meaning of a block of text.
     * hint: &lt;em&gt; Text Content &lt;/em&gt;
     */
    public void em(HTMLSlot slot) {
        tag("em", null, null, slot);
    }

    /**
     * In HTML, phrase tag is used to indicate the structural meaning of a block of text.
     * hint: &lt;em&gt; Text Content &lt;/em&gt;
     */
    public void em(String classes, HTMLSlot slot) {
        tag("em", classes, null, slot);
    }

    /**
     * In HTML, phrase tag is used to indicate the structural meaning of a block of text.
     * hint: &lt;em&gt; Text Content &lt;/em&gt;
     */
    public void em(StructureAttributes attributes, HTMLSlot slot) {
        tag("em", null, attributes, slot);
    }

    /**
     * In HTML, phrase tag is used to indicate the structural meaning of a block of text.
     * hint: &lt;em&gt; Text Content &lt;/em&gt;
     */
    public void em(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("em", classes, attributes, slot);
    }

    /**
     * The pre tag in HTML is used to define the block of preformatted text which preserves the text spaces.
     * hint: &lt;pre&gt; Contents… &lt;/pre&gt;
     */
    public void pre(HTMLSlot slot) {
        tag("pre", null, null, slot);
    }

    /**
     * The pre tag in HTML is used to define the block of preformatted text which preserves the text spaces.
     * hint: &lt;pre&gt; Contents… &lt;/pre&gt;
     */
    public void pre(String classes, HTMLSlot slot) {
        tag("pre", classes, null, slot);
    }

    /**
     * The pre tag in HTML is used to define the block of preformatted text which preserves the text spaces.
     * hint: &lt;pre&gt; Contents… &lt;/pre&gt;
     */
    public void pre(StructureAttributes attributes, HTMLSlot slot) {
        tag("pre", null, attributes, slot);
    }

    /**
     * The pre tag in HTML is used to define the block of preformatted text which preserves the text spaces.
     * hint: &lt;pre&gt; Contents… &lt;/pre&gt;
     */
    public void pre(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("pre", classes, attributes, slot);
    }

    /**
     * It is used to represent the progress of a task. It is also defined how much work is done and how much is left to download a thing.
     * hint: &lt;progress attributes…&gt; &lt;/progress&gt;
     */
    public void progress(HTMLSlot slot) {
        tag("progress", null, null, slot);
    }

    /**
     * It is used to represent the progress of a task. It is also defined how much work is done and how much is left to download a thing.
     * hint: &lt;progress attributes…&gt; &lt;/progress&gt;
     */
    public void progress(String classes, HTMLSlot slot) {
        tag("progress", classes, null, slot);
    }

    /**
     * It is used to represent the progress of a task. It is also defined how much work is done and how much is left to download a thing.
     * hint: &lt;progress attributes…&gt; &lt;/progress&gt;
     */
    public void progress(StructureAttributes attributes, HTMLSlot slot) {
        tag("progress", null, attributes, slot);
    }

    /**
     * It is used to represent the progress of a task. It is also defined how much work is done and how much is left to download a thing.
     * hint: &lt;progress attributes…&gt; &lt;/progress&gt;
     */
    public void progress(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("progress", classes, attributes, slot);
    }

    /**
     * The q tag is a standard quotation tag and is used for short quotations.
     * hint: &lt;q&gt; Contents… &lt;/q&gt;
     */
    public void q(HTMLSlot slot) {
        tag("q", null, null, slot);
    }

    /**
     * The q tag is a standard quotation tag and is used for short quotations.
     * hint: &lt;q&gt; Contents… &lt;/q&gt;
     */
    public void q(String classes, HTMLSlot slot) {
        tag("q", classes, null, slot);
    }

    /**
     * The q tag is a standard quotation tag and is used for short quotations.
     * hint: &lt;q&gt; Contents… &lt;/q&gt;
     */
    public void q(StructureAttributes attributes, HTMLSlot slot) {
        tag("q", null, attributes, slot);
    }

    /**
     * The q tag is a standard quotation tag and is used for short quotations.
     * hint: &lt;q&gt; Contents… &lt;/q&gt;
     */
    public void q(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("q", classes, attributes, slot);
    }

    /**
     * The rp tag in HTML is used to provide parentheses around a ruby main text which defines the information.
     * hint: &lt;rp&gt;[&lt;/rp&gt; Explaination… &lt;rp&gt;]&lt;/rp&gt;
     */
    public void rp(HTMLSlot slot) {
        tag("rp", null, null, slot);
    }

    /**
     * The rp tag in HTML is used to provide parentheses around a ruby main text which defines the information.
     * hint: &lt;rp&gt;[&lt;/rp&gt; Explaination… &lt;rp&gt;]&lt;/rp&gt;
     */
    public void rp(String classes, HTMLSlot slot) {
        tag("rp", classes, null, slot);
    }

    /**
     * The rp tag in HTML is used to provide parentheses around a ruby main text which defines the information.
     * hint: &lt;rp&gt;[&lt;/rp&gt; Explaination… &lt;rp&gt;]&lt;/rp&gt;
     */
    public void rp(StructureAttributes attributes, HTMLSlot slot) {
        tag("rp", null, attributes, slot);
    }

    /**
     * The rp tag in HTML is used to provide parentheses around a ruby main text which defines the information.
     * hint: &lt;rp&gt;[&lt;/rp&gt; Explaination… &lt;rp&gt;]&lt;/rp&gt;
     */
    public void rp(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("rp", classes, attributes, slot);
    }

    /**
     * The rt tag in HTML is used to define the explanation of the ruby annotation which is a small text, attached to the main text.
     * hint: &lt;rt&gt; Explanation… &lt;/rt&gt;
     */
    public void rt(HTMLSlot slot) {
        tag("rt", null, null, slot);
    }

    /**
     * The rt tag in HTML is used to define the explanation of the ruby annotation which is a small text, attached to the main text.
     * hint: &lt;rt&gt; Explanation… &lt;/rt&gt;
     */
    public void rt(String classes, HTMLSlot slot) {
        tag("rt", classes, null, slot);
    }

    /**
     * The rt tag in HTML is used to define the explanation of the ruby annotation which is a small text, attached to the main text.
     * hint: &lt;rt&gt; Explanation… &lt;/rt&gt;
     */
    public void rt(StructureAttributes attributes, HTMLSlot slot) {
        tag("rt", null, attributes, slot);
    }

    /**
     * The rt tag in HTML is used to define the explanation of the ruby annotation which is a small text, attached to the main text.
     * hint: &lt;rt&gt; Explanation… &lt;/rt&gt;
     */
    public void rt(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("rt", classes, attributes, slot);
    }

    /**
     * The ruby tag in HTML is used to specify the ruby annotation which is a small text, attached with the main text to specify the meaning of the main text.
     * hint: &lt;ruby attributes&gt; Contents… &lt;/ruby&gt;
     */
    public void ruby(HTMLSlot slot) {
        tag("ruby", null, null, slot);
    }

    /**
     * The ruby tag in HTML is used to specify the ruby annotation which is a small text, attached with the main text to specify the meaning of the main text.
     * hint: &lt;ruby attributes&gt; Contents… &lt;/ruby&gt;
     */
    public void ruby(String classes, HTMLSlot slot) {
        tag("ruby", classes, null, slot);
    }

    /**
     * The ruby tag in HTML is used to specify the ruby annotation which is a small text, attached with the main text to specify the meaning of the main text.
     * hint: &lt;ruby attributes&gt; Contents… &lt;/ruby&gt;
     */
    public void ruby(StructureAttributes attributes, HTMLSlot slot) {
        tag("ruby", null, attributes, slot);
    }

    /**
     * The ruby tag in HTML is used to specify the ruby annotation which is a small text, attached with the main text to specify the meaning of the main text.
     * hint: &lt;ruby attributes&gt; Contents… &lt;/ruby&gt;
     */
    public void ruby(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("ruby", classes, attributes, slot);
    }

    /**
     * This tag is used to specify that the text content is no longer correct or accurate. This tag is similar but slightly different from &lt;del&gt; tag.
     * hint: &lt;s&gt; Contents… &lt;/s&gt;
     */
    public void s(HTMLSlot slot) {
        tag("s", null, null, slot);
    }

    /**
     * This tag is used to specify that the text content is no longer correct or accurate. This tag is similar but slightly different from &lt;del&gt; tag.
     * hint: &lt;s&gt; Contents… &lt;/s&gt;
     */
    public void s(String classes, HTMLSlot slot) {
        tag("s", classes, null, slot);
    }

    /**
     * This tag is used to specify that the text content is no longer correct or accurate. This tag is similar but slightly different from &lt;del&gt; tag.
     * hint: &lt;s&gt; Contents… &lt;/s&gt;
     */
    public void s(StructureAttributes attributes, HTMLSlot slot) {
        tag("s", null, attributes, slot);
    }

    /**
     * This tag is used to specify that the text content is no longer correct or accurate. This tag is similar but slightly different from &lt;del&gt; tag.
     * hint: &lt;s&gt; Contents… &lt;/s&gt;
     */
    public void s(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("s", classes, attributes, slot);
    }

    /**
     * It is a phrase tag used to define the sample output text from a computer program.
     * hint: &lt;samp&gt; Contents… &lt;/samp&gt;
     */
    public void samp(HTMLSlot slot) {
        tag("samp", null, null, slot);
    }

    /**
     * It is a phrase tag used to define the sample output text from a computer program.
     * hint: &lt;samp&gt; Contents… &lt;/samp&gt;
     */
    public void samp(String classes, HTMLSlot slot) {
        tag("samp", classes, null, slot);
    }

    /**
     * It is a phrase tag used to define the sample output text from a computer program.
     * hint: &lt;samp&gt; Contents… &lt;/samp&gt;
     */
    public void samp(StructureAttributes attributes, HTMLSlot slot) {
        tag("samp", null, attributes, slot);
    }

    /**
     * It is a phrase tag used to define the sample output text from a computer program.
     * hint: &lt;samp&gt; Contents… &lt;/samp&gt;
     */
    public void samp(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("samp", classes, attributes, slot);
    }

    /**
     * The script tag in HTML is used to define the client-side script.
     * hint: &lt;script&gt; Script Contents… &lt;/script&gt;
     */
    public void script(HTMLSlot slot) {
        tag("script", null, null, slot);
    }

    /**
     * The script tag in HTML is used to define the client-side script.
     * hint: &lt;script&gt; Script Contents… &lt;/script&gt;
     */
    public void script(String classes, HTMLSlot slot) {
        tag("script", classes, null, slot);
    }

    /**
     * The script tag in HTML is used to define the client-side script.
     * hint: &lt;script&gt; Script Contents… &lt;/script&gt;
     */
    public void script(StructureAttributes attributes, HTMLSlot slot) {
        tag("script", null, attributes, slot);
    }

    /**
     * The script tag in HTML is used to define the client-side script.
     * hint: &lt;script&gt; Script Contents… &lt;/script&gt;
     */
    public void script(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("script", classes, attributes, slot);
    }

    /**
     * Section tag defines the section of documents such as chapters, headers, footers, or any other sections.
     * hint: &lt;section&gt; Section Contents &lt;/section&gt;
     */
    public void section(HTMLSlot slot) {
        tag("section", null, null, slot);
    }

    /**
     * Section tag defines the section of documents such as chapters, headers, footers, or any other sections.
     * hint: &lt;section&gt; Section Contents &lt;/section&gt;
     */
    public void section(String classes, HTMLSlot slot) {
        tag("section", classes, null, slot);
    }

    /**
     * Section tag defines the section of documents such as chapters, headers, footers, or any other sections.
     * hint: &lt;section&gt; Section Contents &lt;/section&gt;
     */
    public void section(StructureAttributes attributes, HTMLSlot slot) {
        tag("section", null, attributes, slot);
    }

    /**
     * Section tag defines the section of documents such as chapters, headers, footers, or any other sections.
     * hint: &lt;section&gt; Section Contents &lt;/section&gt;
     */
    public void section(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("section", classes, attributes, slot);
    }

    /**
     * The small tag in HTML is used to set small font sizes. It decreases the font size by one size (from medium to small, from x-large to large).
     * hint: &lt;small&gt; Contents… &lt;/small&gt;
     */
    public void small(HTMLSlot slot) {
        tag("small", null, null, slot);
    }

    /**
     * The small tag in HTML is used to set small font sizes. It decreases the font size by one size (from medium to small, from x-large to large).
     * hint: &lt;small&gt; Contents… &lt;/small&gt;
     */
    public void small(String classes, HTMLSlot slot) {
        tag("small", classes, null, slot);
    }

    /**
     * The small tag in HTML is used to set small font sizes. It decreases the font size by one size (from medium to small, from x-large to large).
     * hint: &lt;small&gt; Contents… &lt;/small&gt;
     */
    public void small(StructureAttributes attributes, HTMLSlot slot) {
        tag("small", null, attributes, slot);
    }

    /**
     * The small tag in HTML is used to set small font sizes. It decreases the font size by one size (from medium to small, from x-large to large).
     * hint: &lt;small&gt; Contents… &lt;/small&gt;
     */
    public void small(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("small", classes, attributes, slot);
    }

    /**
     * The source tag in HTML is used to attach multimedia files like audio, video, and pictures.
     * hint: &lt;source src=”” type=””&gt; &lt;/source&gt;
     */
    public void source(HTMLSlot slot) {
        tag("source", null, null, slot);
    }

    /**
     * The source tag in HTML is used to attach multimedia files like audio, video, and pictures.
     * hint: &lt;source src=”” type=””&gt; &lt;/source&gt;
     */
    public void source(String classes, HTMLSlot slot) {
        tag("source", classes, null, slot);
    }

    /**
     * The source tag in HTML is used to attach multimedia files like audio, video, and pictures.
     * hint: &lt;source src=”” type=””&gt; &lt;/source&gt;
     */
    public void source(StructureAttributes attributes, HTMLSlot slot) {
        tag("source", null, attributes, slot);
    }

    /**
     * The source tag in HTML is used to attach multimedia files like audio, video, and pictures.
     * hint: &lt;source src=”” type=””&gt; &lt;/source&gt;
     */
    public void source(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("source", classes, attributes, slot);
    }

    /**
     * The spacer tag is used to create some white space. Not-supporte in HTML5 .
     * hint: &lt;spacer type=”” size=””&gt;
     */
    public void spacer(HTMLSlot slot) {
        tag("spacer", null, null, slot);
    }

    /**
     * The spacer tag is used to create some white space. Not-supporte in HTML5 .
     * hint: &lt;spacer type=”” size=””&gt;
     */
    public void spacer(String classes, HTMLSlot slot) {
        tag("spacer", classes, null, slot);
    }

    /**
     * The spacer tag is used to create some white space. Not-supporte in HTML5 .
     * hint: &lt;spacer type=”” size=””&gt;
     */
    public void spacer(StructureAttributes attributes, HTMLSlot slot) {
        tag("spacer", null, attributes, slot);
    }

    /**
     * The spacer tag is used to create some white space. Not-supporte in HTML5 .
     * hint: &lt;spacer type=”” size=””&gt;
     */
    public void spacer(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("spacer", classes, attributes, slot);
    }

    /**
     * The HTML span element is a generic inline container for inline elements and content.
     * hint: &lt;span class=””&gt;Some Text&lt;/span&gt;
     */
    public void span(HTMLSlot slot) {
        tag("span", null, null, slot);
    }

    /**
     * The HTML span element is a generic inline container for inline elements and content.
     * hint: &lt;span class=””&gt;Some Text&lt;/span&gt;
     */
    public void span(String classes, HTMLSlot slot) {
        tag("span", classes, null, slot);
    }

    /**
     * The HTML span element is a generic inline container for inline elements and content.
     * hint: &lt;span class=””&gt;Some Text&lt;/span&gt;
     */
    public void span(StructureAttributes attributes, HTMLSlot slot) {
        tag("span", null, attributes, slot);
    }

    /**
     * The HTML span element is a generic inline container for inline elements and content.
     * hint: &lt;span class=””&gt;Some Text&lt;/span&gt;
     */
    public void span(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("span", classes, attributes, slot);
    }

    /**
     * HTML strike tag, along with understanding its implementation through the example. The &lt;strike&gt; tag defines a strike or line through Text.
     * hint: &lt;strike&gt; Contents &lt;/strike&gt;
     */
    public void strike(HTMLSlot slot) {
        tag("strike", null, null, slot);
    }

    /**
     * HTML strike tag, along with understanding its implementation through the example. The &lt;strike&gt; tag defines a strike or line through Text.
     * hint: &lt;strike&gt; Contents &lt;/strike&gt;
     */
    public void strike(String classes, HTMLSlot slot) {
        tag("strike", classes, null, slot);
    }

    /**
     * HTML strike tag, along with understanding its implementation through the example. The &lt;strike&gt; tag defines a strike or line through Text.
     * hint: &lt;strike&gt; Contents &lt;/strike&gt;
     */
    public void strike(StructureAttributes attributes, HTMLSlot slot) {
        tag("strike", null, attributes, slot);
    }

    /**
     * HTML strike tag, along with understanding its implementation through the example. The &lt;strike&gt; tag defines a strike or line through Text.
     * hint: &lt;strike&gt; Contents &lt;/strike&gt;
     */
    public void strike(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("strike", classes, attributes, slot);
    }

    /**
     * The strong tag in HTML is the parsed tag and is used to show the importance of the text. Make that text bold.
     * hint: &lt;strong&gt; Contents… &lt;/strong&gt;
     */
    public void strong(HTMLSlot slot) {
        tag("strong", null, null, slot);
    }

    /**
     * The strong tag in HTML is the parsed tag and is used to show the importance of the text. Make that text bold.
     * hint: &lt;strong&gt; Contents… &lt;/strong&gt;
     */
    public void strong(String classes, HTMLSlot slot) {
        tag("strong", classes, null, slot);
    }

    /**
     * The strong tag in HTML is the parsed tag and is used to show the importance of the text. Make that text bold.
     * hint: &lt;strong&gt; Contents… &lt;/strong&gt;
     */
    public void strong(StructureAttributes attributes, HTMLSlot slot) {
        tag("strong", null, attributes, slot);
    }

    /**
     * The strong tag in HTML is the parsed tag and is used to show the importance of the text. Make that text bold.
     * hint: &lt;strong&gt; Contents… &lt;/strong&gt;
     */
    public void strong(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("strong", classes, attributes, slot);
    }

    /**
     * The style tag in HTML helps us to design the web page.
     * hint: &lt;tagname style=”property:value;”&gt;
     */
    public void style(HTMLSlot slot) {
        tag("style", null, null, slot);
    }

    /**
     * The style tag in HTML helps us to design the web page.
     * hint: &lt;tagname style=”property:value;”&gt;
     */
    public void style(String classes, HTMLSlot slot) {
        tag("style", classes, null, slot);
    }

    /**
     * The style tag in HTML helps us to design the web page.
     * hint: &lt;tagname style=”property:value;”&gt;
     */
    public void style(StructureAttributes attributes, HTMLSlot slot) {
        tag("style", null, attributes, slot);
    }

    /**
     * The style tag in HTML helps us to design the web page.
     * hint: &lt;tagname style=”property:value;”&gt;
     */
    public void style(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("style", classes, attributes, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sub(HTMLSlot slot) {
        tag("sub", null, null, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sub(String classes, HTMLSlot slot) {
        tag("sub", classes, null, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sub(StructureAttributes attributes, HTMLSlot slot) {
        tag("sub", null, attributes, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sub(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("sub", classes, attributes, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sup(HTMLSlot slot) {
        tag("sup", null, null, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sup(String classes, HTMLSlot slot) {
        tag("sup", classes, null, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sup(StructureAttributes attributes, HTMLSlot slot) {
        tag("sup", null, attributes, slot);
    }

    /**
     * The sub tag is used to add a subscript text to the HTML document.
     * hint: &lt;sub&gt;subscript text&lt;/sub&gt;&lt;sup&gt;superscript text&lt;/sup&gt;
     */
    public void sup(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("sup", classes, attributes, slot);
    }

    /**
     * The &lt;summary&gt; tag in HTML is used to define a summary for the &lt;details&gt; element.
     * hint: &lt;summary&gt; Content &lt;/summary&gt;
     */
    public void summary(HTMLSlot slot) {
        tag("summary", null, null, slot);
    }

    /**
     * The &lt;summary&gt; tag in HTML is used to define a summary for the &lt;details&gt; element.
     * hint: &lt;summary&gt; Content &lt;/summary&gt;
     */
    public void summary(String classes, HTMLSlot slot) {
        tag("summary", classes, null, slot);
    }

    /**
     * The &lt;summary&gt; tag in HTML is used to define a summary for the &lt;details&gt; element.
     * hint: &lt;summary&gt; Content &lt;/summary&gt;
     */
    public void summary(StructureAttributes attributes, HTMLSlot slot) {
        tag("summary", null, attributes, slot);
    }

    /**
     * The &lt;summary&gt; tag in HTML is used to define a summary for the &lt;details&gt; element.
     * hint: &lt;summary&gt; Content &lt;/summary&gt;
     */
    public void summary(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("summary", classes, attributes, slot);
    }

    /**
     * HTML SVG Basics, & their implementation through the examples. SVG stands for Scalable Vector Graphics.
     * hint: &lt;svg height=”” width=””&gt;
     */
    public void svg(HTMLSlot slot) {
        tag("svg", null, null, slot);
    }

    /**
     * HTML SVG Basics, & their implementation through the examples. SVG stands for Scalable Vector Graphics.
     * hint: &lt;svg height=”” width=””&gt;
     */
    public void svg(String classes, HTMLSlot slot) {
        tag("svg", classes, null, slot);
    }

    /**
     * HTML SVG Basics, & their implementation through the examples. SVG stands for Scalable Vector Graphics.
     * hint: &lt;svg height=”” width=””&gt;
     */
    public void svg(StructureAttributes attributes, HTMLSlot slot) {
        tag("svg", null, attributes, slot);
    }

    /**
     * HTML SVG Basics, & their implementation through the examples. SVG stands for Scalable Vector Graphics.
     * hint: &lt;svg height=”” width=””&gt;
     */
    public void svg(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("svg", classes, attributes, slot);
    }

    /**
     * HTML Table, various ways to implement it, & will also understand its usage through the examples. HTML Table is an arrangement of data in rows and columns, or possibly in a more complex structure.
     * hint: &lt;table&gt;… &lt;/table&gt;
     */
    public void table(HTMLSlot slot) {
        tag("table", null, null, slot);
    }

    /**
     * HTML Table, various ways to implement it, & will also understand its usage through the examples. HTML Table is an arrangement of data in rows and columns, or possibly in a more complex structure.
     * hint: &lt;table&gt;… &lt;/table&gt;
     */
    public void table(String classes, HTMLSlot slot) {
        tag("table", classes, null, slot);
    }

    /**
     * HTML Table, various ways to implement it, & will also understand its usage through the examples. HTML Table is an arrangement of data in rows and columns, or possibly in a more complex structure.
     * hint: &lt;table&gt;… &lt;/table&gt;
     */
    public void table(StructureAttributes attributes, HTMLSlot slot) {
        tag("table", null, attributes, slot);
    }

    /**
     * HTML Table, various ways to implement it, & will also understand its usage through the examples. HTML Table is an arrangement of data in rows and columns, or possibly in a more complex structure.
     * hint: &lt;table&gt;… &lt;/table&gt;
     */
    public void table(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("table", classes, attributes, slot);
    }

    /**
     * The tbody tag in HTML is used to make a group of the same type of content of the body element.
     * hint: &lt;tbody&gt; // Table contents &lt;/tbody&gt;
     */
    public void tbody(HTMLSlot slot) {
        tag("tbody", null, null, slot);
    }

    /**
     * The tbody tag in HTML is used to make a group of the same type of content of the body element.
     * hint: &lt;tbody&gt; // Table contents &lt;/tbody&gt;
     */
    public void tbody(String classes, HTMLSlot slot) {
        tag("tbody", classes, null, slot);
    }

    /**
     * The tbody tag in HTML is used to make a group of the same type of content of the body element.
     * hint: &lt;tbody&gt; // Table contents &lt;/tbody&gt;
     */
    public void tbody(StructureAttributes attributes, HTMLSlot slot) {
        tag("tbody", null, attributes, slot);
    }

    /**
     * The tbody tag in HTML is used to make a group of the same type of content of the body element.
     * hint: &lt;tbody&gt; // Table contents &lt;/tbody&gt;
     */
    public void tbody(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("tbody", classes, attributes, slot);
    }

    /**
     * The table data tag is used to define a standard cell in an HTML table.
     * hint: &lt;td&gt;……..&lt;/td&gt;
     */
    public void td(HTMLSlot slot) {
        tag("td", null, null, slot);
    }

    /**
     * The table data tag is used to define a standard cell in an HTML table.
     * hint: &lt;td&gt;……..&lt;/td&gt;
     */
    public void td(String classes, HTMLSlot slot) {
        tag("td", classes, null, slot);
    }

    /**
     * The table data tag is used to define a standard cell in an HTML table.
     * hint: &lt;td&gt;……..&lt;/td&gt;
     */
    public void td(StructureAttributes attributes, HTMLSlot slot) {
        tag("td", null, attributes, slot);
    }

    /**
     * The table data tag is used to define a standard cell in an HTML table.
     * hint: &lt;td&gt;……..&lt;/td&gt;
     */
    public void td(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("td", classes, attributes, slot);
    }

    /**
     * The template tag in HTML is used to store the HTML code fragments, which can be cloned and inserted in an HTML document.
     * hint: &lt;template&gt; Contents &lt;/template&gt;
     */
    public void template(HTMLSlot slot) {
        tag("template", null, null, slot);
    }

    /**
     * The template tag in HTML is used to store the HTML code fragments, which can be cloned and inserted in an HTML document.
     * hint: &lt;template&gt; Contents &lt;/template&gt;
     */
    public void template(String classes, HTMLSlot slot) {
        tag("template", classes, null, slot);
    }

    /**
     * The template tag in HTML is used to store the HTML code fragments, which can be cloned and inserted in an HTML document.
     * hint: &lt;template&gt; Contents &lt;/template&gt;
     */
    public void template(StructureAttributes attributes, HTMLSlot slot) {
        tag("template", null, attributes, slot);
    }

    /**
     * The template tag in HTML is used to store the HTML code fragments, which can be cloned and inserted in an HTML document.
     * hint: &lt;template&gt; Contents &lt;/template&gt;
     */
    public void template(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("template", classes, attributes, slot);
    }

    /**
     * This tag is used in HTML table with header and body which is known as “thead” and “tbody”.
     * hint: &lt;tfoot&gt; // Table footer contents… &lt;/tfoot&gt;
     */
    public void tfoot(HTMLSlot slot) {
        tag("tfoot", null, null, slot);
    }

    /**
     * This tag is used in HTML table with header and body which is known as “thead” and “tbody”.
     * hint: &lt;tfoot&gt; // Table footer contents… &lt;/tfoot&gt;
     */
    public void tfoot(String classes, HTMLSlot slot) {
        tag("tfoot", classes, null, slot);
    }

    /**
     * This tag is used in HTML table with header and body which is known as “thead” and “tbody”.
     * hint: &lt;tfoot&gt; // Table footer contents… &lt;/tfoot&gt;
     */
    public void tfoot(StructureAttributes attributes, HTMLSlot slot) {
        tag("tfoot", null, attributes, slot);
    }

    /**
     * This tag is used in HTML table with header and body which is known as “thead” and “tbody”.
     * hint: &lt;tfoot&gt; // Table footer contents… &lt;/tfoot&gt;
     */
    public void tfoot(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("tfoot", classes, attributes, slot);
    }

    /**
     * The table header tag in HTML is used to set the header cell of a table. Two types of cells in the HTML table Header & Standard.
     * hint: &lt;th&gt; Contents… &lt;/th&gt;
     */
    public void th(HTMLSlot slot) {
        tag("th", null, null, slot);
    }

    /**
     * The table header tag in HTML is used to set the header cell of a table. Two types of cells in the HTML table Header & Standard.
     * hint: &lt;th&gt; Contents… &lt;/th&gt;
     */
    public void th(String classes, HTMLSlot slot) {
        tag("th", classes, null, slot);
    }

    /**
     * The table header tag in HTML is used to set the header cell of a table. Two types of cells in the HTML table Header & Standard.
     * hint: &lt;th&gt; Contents… &lt;/th&gt;
     */
    public void th(StructureAttributes attributes, HTMLSlot slot) {
        tag("th", null, attributes, slot);
    }

    /**
     * The table header tag in HTML is used to set the header cell of a table. Two types of cells in the HTML table Header & Standard.
     * hint: &lt;th&gt; Contents… &lt;/th&gt;
     */
    public void th(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("th", classes, attributes, slot);
    }

    /**
     * This tag is used in HTML tables as head and body which are known as thead and tbody.
     * hint: &lt;thead&gt;Table head Contents…&lt;/thead&gt;
     */
    public void thead(HTMLSlot slot) {
        tag("thead", null, null, slot);
    }

    /**
     * This tag is used in HTML tables as head and body which are known as thead and tbody.
     * hint: &lt;thead&gt;Table head Contents…&lt;/thead&gt;
     */
    public void thead(String classes, HTMLSlot slot) {
        tag("thead", classes, null, slot);
    }

    /**
     * This tag is used in HTML tables as head and body which are known as thead and tbody.
     * hint: &lt;thead&gt;Table head Contents…&lt;/thead&gt;
     */
    public void thead(StructureAttributes attributes, HTMLSlot slot) {
        tag("thead", null, attributes, slot);
    }

    /**
     * This tag is used in HTML tables as head and body which are known as thead and tbody.
     * hint: &lt;thead&gt;Table head Contents…&lt;/thead&gt;
     */
    public void thead(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("thead", classes, attributes, slot);
    }

    /**
     * The time tag is used to display the human-readable date/time. It can also be used to encode dates and times in a machine-readable form.
     * hint: &lt;time attribute&gt; Time… &lt;/time&gt;
     */
    public void time(HTMLSlot slot) {
        tag("time", null, null, slot);
    }

    /**
     * The time tag is used to display the human-readable date/time. It can also be used to encode dates and times in a machine-readable form.
     * hint: &lt;time attribute&gt; Time… &lt;/time&gt;
     */
    public void time(String classes, HTMLSlot slot) {
        tag("time", classes, null, slot);
    }

    /**
     * The time tag is used to display the human-readable date/time. It can also be used to encode dates and times in a machine-readable form.
     * hint: &lt;time attribute&gt; Time… &lt;/time&gt;
     */
    public void time(StructureAttributes attributes, HTMLSlot slot) {
        tag("time", null, attributes, slot);
    }

    /**
     * The time tag is used to display the human-readable date/time. It can also be used to encode dates and times in a machine-readable form.
     * hint: &lt;time attribute&gt; Time… &lt;/time&gt;
     */
    public void time(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("time", classes, attributes, slot);
    }

    /**
     * The title tag in HTML is used to define the title of HTML document. It sets the title in the browser toolbar.
     * hint: &lt;title&gt; Title name &lt;/title&gt;
     */
    public void title(HTMLSlot slot) {
        tag("title", null, null, slot);
    }

    /**
     * The title tag in HTML is used to define the title of HTML document. It sets the title in the browser toolbar.
     * hint: &lt;title&gt; Title name &lt;/title&gt;
     */
    public void title(String classes, HTMLSlot slot) {
        tag("title", classes, null, slot);
    }

    /**
     * The title tag in HTML is used to define the title of HTML document. It sets the title in the browser toolbar.
     * hint: &lt;title&gt; Title name &lt;/title&gt;
     */
    public void title(StructureAttributes attributes, HTMLSlot slot) {
        tag("title", null, attributes, slot);
    }

    /**
     * The title tag in HTML is used to define the title of HTML document. It sets the title in the browser toolbar.
     * hint: &lt;title&gt; Title name &lt;/title&gt;
     */
    public void title(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("title", classes, attributes, slot);
    }

    /**
     * The table row tag is used to define a row in an HTML table. The &lt;tr&gt; element contains multiple &lt;th&gt; or &lt;td&gt; elements.
     * hint: &lt;tr&gt;…..&lt;/tr&gt;
     */
    public void tr(HTMLSlot slot) {
        tag("tr", null, null, slot);
    }

    /**
     * The table row tag is used to define a row in an HTML table. The &lt;tr&gt; element contains multiple &lt;th&gt; or &lt;td&gt; elements.
     * hint: &lt;tr&gt;…..&lt;/tr&gt;
     */
    public void tr(String classes, HTMLSlot slot) {
        tag("tr", classes, null, slot);
    }

    /**
     * The table row tag is used to define a row in an HTML table. The &lt;tr&gt; element contains multiple &lt;th&gt; or &lt;td&gt; elements.
     * hint: &lt;tr&gt;…..&lt;/tr&gt;
     */
    public void tr(StructureAttributes attributes, HTMLSlot slot) {
        tag("tr", null, attributes, slot);
    }

    /**
     * The table row tag is used to define a row in an HTML table. The &lt;tr&gt; element contains multiple &lt;th&gt; or &lt;td&gt; elements.
     * hint: &lt;tr&gt;…..&lt;/tr&gt;
     */
    public void tr(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("tr", classes, attributes, slot);
    }

    /**
     * The tracking tag specifies text tracks for media components audio and video.
     * hint: &lt;track attribute&gt;
     */
    public void track(HTMLSlot slot) {
        tag("track", null, null, slot);
    }

    /**
     * The tracking tag specifies text tracks for media components audio and video.
     * hint: &lt;track attribute&gt;
     */
    public void track(String classes, HTMLSlot slot) {
        tag("track", classes, null, slot);
    }

    /**
     * The tracking tag specifies text tracks for media components audio and video.
     * hint: &lt;track attribute&gt;
     */
    public void track(StructureAttributes attributes, HTMLSlot slot) {
        tag("track", null, attributes, slot);
    }

    /**
     * The tracking tag specifies text tracks for media components audio and video.
     * hint: &lt;track attribute&gt;
     */
    public void track(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("track", classes, attributes, slot);
    }

    /**
     * The tt tag is the abbreviation of teletype text. This tag is depreciated from HTML 5. It was used for marking Keyboard input.
     * hint: &lt;tt&gt; Contents… &lt;/tt&gt;
     */
    public void tt(HTMLSlot slot) {
        tag("tt", null, null, slot);
    }

    /**
     * The tt tag is the abbreviation of teletype text. This tag is depreciated from HTML 5. It was used for marking Keyboard input.
     * hint: &lt;tt&gt; Contents… &lt;/tt&gt;
     */
    public void tt(String classes, HTMLSlot slot) {
        tag("tt", classes, null, slot);
    }

    /**
     * The tt tag is the abbreviation of teletype text. This tag is depreciated from HTML 5. It was used for marking Keyboard input.
     * hint: &lt;tt&gt; Contents… &lt;/tt&gt;
     */
    public void tt(StructureAttributes attributes, HTMLSlot slot) {
        tag("tt", null, attributes, slot);
    }

    /**
     * The tt tag is the abbreviation of teletype text. This tag is depreciated from HTML 5. It was used for marking Keyboard input.
     * hint: &lt;tt&gt; Contents… &lt;/tt&gt;
     */
    public void tt(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("tt", classes, attributes, slot);
    }

    /**
     * The underline tag in HTML stands for underline, and it’s used to underline the text enclosed within the &lt;u&gt; tag.
     * hint: &lt;u&gt; Contents… &lt;/u&gt;
     */
    public void u(HTMLSlot slot) {
        tag("u", null, null, slot);
    }

    /**
     * The underline tag in HTML stands for underline, and it’s used to underline the text enclosed within the &lt;u&gt; tag.
     * hint: &lt;u&gt; Contents… &lt;/u&gt;
     */
    public void u(String classes, HTMLSlot slot) {
        tag("u", classes, null, slot);
    }

    /**
     * The underline tag in HTML stands for underline, and it’s used to underline the text enclosed within the &lt;u&gt; tag.
     * hint: &lt;u&gt; Contents… &lt;/u&gt;
     */
    public void u(StructureAttributes attributes, HTMLSlot slot) {
        tag("u", null, attributes, slot);
    }

    /**
     * The underline tag in HTML stands for underline, and it’s used to underline the text enclosed within the &lt;u&gt; tag.
     * hint: &lt;u&gt; Contents… &lt;/u&gt;
     */
    public void u(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("u", classes, attributes, slot);
    }

    /**
     * It is a phrase tag used to specify the variable in a mathematical equation or in a computer program.
     * hint: &lt;var&gt; Contents… &lt;/var&gt;
     */
    public void var(HTMLSlot slot) {
        tag("var", null, null, slot);
    }

    /**
     * It is a phrase tag used to specify the variable in a mathematical equation or in a computer program.
     * hint: &lt;var&gt; Contents… &lt;/var&gt;
     */
    public void var(String classes, HTMLSlot slot) {
        tag("var", classes, null, slot);
    }

    /**
     * It is a phrase tag used to specify the variable in a mathematical equation or in a computer program.
     * hint: &lt;var&gt; Contents… &lt;/var&gt;
     */
    public void var(StructureAttributes attributes, HTMLSlot slot) {
        tag("var", null, attributes, slot);
    }

    /**
     * It is a phrase tag used to specify the variable in a mathematical equation or in a computer program.
     * hint: &lt;var&gt; Contents… &lt;/var&gt;
     */
    public void var(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("var", classes, attributes, slot);
    }

    /**
     * HTML5 Video, along with knowing the different ways to add the videos to the HTML page.
     * hint: &lt;video src=”” controls&gt; &lt;/video&gt;
     */
    public void video(HTMLSlot slot) {
        tag("video", null, null, slot);
    }

    /**
     * HTML5 Video, along with knowing the different ways to add the videos to the HTML page.
     * hint: &lt;video src=”” controls&gt; &lt;/video&gt;
     */
    public void video(String classes, HTMLSlot slot) {
        tag("video", classes, null, slot);
    }

    /**
     * HTML5 Video, along with knowing the different ways to add the videos to the HTML page.
     * hint: &lt;video src=”” controls&gt; &lt;/video&gt;
     */
    public void video(StructureAttributes attributes, HTMLSlot slot) {
        tag("video", null, attributes, slot);
    }

    /**
     * HTML5 Video, along with knowing the different ways to add the videos to the HTML page.
     * hint: &lt;video src=”” controls&gt; &lt;/video&gt;
     */
    public void video(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("video", classes, attributes, slot);
    }

    /**
     * The wbr tag is used to define the position within the text which is treated as a line break by the browser.
     * hint: &lt;wbr&gt;
     */
    public void wbr(HTMLSlot slot) {
        tag("wbr", null, null, slot);
    }

    /**
     * The wbr tag is used to define the position within the text which is treated as a line break by the browser.
     * hint: &lt;wbr&gt;
     */
    public void wbr(String classes, HTMLSlot slot) {
        tag("wbr", classes, null, slot);
    }

    /**
     * The wbr tag is used to define the position within the text which is treated as a line break by the browser.
     * hint: &lt;wbr&gt;
     */
    public void wbr(StructureAttributes attributes, HTMLSlot slot) {
        tag("wbr", null, attributes, slot);
    }

    /**
     * The wbr tag is used to define the position within the text which is treated as a line break by the browser.
     * hint: &lt;wbr&gt;
     */
    public void wbr(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("wbr", classes, attributes, slot);
    }

    /**
     * The XMP tag is used to create any content in letter format.
     * hint: &lt;xmp&gt; statement &lt;/xmp&gt;
     */
    public void xmp(HTMLSlot slot) {
        tag("xmp", null, null, slot);
    }

    /**
     * The XMP tag is used to create any content in letter format.
     * hint: &lt;xmp&gt; statement &lt;/xmp&gt;
     */
    public void xmp(String classes, HTMLSlot slot) {
        tag("xmp", classes, null, slot);
    }

    /**
     * The XMP tag is used to create any content in letter format.
     * hint: &lt;xmp&gt; statement &lt;/xmp&gt;
     */
    public void xmp(StructureAttributes attributes, HTMLSlot slot) {
        tag("xmp", null, attributes, slot);
    }

    /**
     * The XMP tag is used to create any content in letter format.
     * hint: &lt;xmp&gt; statement &lt;/xmp&gt;
     */
    public void xmp(String classes, StructureAttributes attributes, HTMLSlot slot) {
        tag("xmp", classes, attributes, slot);
    }

    @FunctionalInterface
    public interface HTMLSlot {
        void call();
    }
}
