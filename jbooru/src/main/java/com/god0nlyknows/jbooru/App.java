package com.god0nlyknows.jbooru;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<IGetPosts> r34 = List.of(
            new LolibooruGetPosts(),
            new YandeGetPosts()
        );
        for (IGetPosts iGetPosts : r34) {
            try {
                var res = iGetPosts.getPosts("thighhighs");
            System.out.println(res[0].getFileUrl());
            iGetPosts.setPage(2);
            res = iGetPosts.getPosts("thighhighs");
            System.out.println(res[0].getFileUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}
