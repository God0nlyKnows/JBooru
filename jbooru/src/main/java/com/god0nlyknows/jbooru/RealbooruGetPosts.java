package com.god0nlyknows.jbooru;

import java.util.List;

import com.god0nlyknows.jbooru.dto.IResponseDTO;
import com.god0nlyknows.jbooru.dto.RealbooruResponseDTO;

public class RealbooruGetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 100;   //max per request
    private int page = 1;


    @Override
    public List<IResponseDTO> getPosts(String tag) {

        return sendRequest(String.format("https://realbooru.com/index.php?page=dapi&s=post&q=index&json=1&limit=%s&pid=%s&tags=%s",limit,page,tag), RealbooruResponseDTO[].class);
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
