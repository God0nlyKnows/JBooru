# JBooru
A package that download a crucial info about posts from booru sites


### Example Usage
```
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
                List<IResponseDTO> res = iGetPosts.getPosts("tag_name");
                if (res.size() > 0) {
                    System.out.println(res.size());
                    System.out.println(res.get(0).getFileUrl());
                }
                iGetPosts.setPage(2);
                res = iGetPosts.getPosts("tag_name");
                if (res.size() > 0) {
                    System.out.println(res.size());
                    System.out.println(res.get(0).getFileUrl());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
```