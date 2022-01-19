package com.god0nlyknows.jbooru.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class R34ResponseDTO implements IResponseDTO {
    private String preview_url;
    private String sample_url;
    private String file_url;
    private int directory;
    private String hash;
    private int height;
    private int id;
    private String image;
    private int change;
    private String owner;
    private int parent_id;
    private String rating;
    private int sample;
    private int sample_height;
    private int sample_width;
    private int score;
    private String tags;
    private int width;

    @JsonProperty("preview_url")
    public String getPreviewUrl() {
        return preview_url;
    }

    @JsonProperty("preview_url")
    public void setPreviewUrl(String preview_url) {
        this.preview_url = preview_url;
    }

    @JsonProperty("sample_url")
    public String getSampleUrl() {
        return sample_url;
    }

    @JsonProperty("sample_url")
    public void setSampleUrl(String sample_url) {
        this.sample_url = sample_url;
    }

    @Override
    @JsonProperty("file_url")
    public String getFileUrl() {
        return file_url;
    }

    @JsonProperty("file_url")
    public void setFileUrl(String file_url) {
        this.file_url = file_url;
    }

    @JsonProperty("directory")
    public int getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(int directory) {
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

    @Override
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
    public int getSample() {
        return sample;
    }

    @JsonProperty("sample")
    public void setSample(int sample) {
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
    public int getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(int score) {
        this.score = score;
    }

    @Override
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

    @Override
    public String getScoreString() {
        return Integer.toString(score);
    }

    @Override
    public String getSource() {
        return "";
    }
}