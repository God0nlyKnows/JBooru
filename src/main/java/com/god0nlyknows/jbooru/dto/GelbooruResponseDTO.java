package com.god0nlyknows.jbooru.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GelbooruResponseDTO {
    private GelbooruAttributes attributes;
    private GelbooruPost[] post;

    @JsonProperty("@attributes")
    public GelbooruAttributes getAttributes() {
        return attributes;
    }

    @JsonProperty("@attributes")
    public void setAttributes(GelbooruAttributes attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("post")
    public GelbooruPost[] getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(GelbooruPost[] post) {
        this.post = post;
    }

}


class GelbooruAttributes {
    private int limit;
    private int offset;
    private int count;

    @JsonProperty("limit")
    public int getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @JsonProperty("offset")
    public int getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(int offset) {
        this.offset = offset;
    }

    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(int count) {
        this.count = count;
    }
}

class GelbooruPost implements IResponseDTO {
    private int id;
    private String created_at;
    private int score;
    private int width;
    private int height;
    private String md5;
    private String directory;
    private String image;
    private String rating;
    private String source;
    private int change;
    private String owner;
    private int creator_id;
    private int parent_id;
    private int sample;
    private int preview_height;
    private int preview_width;
    private String tags;
    private String title;
    private String has_notes;
    private String has_comments;
    private String file_url;
    private String preview_url;
    private String sample_url;
    private int sample_height;
    private int sample_width;
    private String status;
    private int post_locked;
    private String has_children;

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return created_at;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    @JsonProperty("score")
    public int getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("width")
    public int getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(int width) {
        this.width = width;
    }

    @JsonProperty("height")
    public int getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(int height) {
        this.height = height;
    }

    @JsonProperty("md5")
    public String getMd5() {
        return md5;
    }

    @JsonProperty("md5")
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
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

    @JsonProperty("creator_id")
    public int getCreatorId() {
        return creator_id;
    }

    @JsonProperty("creator_id")
    public void setCreatorId(int creator_id) {
        this.creator_id = creator_id;
    }

    @JsonProperty("parent_id")
    public int getParentId() {
        return parent_id;
    }

    @JsonProperty("parent_id")
    public void setParentId(int parent_id) {
        this.parent_id = parent_id;
    }

    @JsonProperty("sample")
    public int getSample() {
        return sample;
    }

    @JsonProperty("sample")
    public void setSample(int sample) {
        this.sample = sample;
    }

    @JsonProperty("preview_height")
    public int getPreviewHeight() {
        return preview_height;
    }

    @JsonProperty("preview_height")
    public void setPreviewHeight(int preview_height) {
        this.preview_height = preview_height;
    }

    @JsonProperty("preview_width")
    public int getPreviewWidth() {
        return preview_width;
    }

    @JsonProperty("preview_width")
    public void setPreviewWidth(int preview_width) {
        this.preview_width = preview_width;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("has_notes")
    public String getHasNotes() {
        return has_notes;
    }

    @JsonProperty("has_notes")
    public void setHasNotes(String has_notes) {
        this.has_notes = has_notes;
    }

    @JsonProperty("has_comments")
    public String getHasComments() {
        return has_comments;
    }

    @JsonProperty("has_comments")
    public void setHasComments(String has_comments) {
        this.has_comments = has_comments;
    }

    @JsonProperty("file_url")
    public String getFileUrl() {
        return file_url;
    }

    @JsonProperty("file_url")
    public void setFileUrl(String file_url) {
        this.file_url = file_url;
    }

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

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("post_locked")
    public int getPostLocked() {
        return post_locked;
    }

    @JsonProperty("post_locked")
    public void setPostLocked(int post_locked) {
        this.post_locked = post_locked;
    }

    @JsonProperty("has_children")
    public String getHasChildren() {
        return has_children;
    }

    @JsonProperty("has_children")
    public void setHasChildren(String has_children) {
        this.has_children = has_children;
    }

    @Override
    public String getScoreString() {
        return Integer.toString(score);
    }
}

