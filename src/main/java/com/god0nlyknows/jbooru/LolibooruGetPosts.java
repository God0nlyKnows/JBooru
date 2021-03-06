package com.god0nlyknows.jbooru;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.god0nlyknows.jbooru.dto.IResponseDTO;
import com.god0nlyknows.jbooru.dto.LolibooruResponseDTO;

public class LolibooruGetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 1000; // max per request
    private int page = 1;

    @Override
    public List<IResponseDTO> getPosts(String tag) {

        //var posts1 = sendRequest(String.format("https://lolibooru.moe/post/index.json?limit=%s&page=%s&tag=%s", limit, page, tag),LolibooruResponseDTO[].class);
        var posts2 = sendRequest(String.format("https://lolibooru.moe/post/index.json?limit=%s&page=%s&tags=%s", limit, page, tag),LolibooruResponseDTO[].class);
        //return (posts1.size()>posts2.size())?posts1:posts2;
        return posts2;
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
            for (JsonNode node : jsonResponse) {
                posts.add(new LolibooruResponseDTO(
                        node.get("file_url").textValue(),
                        node.get("score").textValue(),
                        node.get("rating").textValue(),
                        node.get("author").textValue(),
                        node.get("source").textValue(),
                        node.get("tags").textValue()

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
