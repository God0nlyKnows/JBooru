package com.god0nlyknows.jbooru.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SafebooruResponseDTO implements IResponseDTO {
    private final String baseFileUrl = "https://safebooru.org/images/";
    private String directory;
    private String hash;
    private int height;
    private int id;
    private String image;
    private int change;
    private String owner;
    private int parent_id;
    private String rating;
    private boolean sample;
    private int sample_height;
    private int sample_width;
    private String score;
    private String tags;
    private int width;

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("height")
    public int getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(int height) {
        this.height = height;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("change")
    public int getChange() {
        return change;
    }

    @JsonProperty("change")
    public void setChange(int change) {
        this.change = change;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("parent_id")
    public int getParentId() {
        return parent_id;
    }

    @JsonProperty("parent_id")
    public void setParentId(int parent_id) {
        this.parent_id = parent_id;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("sample")
    public boolean getSample() {
        return sample;
    }

    @JsonProperty("sample")
    public void setSample(boolean sample) {
        this.sample = sample;
    }

    @JsonProperty("sample_height")
    public int getSampleHeight() {
        return sample_height;
    }

    @JsonProperty("sample_height")
    public void setSampleHeight(int sample_height) {
        this.sample_height = sample_height;
    }

    @JsonProperty("sample_width")
    public int getSampleWidth() {
        return sample_width;
    }

    @JsonProperty("sample_width")
    public void setSampleWidth(int sample_width) {
        this.sample_width = sample_width;
    }

    @JsonProperty("score")
    public String getScoreString() {
        return score;
    }

    @JsonProperty("score")
    public void setScoreString(String score) {
        this.score = score;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("width")
    public int getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(int width) {
        this.width = width;
    }

    public String getFileUrl() {
        return baseFileUrl + directory + "/" + image;
    }

    @Override
    public String getSource() {
        return "";
    }
}