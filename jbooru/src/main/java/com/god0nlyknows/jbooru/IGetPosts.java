package com.god0nlyknows.jbooru;

import com.god0nlyknows.jbooru.dto.IResponseDTO;

public interface IGetPosts {

    public IResponseDTO[] getPosts(String tag);
    
    public int getLimit();

    public void setLimit(int limit);

    public int getPage();

    public void setPage(int page);
}