package com.god0nlyknows.jbooru.dto;

public class LolibooruResponseDTO implements IResponseDTO {

    private final String fileUrl;
    private final String scoreString;
    private final String rating;
    private final String owner;
    private final String source;
    private final String tags;

    public LolibooruResponseDTO(String fileUrl, String scoreString, String rating, String owner, String source,
            String tags) {
        this.fileUrl = fileUrl;
        this.scoreString = scoreString;
        this.rating = rating;
        this.owner = owner;
        this.source = source;
        this.tags = tags;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public String getScoreString() {
        return scoreString;
    }

    public String getRating() {
        return rating;
    }

    public String getOwner() {
        return owner;
    }

    public String getSource() {
        return source;
    }

    public String getTags() {
        return tags;
    }

}