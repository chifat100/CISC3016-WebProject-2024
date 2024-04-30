package toedy.html_server;

public record HTTPRequest(String method, String path, String version) {
}
