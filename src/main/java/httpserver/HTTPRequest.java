package httpserver;

public record HTTPRequest(String method, String path, String version) {
}
