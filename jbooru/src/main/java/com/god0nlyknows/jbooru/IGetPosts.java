package com.god0nlyknows.jbooru;

import java.util.List;

import com.god0nlyknows.jbooru.dto.IResponseDTO;

public interface IGetPosts {

    public List<IResponseDTO> getPosts(String tag);
    
    public int getLimit();

    public void setLimit(int limit);

    public int getPage();

    public void setPage(int page);
}