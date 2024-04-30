package toedy.html_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class HTTPApplication {
    private final Router router;
//    toedy.html_server.DependencyInjector dependencyInjector;

//    toedy.html_server.WebConfig config;

    public HTTPApplication() {
//        dependencyInjector = new toedy.html_server.DependencyInjector();
//        router = dependencyInjector.create(toedy.html_server.Router.class);
        router = new Router();
//        config = new toedy.html_server.WebConfig();
    }

//    public void config(toedy.html_server.WebConfig config) {
//        this.config = config;
//    }

    public Router router() {
        return router;
    }

    public void run() throws IOException {
//        dependencyInjector.addSingleton(config);
        router.build();

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                Socket client = serverSocket.accept();
                Thread handler = new Thread(() -> handleClient(client));
                handler.start();
            }
        }
    }

    private void handleClient(Socket client) {
        try (client) {
            HTTPRequest request = readRequest(client);
            if (Objects.isNull(request))
                return;

            String path = request.path();
            if (writeRouter(client, path))
                return;
            if (writePublic(client, path))
                return;

            OutputStream clientOutput = client.getOutputStream();
            clientOutput.write("HTTP/1.1 404 NotFound\r\n".getBytes());
            clientOutput.write(("ContentType: text/html\r\n").getBytes());
            clientOutput.write("\r\n".getBytes());
            clientOutput.write("<h1>404 Not Found</h1>".getBytes());
            clientOutput.write("\r\n\r\n".getBytes());
            clientOutput.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private HTTPRequest readRequest(Socket client) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String line;
        if (!(line = br.readLine()).isBlank()) {
            String[] words = line.split(" ");
            return new HTTPRequest(words[0], words[1], words[2]);
        }
        return null;
    }

    private boolean writeRouter(Socket client, String path) throws IOException {
        String response = null;
        Throwable throwable = null;
        try {
            response = router.call(path);
        } catch (Throwable e) {
            throwable = e;
        }
        if (Objects.isNull(response) && Objects.isNull(throwable))
            return false;

        OutputStream clientOutput = client.getOutputStream();
        if (Objects.nonNull(response))
            clientOutput.write("HTTP/1.1 200 OK\r\n".getBytes());
        else
            clientOutput.write("HTTP/1.1 500\r\n".getBytes());
        clientOutput.write(("ContentType: text/html\r\n").getBytes());
        clientOutput.write("\r\n".getBytes());
        if (Objects.nonNull(response))
            clientOutput.write(response.getBytes());
        else
            throwable.printStackTrace(new PrintStream(clientOutput));
        clientOutput.write("\r\n\r\n".getBytes());
        clientOutput.flush();
        return true;
    }

    private boolean writePublic(Socket client, String path) throws IOException {
        if (!path.startsWith(WebConfig.publicServePath))
            return false;
        String trimmedPath = path.substring(WebConfig.publicServePath.length());
        Path actualPath = Paths.get(System.getProperty("user.dir"), WebConfig.publicDirPath, trimmedPath);
        if (Files.isDirectory(actualPath))
            actualPath = actualPath.resolve("index.html");
        if (!Files.exists(actualPath))
            return false;

        OutputStream clientOutput = client.getOutputStream();
        clientOutput.write("HTTP/1.1 200 OK\r\n".getBytes());
        clientOutput.write(("ContentType: " + Files.probeContentType(actualPath) + "\r\n").getBytes());
        clientOutput.write("\r\n".getBytes());
        clientOutput.write(Files.readAllBytes(actualPath));
        clientOutput.write("\r\n\r\n".getBytes());
        clientOutput.flush();
        return true;
    }
}
