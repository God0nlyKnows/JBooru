package com.god0nlyknows.jbooru;


import java.util.List;

import com.god0nlyknows.jbooru.dto.IResponseDTO;
import com.god0nlyknows.jbooru.dto.R34ResponseDTO;

public class R34GetPosts extends GetPostsBase implements IGetPosts {

    private int limit = 1000;   //max per request
    private int page = 1;


    @Override
    public List<IResponseDTO> getPosts(String tag) {

        return sendRequest(String.format("https://api.rule34.xxx/index.php?page=dapi&s=post&q=index&json=1&limit=%s&pid=%s&tags=%s~",limit,page,tag), R34ResponseDTO[].class);
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
