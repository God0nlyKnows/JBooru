package com.god0nlyknows.jbooru;

import com.god0nlyknows.jbooru.dto.IResponseDTO;
import com.god0nlyknows.jbooru.dto.YandeResponseDTO;

public class YandeGetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 1000;   //max per request
    private int page = 1;


    @Override
    public IResponseDTO[] getPosts(String tag) {

        return sendRequest(String.format("https://yande.re/post.json?limit=%s&page=%s&tags=%s",limit,page,tag), YandeResponseDTO[].class);
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
