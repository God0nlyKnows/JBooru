package com.god0nlyknows.jbooru.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YandeResponseDTO implements IResponseDTO {
        private int id;
        private String tags;
        private int created_at;
        private int updated_at;
        private int creator_id;
        private String approver_id;
        private String author;
        private int change;
        private String source;
        private int score;
        private String md5;
        private int file_size;
        private String file_ext;
        private String file_url;
        private boolean is_shown_in_index;
        private String preview_url;
        private int preview_width;
        private int preview_height;
        private int actual_preview_width;
        private int actual_preview_height;
        private String sample_url;
        private int sample_width;
        private int sample_height;
        private int sample_file_size;
        private String jpeg_url;
        private int jpeg_width;
        private int jpeg_height;
        private int jpeg_file_size;
        private String rating;
        private boolean is_rating_locked;
        private boolean has_children;
        private String parent_id;
        private String status;
        private boolean is_pending;
        private int width;
        private int height;
        private boolean is_held;
        private String frames_pending_string;
        private String[] frames_pending; //assumed data type to be string
        private String frames_string;
        private String[] frames; //assumed data type to be string
        private boolean is_note_locked;
        private int last_noted_at;
        private int last_commented_at;
    
        @JsonProperty("id")
        public int getId() {
            return id;
        }
    
        @JsonProperty("id")
        public void setId(int id) {
            this.id = id;
        }
    
        @JsonProperty("tags")
        public String getTags() {
            return tags;
        }
    
        @JsonProperty("tags")
        public void setTags(String tags) {
            this.tags = tags;
        }
    
        @JsonProperty("created_at")
        public int getCreatedAt() {
            return created_at;
        }
    
        @JsonProperty("created_at")
        public void setCreatedAt(int created_at) {
            this.created_at = created_at;
        }
    
        @JsonProperty("updated_at")
        public int getUpdatedAt() {
            return updated_at;
        }
    
        @JsonProperty("updated_at")
        public void setUpdatedAt(int updated_at) {
            this.updated_at = updated_at;
        }
    
        @JsonProperty("creator_id")
        public int getCreatorId() {
            return creator_id;
        }
    
        @JsonProperty("creator_id")
        public void setCreatorId(int creator_id) {
            this.creator_id = creator_id;
        }
    
        @JsonProperty("approver_id")
        public String getApproverId() {
            return approver_id;
        }
    
        @JsonProperty("approver_id")
        public void setApproverId(String approver_id) {
            this.approver_id = approver_id;
        }
    
        @JsonProperty("author")
        public String getAuthor() {
            return author;
        }
    
        @JsonProperty("author")
        public void setAuthor(String author) {
            this.author = author;
        }
    
        @JsonProperty("change")
        public int getChange() {
            return change;
        }
    
        @JsonProperty("change")
        public void setChange(int change) {
            this.change = change;
        }
    
        @JsonProperty("source")
        public String getSource() {
            return source;
        }
    
        @JsonProperty("source")
        public void setSource(String source) {
            this.source = source;
        }
    
        @JsonProperty("score")
        public int getScore() {
            return score;
        }
    
        @JsonProperty("score")
        public void setScore(int score) {
            this.score = score;
        }
    
        @JsonProperty("md5")
        public String getMd5() {
            return md5;
        }
    
        @JsonProperty("md5")
        public void setMd5(String md5) {
            this.md5 = md5;
        }
    
        @JsonProperty("file_size")
        public int getFileSize() {
            return file_size;
        }
    
        @JsonProperty("file_size")
        public void setFileSize(int file_size) {
            this.file_size = file_size;
        }
    
        @JsonProperty("file_ext")
        public String getFileExt() {
            return file_ext;
        }
    
        @JsonProperty("file_ext")
        public void setFileExt(String file_ext) {
            this.file_ext = file_ext;
        }
    
        @JsonProperty("file_url")
        public String getFileUrl() {
            return file_url;
        }
    
        @JsonProperty("file_url")
        public void setFileUrl(String file_url) {
            this.file_url = file_url;
        }
    
        @JsonProperty("is_shown_in_index")
        public boolean getIsShownInIndex() {
            return is_shown_in_index;
        }
    
        @JsonProperty("is_shown_in_index")
        public void setIsShownInIndex(boolean is_shown_in_index) {
            this.is_shown_in_index = is_shown_in_index;
        }
    
        @JsonProperty("preview_url")
        public String getPreviewUrl() {
            return preview_url;
        }
    
        @JsonProperty("preview_url")
        public void setPreviewUrl(String preview_url) {
            this.preview_url = preview_url;
        }
    
        @JsonProperty("preview_width")
        public int getPreviewWidth() {
            return preview_width;
        }
    
        @JsonProperty("preview_width")
        public void setPreviewWidth(int preview_width) {
            this.preview_width = preview_width;
        }
    
        @JsonProperty("preview_height")
        public int getPreviewHeight() {
            return preview_height;
        }
    
        @JsonProperty("preview_height")
        public void setPreviewHeight(int preview_height) {
            this.preview_height = preview_height;
        }
    
        @JsonProperty("actual_preview_width")
        public int getActualPreviewWidth() {
            return actual_preview_width;
        }
    
        @JsonProperty("actual_preview_width")
        public void setActualPreviewWidth(int actual_preview_width) {
            this.actual_preview_width = actual_preview_width;
        }
    
        @JsonProperty("actual_preview_height")
        public int getActualPreviewHeight() {
            return actual_preview_height;
        }
    
        @JsonProperty("actual_preview_height")
        public void setActualPreviewHeight(int actual_preview_height) {
            this.actual_preview_height = actual_preview_height;
        }
    
        @JsonProperty("sample_url")
        public String getSampleUrl() {
            return sample_url;
        }
    
        @JsonProperty("sample_url")
        public void setSampleUrl(String sample_url) {
            this.sample_url = sample_url;
        }
    
        @JsonProperty("sample_width")
        public int getSampleWidth() {
            return sample_width;
        }
    
        @JsonProperty("sample_width")
        public void setSampleWidth(int sample_width) {
            this.sample_width = sample_width;
        }
    
        @JsonProperty("sample_height")
        public int getSampleHeight() {
            return sample_height;
        }
    
        @JsonProperty("sample_height")
        public void setSampleHeight(int sample_height) {
            this.sample_height = sample_height;
        }
    
        @JsonProperty("sample_file_size")
        public int getSampleFileSize() {
            return sample_file_size;
        }
    
        @JsonProperty("sample_file_size")
        public void setSampleFileSize(int sample_file_size) {
            this.sample_file_size = sample_file_size;
        }
    
        @JsonProperty("jpeg_url")
        public String getJpegUrl() {
            return jpeg_url;
        }
    
        @JsonProperty("jpeg_url")
        public void setJpegUrl(String jpeg_url) {
            this.jpeg_url = jpeg_url;
        }
    
        @JsonProperty("jpeg_width")
        public int getJpegWidth() {
            return jpeg_width;
        }
    
        @JsonProperty("jpeg_width")
        public void setJpegWidth(int jpeg_width) {
            this.jpeg_width = jpeg_width;
        }
    
        @JsonProperty("jpeg_height")
        public int getJpegHeight() {
            return jpeg_height;
        }
    
        @JsonProperty("jpeg_height")
        public void setJpegHeight(int jpeg_height) {
            this.jpeg_height = jpeg_height;
        }
    
        @JsonProperty("jpeg_file_size")
        public int getJpegFileSize() {
            return jpeg_file_size;
        }
    
        @JsonProperty("jpeg_file_size")
        public void setJpegFileSize(int jpeg_file_size) {
            this.jpeg_file_size = jpeg_file_size;
        }
    
        @JsonProperty("rating")
        public String getRating() {
            return rating;
        }
    
        @JsonProperty("rating")
        public void setRating(String rating) {
            this.rating = rating;
        }
    
        @JsonProperty("is_rating_locked")
        public boolean getIsRatingLocked() {
            return is_rating_locked;
        }
    
        @JsonProperty("is_rating_locked")
        public void setIsRatingLocked(boolean is_rating_locked) {
            this.is_rating_locked = is_rating_locked;
        }
    
        @JsonProperty("has_children")
        public boolean getHasChildren() {
            return has_children;
        }
    
        @JsonProperty("has_children")
        public void setHasChildren(boolean has_children) {
            this.has_children = has_children;
        }
    
        @JsonProperty("parent_id")
        public String getParentId() {
            return parent_id;
        }
    
        @JsonProperty("parent_id")
        public void setParentId(String parent_id) {
            this.parent_id = parent_id;
        }
    
        @JsonProperty("status")
        public String getStatus() {
            return status;
        }
    
        @JsonProperty("status")
        public void setStatus(String status) {
            this.status = status;
        }
    
        @JsonProperty("is_pending")
        public boolean getIsPending() {
            return is_pending;
        }
    
        @JsonProperty("is_pending")
        public void setIsPending(boolean is_pending) {
            this.is_pending = is_pending;
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
    
        @JsonProperty("is_held")
        public boolean getIsHeld() {
            return is_held;
        }
    
        @JsonProperty("is_held")
        public void setIsHeld(boolean is_held) {
            this.is_held = is_held;
        }
    
        @JsonProperty("frames_pending_string")
        public String getFramesPendingString() {
            return frames_pending_string;
        }
    
        @JsonProperty("frames_pending_string")
        public void setFramesPendingString(String frames_pending_string) {
            this.frames_pending_string = frames_pending_string;
        }
    
        @JsonProperty("frames_pending")
        public String[] getFramesPending() {
            return frames_pending;
        }
    
        @JsonProperty("frames_pending")
        public void setFramesPending(String[] frames_pending) {
            this.frames_pending = frames_pending;
        }
    
        @JsonProperty("frames_string")
        public String getFramesString() {
            return frames_string;
        }
    
        @JsonProperty("frames_string")
        public void setFramesString(String frames_string) {
            this.frames_string = frames_string;
        }
    
        @JsonProperty("frames")
        public String[] getFrames() {
            return frames;
        }
    
        @JsonProperty("frames")
        public void setFrames(String[] frames) {
            this.frames = frames;
        }
    
        @JsonProperty("is_note_locked")
        public boolean getIsNoteLocked() {
            return is_note_locked;
        }
    
        @JsonProperty("is_note_locked")
        public void setIsNoteLocked(boolean is_note_locked) {
            this.is_note_locked = is_note_locked;
        }
    
        @JsonProperty("last_noted_at")
        public int getLastNotedAt() {
            return last_noted_at;
        }
    
        @JsonProperty("last_noted_at")
        public void setLastNotedAt(int last_noted_at) {
            this.last_noted_at = last_noted_at;
        }
    
        @JsonProperty("last_commented_at")
        public int getLastCommentedAt() {
            return last_commented_at;
        }
    
        @JsonProperty("last_commented_at")
        public void setLastCommentedAt(int last_commented_at) {
            this.last_commented_at = last_commented_at;
        }

        @Override
        public String getScoreString() {
            return Integer.toString(score);
        }

        @Override
        public String getOwner() {
            return author;
        }
    }
