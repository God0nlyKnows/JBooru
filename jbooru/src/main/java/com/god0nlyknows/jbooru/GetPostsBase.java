package com.god0nlyknows.jbooru;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.god0nlyknows.jbooru.dto.IResponseDTO;

public abstract class GetPostsBase {
    protected <T> List<IResponseDTO> sendRequest(String url, Class<T> clazz){
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(
                URI.create(url))
                .header("accept", "application/json")
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper om=new ObjectMapper();
            return List.of((IResponseDTO[]) om.readValue(response.body().toString(),clazz));
            
        } catch (Exception e) {
            return null;
        }
    }

    protected String getAllStrings(JsonNode arrNode,String delimeter){
        String result = "";
        if (arrNode.isArray()) {
            for (final JsonNode objNode : arrNode) {
                result += objNode + delimeter;
            }
            if(result.length() > 0){
                result = result.substring(0,result.length()-1);
            }
        }
        return result;
    }
}
