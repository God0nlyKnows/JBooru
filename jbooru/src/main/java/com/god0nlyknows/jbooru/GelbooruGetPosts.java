package com.god0nlyknows.jbooru;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.god0nlyknows.jbooru.dto.GelbooruResponseDTO;
import com.god0nlyknows.jbooru.dto.IResponseDTO;

public class GelbooruGetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 1000;   //max per request
    private int page = 1;


    @Override
    public IResponseDTO[] getPosts(String tag) {

        return sendRequest(String.format("https://gelbooru.com/index.php?page=dapi&s=post&q=index&json=1&limit=%s&pid=%s&tags=%s",limit,page,tag), GelbooruResponseDTO.class);
    }

    @Override
    public <T> IResponseDTO[] sendRequest(String url, Class<T> clazz){
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(
                URI.create(url))
                .header("accept", "application/json")
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper om=new ObjectMapper();
            var result = (GelbooruResponseDTO)om.readValue(response.body().toString(),clazz);

            return result.getPost();
            
        } catch (Exception e) {
            return null;
        }
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
