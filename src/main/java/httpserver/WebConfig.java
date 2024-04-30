package httpserver;

public class WebConfig {
    /**
     * Generate smaller but unreadable html code
     */
    public static boolean minifyOutput = false;

    /**
     * The root path of the public directory
     */
    public static String publicDirPath = "/public";

    /**
     * <p>The root path of the public directory in the url</p>
     * Setting <code>publicServePath = "/my/pub/path"</code> will make entering url
     * http://host/my/pub/path point to the public folder
     */
    public static String publicServePath = "/";

    /**
     * Listen at port
     */
    public static int port = 8080;
}
