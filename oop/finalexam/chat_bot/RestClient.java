package oop.finalexam.chat_bot;
import java.io.*;
import java.net.*;

public class RestClient {
    private final String baseUrl;

    public RestClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getAllPosts() throws IOException {
        return sendRequest("GET", "/posts", null);
    }

    public String getStatistics() throws IOException {
        return sendRequest("GET", "/stats", null);
    }

    public String createPost(String title, String content, String author) throws IOException {
        String params = "title=" + URLEncoder.encode(title, "UTF-8") +
                        "&content=" + URLEncoder.encode(content, "UTF-8") +
                        "&author=" + URLEncoder.encode(author, "UTF-8");
        return sendRequest("POST", "/posts", params);
    }

    private String sendRequest(String method, String endpoint, String params) throws IOException {
        URL url = new URL(baseUrl + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);

        if ("POST".equals(method) && params != null) {
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            try (OutputStream os = conn.getOutputStream()) {
                os.write(params.getBytes());
            }
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line).append('\n');
            }
            return response.toString();
        }
    }
}
