package com.god0nlyknows.jbooru;

import java.util.List;

import com.god0nlyknows.jbooru.dto.IResponseDTO;

public class App {
    public static void main(String[] args) {
        List<IGetPosts> r34 = List.of(
                new DanbooruGetPosts(),
                new E621GetPosts(),
                new E926GetPosts(),
                new GelbooruGetPosts(),
                new KonachanGetPosts(),
                new LolibooruGetPosts(),
                new R34GetPosts(),
                new RealbooruGetPosts(),
                new SafebooruGetPosts(),
                new YandeGetPosts());
        for (IGetPosts iGetPosts : r34) {
            try {
                List<IResponseDTO> res = iGetPosts.getPosts("thighhighs");
                if (res.size() > 0) {
                    System.out.println(res.size());
                    System.out.println(res.get(0).getFileUrl());
                }
                iGetPosts.setPage(2);
                res = iGetPosts.getPosts("thighhighs");
                if (res.size() > 0) {
                    System.out.println(res.size());
                    System.out.println(res.get(0).getFileUrl());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
