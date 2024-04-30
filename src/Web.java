import controllers.IndexController;
import httpserver.HTTPApplication;
import httpserver.WebConfig;

public class Web {
    public static void main(String[] args) throws Exception {
        WebConfig.port = 5100;
        WebConfig.publicServePath = "/public";
        HTTPApplication app = new HTTPApplication();
        app.router().registerController(IndexController.class);
        app.run();
    }
}