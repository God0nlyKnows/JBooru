package com.god0nlyknows.jbooru;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.god0nlyknows.jbooru.dto.IResponseDTO;

public class GetPostsBase {
    public <T> IResponseDTO[] sendRequest(String url, Class<T> clazz){
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(
                URI.create(url))
                .header("accept", "application/json")
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper om=new ObjectMapper();
            JsonNode json = om.readTree(response.body());
                for (JsonNode node : json) {
                    String urlFile = node.get("file_url").textValue();
                    String author = node.get("author").textValue();
                }
            return (IResponseDTO[]) om.readValue(response.body().toString(),clazz);
            
        } catch (Exception e) {
            return null;
        }
    }
}
