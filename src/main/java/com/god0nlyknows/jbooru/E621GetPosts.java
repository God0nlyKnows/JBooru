package com.god0nlyknows.jbooru;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.god0nlyknows.jbooru.dto.E621ResponseDTO;
import com.god0nlyknows.jbooru.dto.IResponseDTO;

public class E621GetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 320; // max per request
    private int page = 1;

    @Override
    public List<IResponseDTO> getPosts(String tag) {

        return sendRequest(String.format("https://e621.net/posts.json?limit=%s&page=%s&tags=%s", limit, page, tag),
                E621ResponseDTO[].class);
    }

    @Override
    public <T> List<IResponseDTO> sendRequest(String url, Class<T> clazz) {
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(
                URI.create(url))
                .header("accept", "application/json")
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper om = new ObjectMapper();
            JsonNode jsonResponse = om.readTree(response.body());

            List<IResponseDTO> posts = new ArrayList<IResponseDTO>();
            for (JsonNode node : jsonResponse.get("posts")) {
                posts.add(new E621ResponseDTO(
                        node.get("file").get("url").textValue(),
                        node.get("score").get("total").textValue(),
                        node.get("rating").textValue(),
                        getAllStrings(node.get("tags").get("artist"), " "),
                        getAllStrings(node.get("sources"), " "),
                        getAllStrings(node.get("tags").get("character"), " ") + " "
                                + getAllStrings(node.get("tags").get("general"), " ") + " "
                                + getAllStrings(node.get("tags").get("meta"), " ") + " "
                                + getAllStrings(node.get("tags").get("species"), " ")

                ));

            }
            return posts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
