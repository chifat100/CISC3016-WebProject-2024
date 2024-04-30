package toedy.html_server;

public class StructureAttributes {
    private final StringBuilder sb = new StringBuilder();

    public StructureAttributes with(String name) {
        sb.append(' ');
        sb.append(name);
        return this;
    }

    public StructureAttributes with(String name, boolean toAdd) {
        if (!toAdd) return this;
        sb.append(' ');
        sb.append(name);
        return this;
    }

    public StructureAttributes with(String name, String value) {
        sb.append(' ');
        sb.append(name);
        if (value != null) {
            sb.append('=');
            sb.append('"');
            sb.append(value);
            sb.append('"');
        }
        return this;
    }

    public StructureAttributes with(String name, String value, boolean toAdd) {
        if (!toAdd) return this;
        sb.append(' ');
        sb.append(name);
        if (value != null) {
            sb.append('=');
            sb.append('"');
            sb.append(value);
            sb.append('"');
        }
        return this;
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    /**
     * <p>Specifies the types of files that the server accepts (only for type="file")</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes accept(String value) {
        return with("accept", value);
    }

    /**
     * <p>Specifies the types of files that the server accepts (only for type="file")</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes accept(String value, boolean toAdd) {
        return with("accept", value, toAdd);
    }

    /**
     * <p>Specifies the character encodings that are to be used for the form submission</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes accept_charset(String value) {
        return with("accept-charset", value);
    }

    /**
     * <p>Specifies the character encodings that are to be used for the form submission</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes accept_charset(String value, boolean toAdd) {
        return with("accept-charset", value, toAdd);
    }

    /**
     * <p>Specifies a shortcut key to activate/focus an element</p>
     * use on Global Attributes
     */
    public StructureAttributes accesskey(String value) {
        return with("accesskey", value);
    }

    /**
     * <p>Specifies a shortcut key to activate/focus an element</p>
     * use on Global Attributes
     */
    public StructureAttributes accesskey(String value, boolean toAdd) {
        return with("accesskey", value, toAdd);
    }

    /**
     * <p>Specifies where to send the form-data when a form is submitted</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes action(String value) {
        return with("action", value);
    }

    /**
     * <p>Specifies where to send the form-data when a form is submitted</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes action(String value, boolean toAdd) {
        return with("action", value, toAdd);
    }

    /**
     * <p>Specifies the alignment according to surrounding elements. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes align(String value) {
        return with("align", value);
    }

    /**
     * <p>Specifies the alignment according to surrounding elements. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes align(String value, boolean toAdd) {
        return with("align", value, toAdd);
    }

    /**
     * <p>Specifies an alternate text when the original element fails to display</p>
     * use on &lt;area&gt;, &lt;img&gt;, &lt;input&gt;
     */
    public StructureAttributes alt(String value) {
        return with("alt", value);
    }

    /**
     * <p>Specifies an alternate text when the original element fails to display</p>
     * use on &lt;area&gt;, &lt;img&gt;, &lt;input&gt;
     */
    public StructureAttributes alt(String value, boolean toAdd) {
        return with("alt", value, toAdd);
    }

    /**
     * <p>Specifies that the script is executed asynchronously (only for external scripts)</p>
     * use on &lt;script&gt;
     */
    public StructureAttributes async(String value) {
        return with("async", value);
    }

    /**
     * <p>Specifies that the script is executed asynchronously (only for external scripts)</p>
     * use on &lt;script&gt;
     */
    public StructureAttributes async(String value, boolean toAdd) {
        return with("async", value, toAdd);
    }

    /**
     * <p>Specifies whether the <form> or the <input> element should have autocomplete enabled</p>
     * use on &lt;form&gt;, &lt;input&gt;
     */
    public StructureAttributes autocomplete(String value) {
        return with("autocomplete", value);
    }

    /**
     * <p>Specifies whether the <form> or the <input> element should have autocomplete enabled</p>
     * use on &lt;form&gt;, &lt;input&gt;
     */
    public StructureAttributes autocomplete(String value, boolean toAdd) {
        return with("autocomplete", value, toAdd);
    }

    /**
     * <p>Specifies that the element should automatically get focus when the page loads</p>
     * use on &lt;button&gt;, &lt;input&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes autofocus(String value) {
        return with("autofocus", value);
    }

    /**
     * <p>Specifies that the element should automatically get focus when the page loads</p>
     * use on &lt;button&gt;, &lt;input&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes autofocus(String value, boolean toAdd) {
        return with("autofocus", value, toAdd);
    }

    /**
     * <p>Specifies that the audio/video will start playing as soon as it is ready</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes autoplay(String value) {
        return with("autoplay", value);
    }

    /**
     * <p>Specifies that the audio/video will start playing as soon as it is ready</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes autoplay(String value, boolean toAdd) {
        return with("autoplay", value, toAdd);
    }

    /**
     * <p>Specifies the background color of an element. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes bgcolor(String value) {
        return with("bgcolor", value);
    }

    /**
     * <p>Specifies the background color of an element. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes bgcolor(String value, boolean toAdd) {
        return with("bgcolor", value, toAdd);
    }

    /**
     * <p>Specifies the width of the border of an element. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes border(String value) {
        return with("border", value);
    }

    /**
     * <p>Specifies the width of the border of an element. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes border(String value, boolean toAdd) {
        return with("border", value, toAdd);
    }

    /**
     * <p>Specifies the character encoding</p>
     * use on &lt;meta&gt;, &lt;script&gt;
     */
    public StructureAttributes charset(String value) {
        return with("charset", value);
    }

    /**
     * <p>Specifies the character encoding</p>
     * use on &lt;meta&gt;, &lt;script&gt;
     */
    public StructureAttributes charset(String value, boolean toAdd) {
        return with("charset", value, toAdd);
    }

    /**
     * <p>Specifies that an <input> element should be pre-selected when the page loads (for type="checkbox" or type="radio")</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes checked(String value) {
        return with("checked", value);
    }

    /**
     * <p>Specifies that an <input> element should be pre-selected when the page loads (for type="checkbox" or type="radio")</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes checked(String value, boolean toAdd) {
        return with("checked", value, toAdd);
    }

    /**
     * <p>Specifies a URL which explains the quote/deleted/inserted text</p>
     * use on &lt;blockquote&gt;, &lt;del&gt;, &lt;ins&gt;, &lt;q&gt;
     */
    public StructureAttributes cite(String value) {
        return with("cite", value);
    }

    /**
     * <p>Specifies a URL which explains the quote/deleted/inserted text</p>
     * use on &lt;blockquote&gt;, &lt;del&gt;, &lt;ins&gt;, &lt;q&gt;
     */
    public StructureAttributes cite(String value, boolean toAdd) {
        return with("cite", value, toAdd);
    }

    /**
     * <p>Specifies one or more classnames for an element (refers to a class in a style sheet)</p>
     * use on Global Attributes
     */
    public StructureAttributes class_(String value) {
        return with("class", value);
    }

    /**
     * <p>Specifies one or more classnames for an element (refers to a class in a style sheet)</p>
     * use on Global Attributes
     */
    public StructureAttributes class_(String value, boolean toAdd) {
        return with("class", value, toAdd);
    }

    /**
     * <p>Specifies the text color of an element. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes color(String value) {
        return with("color", value);
    }

    /**
     * <p>Specifies the text color of an element. Use CSS instead</p>
     * use on Not supported in HTML 5.
     */
    public StructureAttributes color(String value, boolean toAdd) {
        return with("color", value, toAdd);
    }

    /**
     * <p>Specifies the visible width of a text area</p>
     * use on &lt;textarea&gt;
     */
    public StructureAttributes cols(String value) {
        return with("cols", value);
    }

    /**
     * <p>Specifies the visible width of a text area</p>
     * use on &lt;textarea&gt;
     */
    public StructureAttributes cols(String value, boolean toAdd) {
        return with("cols", value, toAdd);
    }

    /**
     * <p>Specifies the number of columns a table cell should span</p>
     * use on &lt;td&gt;, &lt;th&gt;
     */
    public StructureAttributes colspan(String value) {
        return with("colspan", value);
    }

    /**
     * <p>Specifies the number of columns a table cell should span</p>
     * use on &lt;td&gt;, &lt;th&gt;
     */
    public StructureAttributes colspan(String value, boolean toAdd) {
        return with("colspan", value, toAdd);
    }

    /**
     * <p>Gives the value associated with the http-equiv or name attribute</p>
     * use on &lt;meta&gt;
     */
    public StructureAttributes content(String value) {
        return with("content", value);
    }

    /**
     * <p>Gives the value associated with the http-equiv or name attribute</p>
     * use on &lt;meta&gt;
     */
    public StructureAttributes content(String value, boolean toAdd) {
        return with("content", value, toAdd);
    }

    /**
     * <p>Specifies whether the content of an element is editable or not</p>
     * use on Global Attributes
     */
    public StructureAttributes contenteditable(String value) {
        return with("contenteditable", value);
    }

    /**
     * <p>Specifies whether the content of an element is editable or not</p>
     * use on Global Attributes
     */
    public StructureAttributes contenteditable(String value, boolean toAdd) {
        return with("contenteditable", value, toAdd);
    }

    /**
     * <p>Specifies that audio/video controls should be displayed (such as a play/pause button etc)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes controls(String value) {
        return with("controls", value);
    }

    /**
     * <p>Specifies that audio/video controls should be displayed (such as a play/pause button etc)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes controls(String value, boolean toAdd) {
        return with("controls", value, toAdd);
    }

    /**
     * <p>Specifies the coordinates of the area</p>
     * use on &lt;area&gt;
     */
    public StructureAttributes coords(String value) {
        return with("coords", value);
    }

    /**
     * <p>Specifies the coordinates of the area</p>
     * use on &lt;area&gt;
     */
    public StructureAttributes coords(String value, boolean toAdd) {
        return with("coords", value, toAdd);
    }

    /**
     * <p>Specifies the URL of the resource to be used by the object</p>
     * use on &lt;object&gt;
     */
    public StructureAttributes data(String value) {
        return with("data", value);
    }

    /**
     * <p>Specifies the URL of the resource to be used by the object</p>
     * use on &lt;object&gt;
     */
    public StructureAttributes data(String value, boolean toAdd) {
        return with("data", value, toAdd);
    }

    /**
     * <p>Specifies the date and time</p>
     * use on &lt;del&gt;, &lt;ins&gt;, &lt;time&gt;
     */
    public StructureAttributes datetime(String value) {
        return with("datetime", value);
    }

    /**
     * <p>Specifies the date and time</p>
     * use on &lt;del&gt;, &lt;ins&gt;, &lt;time&gt;
     */
    public StructureAttributes datetime(String value, boolean toAdd) {
        return with("datetime", value, toAdd);
    }

    /**
     * <p>Specifies that the track is to be enabled if the user's preferences do not indicate that another track would be more appropriate</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes default_(String value) {
        return with("default", value);
    }

    /**
     * <p>Specifies that the track is to be enabled if the user's preferences do not indicate that another track would be more appropriate</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes default_(String value, boolean toAdd) {
        return with("default", value, toAdd);
    }

    /**
     * <p>Specifies that the script is executed when the page has finished parsing (only for external scripts)</p>
     * use on &lt;script&gt;
     */
    public StructureAttributes defer(String value) {
        return with("defer", value);
    }

    /**
     * <p>Specifies that the script is executed when the page has finished parsing (only for external scripts)</p>
     * use on &lt;script&gt;
     */
    public StructureAttributes defer(String value, boolean toAdd) {
        return with("defer", value, toAdd);
    }

    /**
     * <p>Specifies the text direction for the content in an element</p>
     * use on Global Attributes
     */
    public StructureAttributes dir(String value) {
        return with("dir", value);
    }

    /**
     * <p>Specifies the text direction for the content in an element</p>
     * use on Global Attributes
     */
    public StructureAttributes dir(String value, boolean toAdd) {
        return with("dir", value, toAdd);
    }

    /**
     * <p>Specifies that the text direction will be submitted</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes dirname(String value) {
        return with("dirname", value);
    }

    /**
     * <p>Specifies that the text direction will be submitted</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes dirname(String value, boolean toAdd) {
        return with("dirname", value, toAdd);
    }

    /**
     * <p>Specifies that the specified element/group of elements should be disabled</p>
     * use on &lt;button&gt;, &lt;fieldset&gt;, &lt;input&gt;, &lt;optgroup&gt;, &lt;option&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes disabled(String value) {
        return with("disabled", value);
    }

    /**
     * <p>Specifies that the specified element/group of elements should be disabled</p>
     * use on &lt;button&gt;, &lt;fieldset&gt;, &lt;input&gt;, &lt;optgroup&gt;, &lt;option&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes disabled(String value, boolean toAdd) {
        return with("disabled", value, toAdd);
    }

    /**
     * <p>Specifies that the target will be downloaded when a user clicks on the hyperlink</p>
     * use on &lt;a&gt;, &lt;area&gt;
     */
    public StructureAttributes download(String value) {
        return with("download", value);
    }

    /**
     * <p>Specifies that the target will be downloaded when a user clicks on the hyperlink</p>
     * use on &lt;a&gt;, &lt;area&gt;
     */
    public StructureAttributes download(String value, boolean toAdd) {
        return with("download", value, toAdd);
    }

    /**
     * <p>Specifies whether an element is draggable or not</p>
     * use on Global Attributes
     */
    public StructureAttributes draggable(String value) {
        return with("draggable", value);
    }

    /**
     * <p>Specifies whether an element is draggable or not</p>
     * use on Global Attributes
     */
    public StructureAttributes draggable(String value, boolean toAdd) {
        return with("draggable", value, toAdd);
    }

    /**
     * <p>Specifies how the form-data should be encoded when submitting it to the server (only for method="post")</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes enctype(String value) {
        return with("enctype", value);
    }

    /**
     * <p>Specifies how the form-data should be encoded when submitting it to the server (only for method="post")</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes enctype(String value, boolean toAdd) {
        return with("enctype", value, toAdd);
    }

    /**
     * <p>Specifies the text of the enter-key on a virtual keybord</p>
     * use on Global Attributes
     */
    public StructureAttributes enterkeyhint(String value) {
        return with("enterkeyhint", value);
    }

    /**
     * <p>Specifies the text of the enter-key on a virtual keybord</p>
     * use on Global Attributes
     */
    public StructureAttributes enterkeyhint(String value, boolean toAdd) {
        return with("enterkeyhint", value, toAdd);
    }

    /**
     * <p>Specifies which form element(s) a label/calculation is bound to</p>
     * use on &lt;label&gt;, &lt;output&gt;
     */
    public StructureAttributes for_(String value) {
        return with("for", value);
    }

    /**
     * <p>Specifies which form element(s) a label/calculation is bound to</p>
     * use on &lt;label&gt;, &lt;output&gt;
     */
    public StructureAttributes for_(String value, boolean toAdd) {
        return with("for", value, toAdd);
    }

    /**
     * <p>Specifies the name of the form the element belongs to</p>
     * use on &lt;button&gt;, &lt;fieldset&gt;, &lt;input&gt;, &lt;label&gt;, &lt;meter&gt;, &lt;object&gt;, &lt;output&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes form(String value) {
        return with("form", value);
    }

    /**
     * <p>Specifies the name of the form the element belongs to</p>
     * use on &lt;button&gt;, &lt;fieldset&gt;, &lt;input&gt;, &lt;label&gt;, &lt;meter&gt;, &lt;object&gt;, &lt;output&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes form(String value, boolean toAdd) {
        return with("form", value, toAdd);
    }

    /**
     * <p>Specifies where to send the form-data when a form is submitted. Only for type="submit"</p>
     * use on &lt;button&gt;, &lt;input&gt;
     */
    public StructureAttributes formaction(String value) {
        return with("formaction", value);
    }

    /**
     * <p>Specifies where to send the form-data when a form is submitted. Only for type="submit"</p>
     * use on &lt;button&gt;, &lt;input&gt;
     */
    public StructureAttributes formaction(String value, boolean toAdd) {
        return with("formaction", value, toAdd);
    }

    /**
     * <p>Specifies one or more headers cells a cell is related to</p>
     * use on &lt;td&gt;, &lt;th&gt;
     */
    public StructureAttributes headers(String value) {
        return with("headers", value);
    }

    /**
     * <p>Specifies one or more headers cells a cell is related to</p>
     * use on &lt;td&gt;, &lt;th&gt;
     */
    public StructureAttributes headers(String value, boolean toAdd) {
        return with("headers", value, toAdd);
    }

    /**
     * <p>Specifies the height of the element</p>
     * use on &lt;canvas&gt;, &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes height(String value) {
        return with("height", value);
    }

    /**
     * <p>Specifies the height of the element</p>
     * use on &lt;canvas&gt;, &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes height(String value, boolean toAdd) {
        return with("height", value, toAdd);
    }

    /**
     * <p>Specifies that an element is not yet, or is no longer, relevant</p>
     * use on Global Attributes
     */
    public StructureAttributes hidden(String value) {
        return with("hidden", value);
    }

    /**
     * <p>Specifies that an element is not yet, or is no longer, relevant</p>
     * use on Global Attributes
     */
    public StructureAttributes hidden(String value, boolean toAdd) {
        return with("hidden", value, toAdd);
    }

    /**
     * <p>Specifies the range that is considered to be a high value</p>
     * use on &lt;meter&gt;
     */
    public StructureAttributes high(String value) {
        return with("high", value);
    }

    /**
     * <p>Specifies the range that is considered to be a high value</p>
     * use on &lt;meter&gt;
     */
    public StructureAttributes high(String value, boolean toAdd) {
        return with("high", value, toAdd);
    }

    /**
     * <p>Specifies the URL of the page the link goes to</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;base&gt;, &lt;link&gt;
     */
    public StructureAttributes href(String value) {
        return with("href", value);
    }

    /**
     * <p>Specifies the URL of the page the link goes to</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;base&gt;, &lt;link&gt;
     */
    public StructureAttributes href(String value, boolean toAdd) {
        return with("href", value, toAdd);
    }

    /**
     * <p>Specifies the language of the linked document</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;link&gt;
     */
    public StructureAttributes hreflang(String value) {
        return with("hreflang", value);
    }

    /**
     * <p>Specifies the language of the linked document</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;link&gt;
     */
    public StructureAttributes hreflang(String value, boolean toAdd) {
        return with("hreflang", value, toAdd);
    }

    /**
     * <p>Provides an HTTP header for the information/value of the content attribute</p>
     * use on &lt;meta&gt;
     */
    public StructureAttributes http_equiv(String value) {
        return with("http-equiv", value);
    }

    /**
     * <p>Provides an HTTP header for the information/value of the content attribute</p>
     * use on &lt;meta&gt;
     */
    public StructureAttributes http_equiv(String value, boolean toAdd) {
        return with("http-equiv", value, toAdd);
    }

    /**
     * <p>Specifies a unique id for an element</p>
     * use on Global Attributes
     */
    public StructureAttributes id(String value) {
        return with("id", value);
    }

    /**
     * <p>Specifies a unique id for an element</p>
     * use on Global Attributes
     */
    public StructureAttributes id(String value, boolean toAdd) {
        return with("id", value, toAdd);
    }

    /**
     * <p>Specifies that the browser should ignore this section</p>
     * use on Global Attributes
     */
    public StructureAttributes inert(String value) {
        return with("inert", value);
    }

    /**
     * <p>Specifies that the browser should ignore this section</p>
     * use on Global Attributes
     */
    public StructureAttributes inert(String value, boolean toAdd) {
        return with("inert", value, toAdd);
    }

    /**
     * <p>Specifies the mode of a virtual keyboard</p>
     * use on Global Attributes
     */
    public StructureAttributes inputmode(String value) {
        return with("inputmode", value);
    }

    /**
     * <p>Specifies the mode of a virtual keyboard</p>
     * use on Global Attributes
     */
    public StructureAttributes inputmode(String value, boolean toAdd) {
        return with("inputmode", value, toAdd);
    }

    /**
     * <p>Specifies an image as a server-side image map</p>
     * use on &lt;img&gt;
     */
    public StructureAttributes ismap(String value) {
        return with("ismap", value);
    }

    /**
     * <p>Specifies an image as a server-side image map</p>
     * use on &lt;img&gt;
     */
    public StructureAttributes ismap(String value, boolean toAdd) {
        return with("ismap", value, toAdd);
    }

    /**
     * <p>Specifies the kind of text track</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes kind(String value) {
        return with("kind", value);
    }

    /**
     * <p>Specifies the kind of text track</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes kind(String value, boolean toAdd) {
        return with("kind", value, toAdd);
    }

    /**
     * <p>Specifies the title of the text track</p>
     * use on &lt;track&gt;, &lt;option&gt;, &lt;optgroup&gt;
     */
    public StructureAttributes label(String value) {
        return with("label", value);
    }

    /**
     * <p>Specifies the title of the text track</p>
     * use on &lt;track&gt;, &lt;option&gt;, &lt;optgroup&gt;
     */
    public StructureAttributes label(String value, boolean toAdd) {
        return with("label", value, toAdd);
    }

    /**
     * <p>Specifies the language of the element's content</p>
     * use on Global Attributes
     */
    public StructureAttributes lang(String value) {
        return with("lang", value);
    }

    /**
     * <p>Specifies the language of the element's content</p>
     * use on Global Attributes
     */
    public StructureAttributes lang(String value, boolean toAdd) {
        return with("lang", value, toAdd);
    }

    /**
     * <p>Refers to a <datalist> element that contains pre-defined options for an <input> element</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes list(String value) {
        return with("list", value);
    }

    /**
     * <p>Refers to a <datalist> element that contains pre-defined options for an <input> element</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes list(String value, boolean toAdd) {
        return with("list", value, toAdd);
    }

    /**
     * <p>Specifies that the audio/video will start over again, every time it is finished</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes loop(String value) {
        return with("loop", value);
    }

    /**
     * <p>Specifies that the audio/video will start over again, every time it is finished</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes loop(String value, boolean toAdd) {
        return with("loop", value, toAdd);
    }

    /**
     * <p>Specifies the range that is considered to be a low value</p>
     * use on &lt;meter&gt;
     */
    public StructureAttributes low(String value) {
        return with("low", value);
    }

    /**
     * <p>Specifies the range that is considered to be a low value</p>
     * use on &lt;meter&gt;
     */
    public StructureAttributes low(String value, boolean toAdd) {
        return with("low", value, toAdd);
    }

    /**
     * <p>Specifies the maximum value</p>
     * use on &lt;input&gt;, &lt;meter&gt;, &lt;progress&gt;
     */
    public StructureAttributes max(String value) {
        return with("max", value);
    }

    /**
     * <p>Specifies the maximum value</p>
     * use on &lt;input&gt;, &lt;meter&gt;, &lt;progress&gt;
     */
    public StructureAttributes max(String value, boolean toAdd) {
        return with("max", value, toAdd);
    }

    /**
     * <p>Specifies the maximum number of characters allowed in an element</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes maxlength(String value) {
        return with("maxlength", value);
    }

    /**
     * <p>Specifies the maximum number of characters allowed in an element</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes maxlength(String value, boolean toAdd) {
        return with("maxlength", value, toAdd);
    }

    /**
     * <p>Specifies what media/device the linked document is optimized for</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;link&gt;, &lt;source&gt;, &lt;style&gt;
     */
    public StructureAttributes media(String value) {
        return with("media", value);
    }

    /**
     * <p>Specifies what media/device the linked document is optimized for</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;link&gt;, &lt;source&gt;, &lt;style&gt;
     */
    public StructureAttributes media(String value, boolean toAdd) {
        return with("media", value, toAdd);
    }

    /**
     * <p>Specifies the HTTP method to use when sending form-data</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes method(String value) {
        return with("method", value);
    }

    /**
     * <p>Specifies the HTTP method to use when sending form-data</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes method(String value, boolean toAdd) {
        return with("method", value, toAdd);
    }

    /**
     * <p>Specifies a minimum value</p>
     * use on &lt;input&gt;, &lt;meter&gt;
     */
    public StructureAttributes min(String value) {
        return with("min", value);
    }

    /**
     * <p>Specifies a minimum value</p>
     * use on &lt;input&gt;, &lt;meter&gt;
     */
    public StructureAttributes min(String value, boolean toAdd) {
        return with("min", value, toAdd);
    }

    /**
     * <p>Specifies that a user can enter more than one value</p>
     * use on &lt;input&gt;, &lt;select&gt;
     */
    public StructureAttributes multiple(String value) {
        return with("multiple", value);
    }

    /**
     * <p>Specifies that a user can enter more than one value</p>
     * use on &lt;input&gt;, &lt;select&gt;
     */
    public StructureAttributes multiple(String value, boolean toAdd) {
        return with("multiple", value, toAdd);
    }

    /**
     * <p>Specifies that the audio output of the video should be muted</p>
     * use on &lt;video&gt;, &lt;audio&gt;
     */
    public StructureAttributes muted(String value) {
        return with("muted", value);
    }

    /**
     * <p>Specifies that the audio output of the video should be muted</p>
     * use on &lt;video&gt;, &lt;audio&gt;
     */
    public StructureAttributes muted(String value, boolean toAdd) {
        return with("muted", value, toAdd);
    }

    /**
     * <p>Specifies the name of the element</p>
     * use on &lt;button&gt;, &lt;fieldset&gt;, &lt;form&gt;, &lt;iframe&gt;, &lt;input&gt;, &lt;map&gt;, &lt;meta&gt;, &lt;object&gt;, &lt;output&gt;, &lt;param&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes name(String value) {
        return with("name", value);
    }

    /**
     * <p>Specifies the name of the element</p>
     * use on &lt;button&gt;, &lt;fieldset&gt;, &lt;form&gt;, &lt;iframe&gt;, &lt;input&gt;, &lt;map&gt;, &lt;meta&gt;, &lt;object&gt;, &lt;output&gt;, &lt;param&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes name(String value, boolean toAdd) {
        return with("name", value, toAdd);
    }

    /**
     * <p>Specifies that the form should not be validated when submitted</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes novalidate(String value) {
        return with("novalidate", value);
    }

    /**
     * <p>Specifies that the form should not be validated when submitted</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes novalidate(String value, boolean toAdd) {
        return with("novalidate", value, toAdd);
    }

    /**
     * <p>Script to be run on abort</p>
     * use on &lt;audio&gt;, &lt;embed&gt;, &lt;img&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes onabort(String value) {
        return with("onabort", value);
    }

    /**
     * <p>Script to be run on abort</p>
     * use on &lt;audio&gt;, &lt;embed&gt;, &lt;img&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes onabort(String value, boolean toAdd) {
        return with("onabort", value, toAdd);
    }

    /**
     * <p>Script to be run after the document is printed</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onafterprint(String value) {
        return with("onafterprint", value);
    }

    /**
     * <p>Script to be run after the document is printed</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onafterprint(String value, boolean toAdd) {
        return with("onafterprint", value, toAdd);
    }

    /**
     * <p>Script to be run before the document is printed</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onbeforeprint(String value) {
        return with("onbeforeprint", value);
    }

    /**
     * <p>Script to be run before the document is printed</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onbeforeprint(String value, boolean toAdd) {
        return with("onbeforeprint", value, toAdd);
    }

    /**
     * <p>Script to be run when the document is about to be unloaded</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onbeforeunload(String value) {
        return with("onbeforeunload", value);
    }

    /**
     * <p>Script to be run when the document is about to be unloaded</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onbeforeunload(String value, boolean toAdd) {
        return with("onbeforeunload", value, toAdd);
    }

    /**
     * <p>Script to be run when the element loses focus</p>
     * use on All visible elements.
     */
    public StructureAttributes onblur(String value) {
        return with("onblur", value);
    }

    /**
     * <p>Script to be run when the element loses focus</p>
     * use on All visible elements.
     */
    public StructureAttributes onblur(String value, boolean toAdd) {
        return with("onblur", value, toAdd);
    }

    /**
     * <p>Script to be run when a file is ready to start playing (when it has buffered enough to begin)</p>
     * use on &lt;audio&gt;, &lt;embed&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes oncanplay(String value) {
        return with("oncanplay", value);
    }

    /**
     * <p>Script to be run when a file is ready to start playing (when it has buffered enough to begin)</p>
     * use on &lt;audio&gt;, &lt;embed&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes oncanplay(String value, boolean toAdd) {
        return with("oncanplay", value, toAdd);
    }

    /**
     * <p>Script to be run when a file can be played all the way to the end without pausing for buffering</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes oncanplaythrough(String value) {
        return with("oncanplaythrough", value);
    }

    /**
     * <p>Script to be run when a file can be played all the way to the end without pausing for buffering</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes oncanplaythrough(String value, boolean toAdd) {
        return with("oncanplaythrough", value, toAdd);
    }

    /**
     * <p>Script to be run when the value of the element is changed</p>
     * use on All visible elements.
     */
    public StructureAttributes onchange(String value) {
        return with("onchange", value);
    }

    /**
     * <p>Script to be run when the value of the element is changed</p>
     * use on All visible elements.
     */
    public StructureAttributes onchange(String value, boolean toAdd) {
        return with("onchange", value, toAdd);
    }

    /**
     * <p>Script to be run when the element is being clicked</p>
     * use on All visible elements.
     */
    public StructureAttributes onclick(String value) {
        return with("onclick", value);
    }

    /**
     * <p>Script to be run when the element is being clicked</p>
     * use on All visible elements.
     */
    public StructureAttributes onclick(String value, boolean toAdd) {
        return with("onclick", value, toAdd);
    }

    /**
     * <p>Script to be run when a context menu is triggered</p>
     * use on All visible elements.
     */
    public StructureAttributes oncontextmenu(String value) {
        return with("oncontextmenu", value);
    }

    /**
     * <p>Script to be run when a context menu is triggered</p>
     * use on All visible elements.
     */
    public StructureAttributes oncontextmenu(String value, boolean toAdd) {
        return with("oncontextmenu", value, toAdd);
    }

    /**
     * <p>Script to be run when the content of the element is being copied</p>
     * use on All visible elements.
     */
    public StructureAttributes oncopy(String value) {
        return with("oncopy", value);
    }

    /**
     * <p>Script to be run when the content of the element is being copied</p>
     * use on All visible elements.
     */
    public StructureAttributes oncopy(String value, boolean toAdd) {
        return with("oncopy", value, toAdd);
    }

    /**
     * <p>Script to be run when the cue changes in a <track> element</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes oncuechange(String value) {
        return with("oncuechange", value);
    }

    /**
     * <p>Script to be run when the cue changes in a <track> element</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes oncuechange(String value, boolean toAdd) {
        return with("oncuechange", value, toAdd);
    }

    /**
     * <p>Script to be run when the content of the element is being cut</p>
     * use on All visible elements.
     */
    public StructureAttributes oncut(String value) {
        return with("oncut", value);
    }

    /**
     * <p>Script to be run when the content of the element is being cut</p>
     * use on All visible elements.
     */
    public StructureAttributes oncut(String value, boolean toAdd) {
        return with("oncut", value, toAdd);
    }

    /**
     * <p>Script to be run when the element is being double-clicked</p>
     * use on All visible elements.
     */
    public StructureAttributes ondblclick(String value) {
        return with("ondblclick", value);
    }

    /**
     * <p>Script to be run when the element is being double-clicked</p>
     * use on All visible elements.
     */
    public StructureAttributes ondblclick(String value, boolean toAdd) {
        return with("ondblclick", value, toAdd);
    }

    /**
     * <p>Script to be run when the element is being dragged</p>
     * use on All visible elements.
     */
    public StructureAttributes ondrag(String value) {
        return with("ondrag", value);
    }

    /**
     * <p>Script to be run when the element is being dragged</p>
     * use on All visible elements.
     */
    public StructureAttributes ondrag(String value, boolean toAdd) {
        return with("ondrag", value, toAdd);
    }

    /**
     * <p>Script to be run at the end of a drag operation</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragend(String value) {
        return with("ondragend", value);
    }

    /**
     * <p>Script to be run at the end of a drag operation</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragend(String value, boolean toAdd) {
        return with("ondragend", value, toAdd);
    }

    /**
     * <p>Script to be run when an element has been dragged to a valid drop target</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragenter(String value) {
        return with("ondragenter", value);
    }

    /**
     * <p>Script to be run when an element has been dragged to a valid drop target</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragenter(String value, boolean toAdd) {
        return with("ondragenter", value, toAdd);
    }

    /**
     * <p>Script to be run when an element leaves a valid drop target</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragleave(String value) {
        return with("ondragleave", value);
    }

    /**
     * <p>Script to be run when an element leaves a valid drop target</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragleave(String value, boolean toAdd) {
        return with("ondragleave", value, toAdd);
    }

    /**
     * <p>Script to be run when an element is being dragged over a valid drop target</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragover(String value) {
        return with("ondragover", value);
    }

    /**
     * <p>Script to be run when an element is being dragged over a valid drop target</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragover(String value, boolean toAdd) {
        return with("ondragover", value, toAdd);
    }

    /**
     * <p>Script to be run at the start of a drag operation</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragstart(String value) {
        return with("ondragstart", value);
    }

    /**
     * <p>Script to be run at the start of a drag operation</p>
     * use on All visible elements.
     */
    public StructureAttributes ondragstart(String value, boolean toAdd) {
        return with("ondragstart", value, toAdd);
    }

    /**
     * <p>Script to be run when dragged element is being dropped</p>
     * use on All visible elements.
     */
    public StructureAttributes ondrop(String value) {
        return with("ondrop", value);
    }

    /**
     * <p>Script to be run when dragged element is being dropped</p>
     * use on All visible elements.
     */
    public StructureAttributes ondrop(String value, boolean toAdd) {
        return with("ondrop", value, toAdd);
    }

    /**
     * <p>Script to be run when the length of the media changes</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes ondurationchange(String value) {
        return with("ondurationchange", value);
    }

    /**
     * <p>Script to be run when the length of the media changes</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes ondurationchange(String value, boolean toAdd) {
        return with("ondurationchange", value, toAdd);
    }

    /**
     * <p>Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onemptied(String value) {
        return with("onemptied", value);
    }

    /**
     * <p>Script to be run when something bad happens and the file is suddenly unavailable (like unexpectedly disconnects)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onemptied(String value, boolean toAdd) {
        return with("onemptied", value, toAdd);
    }

    /**
     * <p>Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onended(String value) {
        return with("onended", value);
    }

    /**
     * <p>Script to be run when the media has reach the end (a useful event for messages like "thanks for listening")</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onended(String value, boolean toAdd) {
        return with("onended", value, toAdd);
    }

    /**
     * <p>Script to be run when an error occurs</p>
     * use on &lt;audio&gt;, &lt;body&gt;, &lt;embed&gt;, &lt;img&gt;, &lt;object&gt;, &lt;script&gt;, &lt;style&gt;, &lt;video&gt;
     */
    public StructureAttributes onerror(String value) {
        return with("onerror", value);
    }

    /**
     * <p>Script to be run when an error occurs</p>
     * use on &lt;audio&gt;, &lt;body&gt;, &lt;embed&gt;, &lt;img&gt;, &lt;object&gt;, &lt;script&gt;, &lt;style&gt;, &lt;video&gt;
     */
    public StructureAttributes onerror(String value, boolean toAdd) {
        return with("onerror", value, toAdd);
    }

    /**
     * <p>Script to be run when the element gets focus</p>
     * use on All visible elements.
     */
    public StructureAttributes onfocus(String value) {
        return with("onfocus", value);
    }

    /**
     * <p>Script to be run when the element gets focus</p>
     * use on All visible elements.
     */
    public StructureAttributes onfocus(String value, boolean toAdd) {
        return with("onfocus", value, toAdd);
    }

    /**
     * <p>Script to be run when there has been changes to the anchor part of the a URL</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onhashchange(String value) {
        return with("onhashchange", value);
    }

    /**
     * <p>Script to be run when there has been changes to the anchor part of the a URL</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onhashchange(String value, boolean toAdd) {
        return with("onhashchange", value, toAdd);
    }

    /**
     * <p>Script to be run when the element gets user input</p>
     * use on All visible elements.
     */
    public StructureAttributes oninput(String value) {
        return with("oninput", value);
    }

    /**
     * <p>Script to be run when the element gets user input</p>
     * use on All visible elements.
     */
    public StructureAttributes oninput(String value, boolean toAdd) {
        return with("oninput", value, toAdd);
    }

    /**
     * <p>Script to be run when the element is invalid</p>
     * use on All visible elements.
     */
    public StructureAttributes oninvalid(String value) {
        return with("oninvalid", value);
    }

    /**
     * <p>Script to be run when the element is invalid</p>
     * use on All visible elements.
     */
    public StructureAttributes oninvalid(String value, boolean toAdd) {
        return with("oninvalid", value, toAdd);
    }

    /**
     * <p>Script to be run when a user is pressing a key</p>
     * use on All visible elements.
     */
    public StructureAttributes onkeydown(String value) {
        return with("onkeydown", value);
    }

    /**
     * <p>Script to be run when a user is pressing a key</p>
     * use on All visible elements.
     */
    public StructureAttributes onkeydown(String value, boolean toAdd) {
        return with("onkeydown", value, toAdd);
    }

    /**
     * <p>Script to be run when a user presses a key</p>
     * use on All visible elements.
     */
    public StructureAttributes onkeypress(String value) {
        return with("onkeypress", value);
    }

    /**
     * <p>Script to be run when a user presses a key</p>
     * use on All visible elements.
     */
    public StructureAttributes onkeypress(String value, boolean toAdd) {
        return with("onkeypress", value, toAdd);
    }

    /**
     * <p>Script to be run when a user releases a key</p>
     * use on All visible elements.
     */
    public StructureAttributes onkeyup(String value) {
        return with("onkeyup", value);
    }

    /**
     * <p>Script to be run when a user releases a key</p>
     * use on All visible elements.
     */
    public StructureAttributes onkeyup(String value, boolean toAdd) {
        return with("onkeyup", value, toAdd);
    }

    /**
     * <p>Script to be run when the element is finished loading</p>
     * use on &lt;body&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;link&gt;, &lt;script&gt;, &lt;style&gt;
     */
    public StructureAttributes onload(String value) {
        return with("onload", value);
    }

    /**
     * <p>Script to be run when the element is finished loading</p>
     * use on &lt;body&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;link&gt;, &lt;script&gt;, &lt;style&gt;
     */
    public StructureAttributes onload(String value, boolean toAdd) {
        return with("onload", value, toAdd);
    }

    /**
     * <p>Script to be run when media data is loaded</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onloadeddata(String value) {
        return with("onloadeddata", value);
    }

    /**
     * <p>Script to be run when media data is loaded</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onloadeddata(String value, boolean toAdd) {
        return with("onloadeddata", value, toAdd);
    }

    /**
     * <p>Script to be run when meta data (like dimensions and duration) are loaded</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onloadedmetadata(String value) {
        return with("onloadedmetadata", value);
    }

    /**
     * <p>Script to be run when meta data (like dimensions and duration) are loaded</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onloadedmetadata(String value, boolean toAdd) {
        return with("onloadedmetadata", value, toAdd);
    }

    /**
     * <p>Script to be run just as the file begins to load before anything is actually loaded</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onloadstart(String value) {
        return with("onloadstart", value);
    }

    /**
     * <p>Script to be run just as the file begins to load before anything is actually loaded</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onloadstart(String value, boolean toAdd) {
        return with("onloadstart", value, toAdd);
    }

    /**
     * <p>Script to be run when a mouse button is pressed down on an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmousedown(String value) {
        return with("onmousedown", value);
    }

    /**
     * <p>Script to be run when a mouse button is pressed down on an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmousedown(String value, boolean toAdd) {
        return with("onmousedown", value, toAdd);
    }

    /**
     * <p>Script to be run as long as the  mouse pointer is moving over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmousemove(String value) {
        return with("onmousemove", value);
    }

    /**
     * <p>Script to be run as long as the  mouse pointer is moving over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmousemove(String value, boolean toAdd) {
        return with("onmousemove", value, toAdd);
    }

    /**
     * <p>Script to be run when a mouse pointer moves out of an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmouseout(String value) {
        return with("onmouseout", value);
    }

    /**
     * <p>Script to be run when a mouse pointer moves out of an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmouseout(String value, boolean toAdd) {
        return with("onmouseout", value, toAdd);
    }

    /**
     * <p>Script to be run when a mouse pointer moves over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmouseover(String value) {
        return with("onmouseover", value);
    }

    /**
     * <p>Script to be run when a mouse pointer moves over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmouseover(String value, boolean toAdd) {
        return with("onmouseover", value, toAdd);
    }

    /**
     * <p>Script to be run when a mouse button is released over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmouseup(String value) {
        return with("onmouseup", value);
    }

    /**
     * <p>Script to be run when a mouse button is released over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmouseup(String value, boolean toAdd) {
        return with("onmouseup", value, toAdd);
    }

    /**
     * <p>Script to be run when a mouse wheel is being scrolled over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmousewheel(String value) {
        return with("onmousewheel", value);
    }

    /**
     * <p>Script to be run when a mouse wheel is being scrolled over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onmousewheel(String value, boolean toAdd) {
        return with("onmousewheel", value, toAdd);
    }

    /**
     * <p>Script to be run when the browser starts to work offline</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onoffline(String value) {
        return with("onoffline", value);
    }

    /**
     * <p>Script to be run when the browser starts to work offline</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onoffline(String value, boolean toAdd) {
        return with("onoffline", value, toAdd);
    }

    /**
     * <p>Script to be run when the browser starts to work online</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes ononline(String value) {
        return with("ononline", value);
    }

    /**
     * <p>Script to be run when the browser starts to work online</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes ononline(String value, boolean toAdd) {
        return with("ononline", value, toAdd);
    }

    /**
     * <p>Script to be run when a user navigates away from a page</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onpagehide(String value) {
        return with("onpagehide", value);
    }

    /**
     * <p>Script to be run when a user navigates away from a page</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onpagehide(String value, boolean toAdd) {
        return with("onpagehide", value, toAdd);
    }

    /**
     * <p>Script to be run when a user navigates to a page</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onpageshow(String value) {
        return with("onpageshow", value);
    }

    /**
     * <p>Script to be run when a user navigates to a page</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onpageshow(String value, boolean toAdd) {
        return with("onpageshow", value, toAdd);
    }

    /**
     * <p>Script to be run when the user pastes some content in an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onpaste(String value) {
        return with("onpaste", value);
    }

    /**
     * <p>Script to be run when the user pastes some content in an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onpaste(String value, boolean toAdd) {
        return with("onpaste", value, toAdd);
    }

    /**
     * <p>Script to be run when the media is paused either by the user or programmatically</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onpause(String value) {
        return with("onpause", value);
    }

    /**
     * <p>Script to be run when the media is paused either by the user or programmatically</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onpause(String value, boolean toAdd) {
        return with("onpause", value, toAdd);
    }

    /**
     * <p>Script to be run when the media has started playing</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onplay(String value) {
        return with("onplay", value);
    }

    /**
     * <p>Script to be run when the media has started playing</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onplay(String value, boolean toAdd) {
        return with("onplay", value, toAdd);
    }

    /**
     * <p>Script to be run when the media has started playing</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onplaying(String value) {
        return with("onplaying", value);
    }

    /**
     * <p>Script to be run when the media has started playing</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onplaying(String value, boolean toAdd) {
        return with("onplaying", value, toAdd);
    }

    /**
     * <p>Script to be run when the window's history changes.</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onpopstate(String value) {
        return with("onpopstate", value);
    }

    /**
     * <p>Script to be run when the window's history changes.</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onpopstate(String value, boolean toAdd) {
        return with("onpopstate", value, toAdd);
    }

    /**
     * <p>Script to be run when the browser is in the process of getting the media data</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onprogress(String value) {
        return with("onprogress", value);
    }

    /**
     * <p>Script to be run when the browser is in the process of getting the media data</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onprogress(String value, boolean toAdd) {
        return with("onprogress", value, toAdd);
    }

    /**
     * <p>Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode).</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onratechange(String value) {
        return with("onratechange", value);
    }

    /**
     * <p>Script to be run each time the playback rate changes (like when a user switches to a slow motion or fast forward mode).</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onratechange(String value, boolean toAdd) {
        return with("onratechange", value, toAdd);
    }

    /**
     * <p>Script to be run when a reset button in a form is clicked.</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes onreset(String value) {
        return with("onreset", value);
    }

    /**
     * <p>Script to be run when a reset button in a form is clicked.</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes onreset(String value, boolean toAdd) {
        return with("onreset", value, toAdd);
    }

    /**
     * <p>Script to be run when the browser window is being resized.</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onresize(String value) {
        return with("onresize", value);
    }

    /**
     * <p>Script to be run when the browser window is being resized.</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onresize(String value, boolean toAdd) {
        return with("onresize", value, toAdd);
    }

    /**
     * <p>Script to be run when an element's scrollbar is being scrolled</p>
     * use on All visible elements.
     */
    public StructureAttributes onscroll(String value) {
        return with("onscroll", value);
    }

    /**
     * <p>Script to be run when an element's scrollbar is being scrolled</p>
     * use on All visible elements.
     */
    public StructureAttributes onscroll(String value, boolean toAdd) {
        return with("onscroll", value, toAdd);
    }

    /**
     * <p>Script to be run when the user writes something in a search field (for <input type="search">)</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes onsearch(String value) {
        return with("onsearch", value);
    }

    /**
     * <p>Script to be run when the user writes something in a search field (for <input type="search">)</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes onsearch(String value, boolean toAdd) {
        return with("onsearch", value, toAdd);
    }

    /**
     * <p>Script to be run when the seeking attribute is set to false indicating that seeking has ended</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onseeked(String value) {
        return with("onseeked", value);
    }

    /**
     * <p>Script to be run when the seeking attribute is set to false indicating that seeking has ended</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onseeked(String value, boolean toAdd) {
        return with("onseeked", value, toAdd);
    }

    /**
     * <p>Script to be run when the seeking attribute is set to true indicating that seeking is active</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onseeking(String value) {
        return with("onseeking", value);
    }

    /**
     * <p>Script to be run when the seeking attribute is set to true indicating that seeking is active</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onseeking(String value, boolean toAdd) {
        return with("onseeking", value, toAdd);
    }

    /**
     * <p>Script to be run when the element gets selected</p>
     * use on All visible elements.
     */
    public StructureAttributes onselect(String value) {
        return with("onselect", value);
    }

    /**
     * <p>Script to be run when the element gets selected</p>
     * use on All visible elements.
     */
    public StructureAttributes onselect(String value, boolean toAdd) {
        return with("onselect", value, toAdd);
    }

    /**
     * <p>Script to be run when the browser is unable to fetch the media data for whatever reason</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onstalled(String value) {
        return with("onstalled", value);
    }

    /**
     * <p>Script to be run when the browser is unable to fetch the media data for whatever reason</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onstalled(String value, boolean toAdd) {
        return with("onstalled", value, toAdd);
    }

    /**
     * <p>Script to be run when a Web Storage area is updated</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onstorage(String value) {
        return with("onstorage", value);
    }

    /**
     * <p>Script to be run when a Web Storage area is updated</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onstorage(String value, boolean toAdd) {
        return with("onstorage", value, toAdd);
    }

    /**
     * <p>Script to be run when a form is submitted</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes onsubmit(String value) {
        return with("onsubmit", value);
    }

    /**
     * <p>Script to be run when a form is submitted</p>
     * use on &lt;form&gt;
     */
    public StructureAttributes onsubmit(String value, boolean toAdd) {
        return with("onsubmit", value, toAdd);
    }

    /**
     * <p>Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onsuspend(String value) {
        return with("onsuspend", value);
    }

    /**
     * <p>Script to be run when fetching the media data is stopped before it is completely loaded for whatever reason</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onsuspend(String value, boolean toAdd) {
        return with("onsuspend", value, toAdd);
    }

    /**
     * <p>Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes ontimeupdate(String value) {
        return with("ontimeupdate", value);
    }

    /**
     * <p>Script to be run when the playing position has changed (like when the user fast forwards to a different point in the media)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes ontimeupdate(String value, boolean toAdd) {
        return with("ontimeupdate", value, toAdd);
    }

    /**
     * <p>Script to be run when the user opens or closes the <details> element</p>
     * use on &lt;details&gt;
     */
    public StructureAttributes ontoggle(String value) {
        return with("ontoggle", value);
    }

    /**
     * <p>Script to be run when the user opens or closes the <details> element</p>
     * use on &lt;details&gt;
     */
    public StructureAttributes ontoggle(String value, boolean toAdd) {
        return with("ontoggle", value, toAdd);
    }

    /**
     * <p>Script to be run when a page has unloaded (or the browser window has been closed)</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onunload(String value) {
        return with("onunload", value);
    }

    /**
     * <p>Script to be run when a page has unloaded (or the browser window has been closed)</p>
     * use on &lt;body&gt;
     */
    public StructureAttributes onunload(String value, boolean toAdd) {
        return with("onunload", value, toAdd);
    }

    /**
     * <p>Script to be run each time the volume of a video/audio has been changed</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onvolumechange(String value) {
        return with("onvolumechange", value);
    }

    /**
     * <p>Script to be run each time the volume of a video/audio has been changed</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onvolumechange(String value, boolean toAdd) {
        return with("onvolumechange", value, toAdd);
    }

    /**
     * <p>Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onwaiting(String value) {
        return with("onwaiting", value);
    }

    /**
     * <p>Script to be run when the media has paused but is expected to resume (like when the media pauses to buffer more data)</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes onwaiting(String value, boolean toAdd) {
        return with("onwaiting", value, toAdd);
    }

    /**
     * <p>Script to be run when the mouse wheel rolls up or down over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onwheel(String value) {
        return with("onwheel", value);
    }

    /**
     * <p>Script to be run when the mouse wheel rolls up or down over an element</p>
     * use on All visible elements.
     */
    public StructureAttributes onwheel(String value, boolean toAdd) {
        return with("onwheel", value, toAdd);
    }

    /**
     * <p>Specifies that the details should be visible (open) to the user</p>
     * use on &lt;details&gt;
     */
    public StructureAttributes open(String value) {
        return with("open", value);
    }

    /**
     * <p>Specifies that the details should be visible (open) to the user</p>
     * use on &lt;details&gt;
     */
    public StructureAttributes open(String value, boolean toAdd) {
        return with("open", value, toAdd);
    }

    /**
     * <p>Specifies what value is the optimal value for the gauge</p>
     * use on &lt;meter&gt;
     */
    public StructureAttributes optimum(String value) {
        return with("optimum", value);
    }

    /**
     * <p>Specifies what value is the optimal value for the gauge</p>
     * use on &lt;meter&gt;
     */
    public StructureAttributes optimum(String value, boolean toAdd) {
        return with("optimum", value, toAdd);
    }

    /**
     * <p>Specifies a regular expression that an <input> element's value is checked against</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes pattern(String value) {
        return with("pattern", value);
    }

    /**
     * <p>Specifies a regular expression that an <input> element's value is checked against</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes pattern(String value, boolean toAdd) {
        return with("pattern", value, toAdd);
    }

    /**
     * <p>Specifies a short hint that describes the expected value of the element</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes placeholder(String value) {
        return with("placeholder", value);
    }

    /**
     * <p>Specifies a short hint that describes the expected value of the element</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes placeholder(String value, boolean toAdd) {
        return with("placeholder", value, toAdd);
    }

    /**
     * <p>Specifies a popover element</p>
     * use on Global Attributes
     */
    public StructureAttributes popover(String value) {
        return with("popover", value);
    }

    /**
     * <p>Specifies a popover element</p>
     * use on Global Attributes
     */
    public StructureAttributes popover(String value, boolean toAdd) {
        return with("popover", value, toAdd);
    }

    /**
     * <p>Specifies which popover element to invokde</p>
     * use on &lt;button&gt;, &lt;input&gt;
     */
    public StructureAttributes popovertarget(String value) {
        return with("popovertarget", value);
    }

    /**
     * <p>Specifies which popover element to invokde</p>
     * use on &lt;button&gt;, &lt;input&gt;
     */
    public StructureAttributes popovertarget(String value, boolean toAdd) {
        return with("popovertarget", value, toAdd);
    }

    /**
     * <p>Specifies what happens to the popover element when the button is clicked</p>
     * use on &lt;button&gt;, &lt;input&gt;
     */
    public StructureAttributes popovertargetaction(String value) {
        return with("popovertargetaction", value);
    }

    /**
     * <p>Specifies what happens to the popover element when the button is clicked</p>
     * use on &lt;button&gt;, &lt;input&gt;
     */
    public StructureAttributes popovertargetaction(String value, boolean toAdd) {
        return with("popovertargetaction", value, toAdd);
    }

    /**
     * <p>Specifies an image to be shown while the video is downloading, or until the user hits the play button</p>
     * use on &lt;video&gt;
     */
    public StructureAttributes poster(String value) {
        return with("poster", value);
    }

    /**
     * <p>Specifies an image to be shown while the video is downloading, or until the user hits the play button</p>
     * use on &lt;video&gt;
     */
    public StructureAttributes poster(String value, boolean toAdd) {
        return with("poster", value, toAdd);
    }

    /**
     * <p>Specifies if and how the author thinks the audio/video should be loaded when the page loads</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes preload(String value) {
        return with("preload", value);
    }

    /**
     * <p>Specifies if and how the author thinks the audio/video should be loaded when the page loads</p>
     * use on &lt;audio&gt;, &lt;video&gt;
     */
    public StructureAttributes preload(String value, boolean toAdd) {
        return with("preload", value, toAdd);
    }

    /**
     * <p>Specifies that the element is read-only</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes readonly(String value) {
        return with("readonly", value);
    }

    /**
     * <p>Specifies that the element is read-only</p>
     * use on &lt;input&gt;, &lt;textarea&gt;
     */
    public StructureAttributes readonly(String value, boolean toAdd) {
        return with("readonly", value, toAdd);
    }

    /**
     * <p>Specifies the relationship between the current document and the linked document</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;form&gt;, &lt;link&gt;
     */
    public StructureAttributes rel(String value) {
        return with("rel", value);
    }

    /**
     * <p>Specifies the relationship between the current document and the linked document</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;form&gt;, &lt;link&gt;
     */
    public StructureAttributes rel(String value, boolean toAdd) {
        return with("rel", value, toAdd);
    }

    /**
     * <p>Specifies that the element must be filled out before submitting the form</p>
     * use on &lt;input&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes required(String value) {
        return with("required", value);
    }

    /**
     * <p>Specifies that the element must be filled out before submitting the form</p>
     * use on &lt;input&gt;, &lt;select&gt;, &lt;textarea&gt;
     */
    public StructureAttributes required(String value, boolean toAdd) {
        return with("required", value, toAdd);
    }

    /**
     * <p>Specifies that the list order should be descending (9,8,7...)</p>
     * use on &lt;ol&gt;
     */
    public StructureAttributes reversed(String value) {
        return with("reversed", value);
    }

    /**
     * <p>Specifies that the list order should be descending (9,8,7...)</p>
     * use on &lt;ol&gt;
     */
    public StructureAttributes reversed(String value, boolean toAdd) {
        return with("reversed", value, toAdd);
    }

    /**
     * <p>Specifies the visible number of lines in a text area</p>
     * use on &lt;textarea&gt;
     */
    public StructureAttributes rows(String value) {
        return with("rows", value);
    }

    /**
     * <p>Specifies the visible number of lines in a text area</p>
     * use on &lt;textarea&gt;
     */
    public StructureAttributes rows(String value, boolean toAdd) {
        return with("rows", value, toAdd);
    }

    /**
     * <p>Specifies the number of rows a table cell should span</p>
     * use on &lt;td&gt;, &lt;th&gt;
     */
    public StructureAttributes rowspan(String value) {
        return with("rowspan", value);
    }

    /**
     * <p>Specifies the number of rows a table cell should span</p>
     * use on &lt;td&gt;, &lt;th&gt;
     */
    public StructureAttributes rowspan(String value, boolean toAdd) {
        return with("rowspan", value, toAdd);
    }

    /**
     * <p>Enables an extra set of restrictions for the content in an <iframe></p>
     * use on &lt;iframe&gt;
     */
    public StructureAttributes sandbox(String value) {
        return with("sandbox", value);
    }

    /**
     * <p>Enables an extra set of restrictions for the content in an <iframe></p>
     * use on &lt;iframe&gt;
     */
    public StructureAttributes sandbox(String value, boolean toAdd) {
        return with("sandbox", value, toAdd);
    }

    /**
     * <p>Specifies whether a header cell is a header for a column, row, or group of columns or rows</p>
     * use on &lt;th&gt;
     */
    public StructureAttributes scope(String value) {
        return with("scope", value);
    }

    /**
     * <p>Specifies whether a header cell is a header for a column, row, or group of columns or rows</p>
     * use on &lt;th&gt;
     */
    public StructureAttributes scope(String value, boolean toAdd) {
        return with("scope", value, toAdd);
    }

    /**
     * <p>Specifies that an option should be pre-selected when the page loads</p>
     * use on &lt;option&gt;
     */
    public StructureAttributes selected(String value) {
        return with("selected", value);
    }

    /**
     * <p>Specifies that an option should be pre-selected when the page loads</p>
     * use on &lt;option&gt;
     */
    public StructureAttributes selected(String value, boolean toAdd) {
        return with("selected", value, toAdd);
    }

    /**
     * <p>Specifies the shape of the area</p>
     * use on &lt;area&gt;
     */
    public StructureAttributes shape(String value) {
        return with("shape", value);
    }

    /**
     * <p>Specifies the shape of the area</p>
     * use on &lt;area&gt;
     */
    public StructureAttributes shape(String value, boolean toAdd) {
        return with("shape", value, toAdd);
    }

    /**
     * <p>Specifies the width, in characters (for <input>) or specifies the number of visible options (for <select>)</p>
     * use on &lt;input&gt;, &lt;select&gt;
     */
    public StructureAttributes size(String value) {
        return with("size", value);
    }

    /**
     * <p>Specifies the width, in characters (for <input>) or specifies the number of visible options (for <select>)</p>
     * use on &lt;input&gt;, &lt;select&gt;
     */
    public StructureAttributes size(String value, boolean toAdd) {
        return with("size", value, toAdd);
    }

    /**
     * <p>Specifies the size of the linked resource</p>
     * use on &lt;img&gt;, &lt;link&gt;, &lt;source&gt;
     */
    public StructureAttributes sizes(String value) {
        return with("sizes", value);
    }

    /**
     * <p>Specifies the size of the linked resource</p>
     * use on &lt;img&gt;, &lt;link&gt;, &lt;source&gt;
     */
    public StructureAttributes sizes(String value, boolean toAdd) {
        return with("sizes", value, toAdd);
    }

    /**
     * <p>Specifies the number of columns to span</p>
     * use on &lt;col&gt;, &lt;colgroup&gt;
     */
    public StructureAttributes span(String value) {
        return with("span", value);
    }

    /**
     * <p>Specifies the number of columns to span</p>
     * use on &lt;col&gt;, &lt;colgroup&gt;
     */
    public StructureAttributes span(String value, boolean toAdd) {
        return with("span", value, toAdd);
    }

    /**
     * <p>Specifies whether the element is to have its spelling and grammar checked or not</p>
     * use on Global Attributes
     */
    public StructureAttributes spellcheck(String value) {
        return with("spellcheck", value);
    }

    /**
     * <p>Specifies whether the element is to have its spelling and grammar checked or not</p>
     * use on Global Attributes
     */
    public StructureAttributes spellcheck(String value, boolean toAdd) {
        return with("spellcheck", value, toAdd);
    }

    /**
     * <p>Specifies the URL of the media file</p>
     * use on &lt;audio&gt;, &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;script&gt;, &lt;source&gt;, &lt;track&gt;, &lt;video&gt;
     */
    public StructureAttributes src(String value) {
        return with("src", value);
    }

    /**
     * <p>Specifies the URL of the media file</p>
     * use on &lt;audio&gt;, &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;script&gt;, &lt;source&gt;, &lt;track&gt;, &lt;video&gt;
     */
    public StructureAttributes src(String value, boolean toAdd) {
        return with("src", value, toAdd);
    }

    /**
     * <p>Specifies the HTML content of the page to show in the <iframe></p>
     * use on &lt;iframe&gt;
     */
    public StructureAttributes srcdoc(String value) {
        return with("srcdoc", value);
    }

    /**
     * <p>Specifies the HTML content of the page to show in the <iframe></p>
     * use on &lt;iframe&gt;
     */
    public StructureAttributes srcdoc(String value, boolean toAdd) {
        return with("srcdoc", value, toAdd);
    }

    /**
     * <p>Specifies the language of the track text data (required if kind="subtitles")</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes srclang(String value) {
        return with("srclang", value);
    }

    /**
     * <p>Specifies the language of the track text data (required if kind="subtitles")</p>
     * use on &lt;track&gt;
     */
    public StructureAttributes srclang(String value, boolean toAdd) {
        return with("srclang", value, toAdd);
    }

    /**
     * <p>Specifies the URL of the image to use in different situations</p>
     * use on &lt;img&gt;, &lt;source&gt;
     */
    public StructureAttributes srcset(String value) {
        return with("srcset", value);
    }

    /**
     * <p>Specifies the URL of the image to use in different situations</p>
     * use on &lt;img&gt;, &lt;source&gt;
     */
    public StructureAttributes srcset(String value, boolean toAdd) {
        return with("srcset", value, toAdd);
    }

    /**
     * <p>Specifies the start value of an ordered list</p>
     * use on &lt;ol&gt;
     */
    public StructureAttributes start(String value) {
        return with("start", value);
    }

    /**
     * <p>Specifies the start value of an ordered list</p>
     * use on &lt;ol&gt;
     */
    public StructureAttributes start(String value, boolean toAdd) {
        return with("start", value, toAdd);
    }

    /**
     * <p>Specifies the legal number intervals for an input field</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes step(String value) {
        return with("step", value);
    }

    /**
     * <p>Specifies the legal number intervals for an input field</p>
     * use on &lt;input&gt;
     */
    public StructureAttributes step(String value, boolean toAdd) {
        return with("step", value, toAdd);
    }

    /**
     * <p>Specifies an inline CSS style for an element</p>
     * use on Global Attributes
     */
    public StructureAttributes style(String value) {
        return with("style", value);
    }

    /**
     * <p>Specifies an inline CSS style for an element</p>
     * use on Global Attributes
     */
    public StructureAttributes style(String value, boolean toAdd) {
        return with("style", value, toAdd);
    }

    /**
     * <p>Specifies the tabbing order of an element</p>
     * use on Global Attributes
     */
    public StructureAttributes tabindex(String value) {
        return with("tabindex", value);
    }

    /**
     * <p>Specifies the tabbing order of an element</p>
     * use on Global Attributes
     */
    public StructureAttributes tabindex(String value, boolean toAdd) {
        return with("tabindex", value, toAdd);
    }

    /**
     * <p>Specifies the target for where to open the linked document or where to submit the form</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;base&gt;, &lt;form&gt;
     */
    public StructureAttributes target(String value) {
        return with("target", value);
    }

    /**
     * <p>Specifies the target for where to open the linked document or where to submit the form</p>
     * use on &lt;a&gt;, &lt;area&gt;, &lt;base&gt;, &lt;form&gt;
     */
    public StructureAttributes target(String value, boolean toAdd) {
        return with("target", value, toAdd);
    }

    /**
     * <p>Specifies extra information about an element</p>
     * use on Global Attributes
     */
    public StructureAttributes title(String value) {
        return with("title", value);
    }

    /**
     * <p>Specifies extra information about an element</p>
     * use on Global Attributes
     */
    public StructureAttributes title(String value, boolean toAdd) {
        return with("title", value, toAdd);
    }

    /**
     * <p>Specifies whether the content of an element should be translated or not</p>
     * use on Global Attributes
     */
    public StructureAttributes translate(String value) {
        return with("translate", value);
    }

    /**
     * <p>Specifies whether the content of an element should be translated or not</p>
     * use on Global Attributes
     */
    public StructureAttributes translate(String value, boolean toAdd) {
        return with("translate", value, toAdd);
    }

    /**
     * <p>Specifies the type of element</p>
     * use on &lt;a&gt;, &lt;button&gt;, &lt;embed&gt;, &lt;input&gt;, &lt;link&gt;, &lt;menu&gt;, &lt;object&gt;, &lt;script&gt;, &lt;source&gt;, &lt;style&gt;
     */
    public StructureAttributes type(String value) {
        return with("type", value);
    }

    /**
     * <p>Specifies the type of element</p>
     * use on &lt;a&gt;, &lt;button&gt;, &lt;embed&gt;, &lt;input&gt;, &lt;link&gt;, &lt;menu&gt;, &lt;object&gt;, &lt;script&gt;, &lt;source&gt;, &lt;style&gt;
     */
    public StructureAttributes type(String value, boolean toAdd) {
        return with("type", value, toAdd);
    }

    /**
     * <p>Specifies an image as a client-side image map</p>
     * use on &lt;img&gt;, &lt;object&gt;
     */
    public StructureAttributes usemap(String value) {
        return with("usemap", value);
    }

    /**
     * <p>Specifies an image as a client-side image map</p>
     * use on &lt;img&gt;, &lt;object&gt;
     */
    public StructureAttributes usemap(String value, boolean toAdd) {
        return with("usemap", value, toAdd);
    }

    /**
     * <p>Specifies the value of the element</p>
     * use on &lt;button&gt;, &lt;input&gt;, &lt;li&gt;, &lt;option&gt;, &lt;meter&gt;, &lt;progress&gt;, &lt;param&gt;
     */
    public StructureAttributes value(String value) {
        return with("value", value);
    }

    /**
     * <p>Specifies the value of the element</p>
     * use on &lt;button&gt;, &lt;input&gt;, &lt;li&gt;, &lt;option&gt;, &lt;meter&gt;, &lt;progress&gt;, &lt;param&gt;
     */
    public StructureAttributes value(String value, boolean toAdd) {
        return with("value", value, toAdd);
    }

    /**
     * <p>Specifies the width of the element</p>
     * use on &lt;canvas&gt;, &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes width(String value) {
        return with("width", value);
    }

    /**
     * <p>Specifies the width of the element</p>
     * use on &lt;canvas&gt;, &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;input&gt;, &lt;object&gt;, &lt;video&gt;
     */
    public StructureAttributes width(String value, boolean toAdd) {
        return with("width", value, toAdd);
    }

    /**
     * <p>Specifies how the text in a text area is to be wrapped when submitted in a form</p>
     * use on &lt;textarea&gt;
     */
    public StructureAttributes wrap(String value) {
        return with("wrap", value);
    }

    /**
     * <p>Specifies how the text in a text area is to be wrapped when submitted in a form</p>
     * use on &lt;textarea&gt;
     */
    public StructureAttributes wrap(String value, boolean toAdd) {
        return with("wrap", value, toAdd);
    }

}
