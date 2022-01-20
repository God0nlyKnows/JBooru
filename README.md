# JBooru
A package that download a crucial info about posts from most popular booru sites


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
        }
```

### Local jar install (Maven)

```
<dependency>
  <groupId>com.god0nlyknows.jbooru</groupId>
  <artifactId>jbooru</artifactId>
  <version>CURRENTVERSION</version>
  <scope>system</scope>
  <systemPath>${project.basedir}/lib/JARFILE.jar</systemPath>
</dependency>
```

### Available Sites

<ul>
  <li> danbooru.donmai.us </li>
  <li> e621.net </li>
  <li> e926.net </li>
  <li> gelbooru.com </li>
  <li> konachan.com </li>
  <li> lolibooru.moe </li>
  <li> realbooru.com </li>
  <li> rule34.xxx </li>
  <li> safebooru.org </li>
  <li> yande.re </li>
</ul>
