package com.god0nlyknows.jbooru;

import java.util.List;

import com.god0nlyknows.jbooru.dto.DanbooruResponseDTO;
import com.god0nlyknows.jbooru.dto.IResponseDTO;

public class DanbooruGetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 200;   //max per request
    private int page = 1;


    @Override
    public List<IResponseDTO> getPosts(String tag) {

        //var posts1 = sendRequest(String.format("https://danbooru.donmai.us/posts.json?limit=%s&page=%s&tag=%s",limit,page,tag), DanbooruResponseDTO[].class);
        var posts2 = sendRequest(String.format("https://danbooru.donmai.us/posts.json?limit=%s&page=%s&tags=%s",limit,page,tag), DanbooruResponseDTO[].class);

        //return (posts1.size()>posts2.size())?posts1:posts2;
        return posts2;
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
