package com.god0nlyknows.jbooru;

import java.util.List;

import com.god0nlyknows.jbooru.dto.IResponseDTO;
import com.god0nlyknows.jbooru.dto.LolibooruResponseDTO;

public class LolibooruGetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 1000;   //max per request
    private int page = 1;


    @Override
    public List<IResponseDTO> getPosts(String tag) {

        return sendRequest(String.format("https://lolibooru.moe/post/index.json?limit=%s&page=%s&tags=%s",limit,page,tag), LolibooruResponseDTO[].class);
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
