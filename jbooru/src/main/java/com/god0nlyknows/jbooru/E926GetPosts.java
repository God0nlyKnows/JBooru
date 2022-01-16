package com.god0nlyknows.jbooru;

import com.god0nlyknows.jbooru.dto.E926ResponseDTO;
import com.god0nlyknows.jbooru.dto.IResponseDTO;

public class E926GetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 320;   //max per request
    private int page = 1;


    @Override
    public IResponseDTO[] getPosts(String tag) {

        return sendRequest(String.format("https://e926.net/posts.json?limit=%s&page=%s&tags=%s",limit,page,tag), E926ResponseDTO[].class);
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
