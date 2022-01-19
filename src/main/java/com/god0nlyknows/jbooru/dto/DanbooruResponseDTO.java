package com.god0nlyknows.jbooru.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DanbooruResponseDTO implements IResponseDTO {
        private int id;
        private Date created_at;
        private int uploader_id;
        private int score;
        private String source;
        private String md5;
        private String last_comment_bumped_at;
        private String rating;
        private int image_width;
        private int image_height;
        private String tag_string;
        private int fav_count;
        private String file_ext;
        private String last_noted_at;
        private String parent_id;
        private boolean has_children;
        private String approver_id;
        private int tag_count_general;
        private int tag_count_artist;
        private int tag_count_character;
        private int tag_count_copyright;
        private int file_size;
        private int up_score;
        private int down_score;
        private boolean is_pending;
        private boolean is_flagged;
        private boolean is_deleted;
        private int tag_count;
        private Date updated_at;
        private boolean is_banned;
        private String pixiv_id;
        private String last_commented_at;
        private boolean has_active_children;
        private int bit_flags;
        private int tag_count_meta;
        private boolean has_large;
        private boolean has_visible_children;
        private String tag_string_general;
        private String tag_string_character;
        private String tag_string_copyright;
        private String tag_string_artist;
        private String tag_string_meta;
        private String file_url;
        private String large_file_url;
        private String preview_file_url;
    
        @JsonProperty("id")
        public int getId() {
            return id;
        }
    
        @JsonProperty("id")
        public void setId(int id) {
            this.id = id;
        }
    
        @JsonProperty("created_at")
        public Date getCreatedAt() {
            return created_at;
        }
    
        @JsonProperty("created_at")
        public void setCreatedAt(Date created_at) {
            this.created_at = created_at;
        }
    
        @JsonProperty("uploader_id")
        public int getUploaderId() {
            return uploader_id;
        }
    
        @JsonProperty("uploader_id")
        public void setUploaderId(int uploader_id) {
            this.uploader_id = uploader_id;
        }
    
        @JsonProperty("score")
        public int getScore() {
            return score;
        }
    
        @JsonProperty("score")
        public void setScore(int score) {
            this.score = score;
        }
    
        @JsonProperty("source")
        public String getSource() {
            return source;
        }
    
        @JsonProperty("source")
        public void setSource(String source) {
            this.source = source;
        }
    
        @JsonProperty("md5")
        public String getMd5() {
            return md5;
        }
    
        @JsonProperty("md5")
        public void setMd5(String md5) {
            this.md5 = md5;
        }
    
        @JsonProperty("last_comment_bumped_at")
        public String getLastCommentBumpedAt() {
            return last_comment_bumped_at;
        }
    
        @JsonProperty("last_comment_bumped_at")
        public void setLastCommentBumpedAt(String last_comment_bumped_at) {
            this.last_comment_bumped_at = last_comment_bumped_at;
        }
    
        @JsonProperty("rating")
        public String getRating() {
            return rating;
        }
    
        @JsonProperty("rating")
        public void setRating(String rating) {
            this.rating = rating;
        }
    
        @JsonProperty("image_width")
        public int getImageWidth() {
            return image_width;
        }
    
        @JsonProperty("image_width")
        public void setImageWidth(int image_width) {
            this.image_width = image_width;
        }
    
        @JsonProperty("image_height")
        public int getImageHeight() {
            return image_height;
        }
    
        @JsonProperty("image_height")
        public void setImageHeight(int image_height) {
            this.image_height = image_height;
        }
    
        @JsonProperty("tag_string")
        public String getTagString() {
            return tag_string;
        }
    
        @JsonProperty("tag_string")
        public void setTagString(String tag_string) {
            this.tag_string = tag_string;
        }
    
        @JsonProperty("fav_count")
        public int getFavCount() {
            return fav_count;
        }
    
        @JsonProperty("fav_count")
        public void setFavCount(int fav_count) {
            this.fav_count = fav_count;
        }
    
        @JsonProperty("file_ext")
        public String getFileExt() {
            return file_ext;
        }
    
        @JsonProperty("file_ext")
        public void setFileExt(String file_ext) {
            this.file_ext = file_ext;
        }
    
        @JsonProperty("last_noted_at")
        public String getLastNotedAt() {
            return last_noted_at;
        }
    
        @JsonProperty("last_noted_at")
        public void setLastNotedAt(String last_noted_at) {
            this.last_noted_at = last_noted_at;
        }
    
        @JsonProperty("parent_id")
        public String getParentId() {
            return parent_id;
        }
    
        @JsonProperty("parent_id")
        public void setParentId(String parent_id) {
            this.parent_id = parent_id;
        }
    
        @JsonProperty("has_children")
        public boolean getHasChildren() {
            return has_children;
        }
    
        @JsonProperty("has_children")
        public void setHasChildren(boolean has_children) {
            this.has_children = has_children;
        }
    
        @JsonProperty("approver_id")
        public String getApproverId() {
            return approver_id;
        }
    
        @JsonProperty("approver_id")
        public void setApproverId(String approver_id) {
            this.approver_id = approver_id;
        }
    
        @JsonProperty("tag_count_general")
        public int getTagCountGeneral() {
            return tag_count_general;
        }
    
        @JsonProperty("tag_count_general")
        public void setTagCountGeneral(int tag_count_general) {
            this.tag_count_general = tag_count_general;
        }
    
        @JsonProperty("tag_count_artist")
        public int getTagCountArtist() {
            return tag_count_artist;
        }
    
        @JsonProperty("tag_count_artist")
        public void setTagCountArtist(int tag_count_artist) {
            this.tag_count_artist = tag_count_artist;
        }
    
        @JsonProperty("tag_count_character")
        public int getTagCountCharacter() {
            return tag_count_character;
        }
    
        @JsonProperty("tag_count_character")
        public void setTagCountCharacter(int tag_count_character) {
            this.tag_count_character = tag_count_character;
        }
    
        @JsonProperty("tag_count_copyright")
        public int getTagCountCopyright() {
            return tag_count_copyright;
        }
    
        @JsonProperty("tag_count_copyright")
        public void setTagCountCopyright(int tag_count_copyright) {
            this.tag_count_copyright = tag_count_copyright;
        }
    
        @JsonProperty("file_size")
        public int getFileSize() {
            return file_size;
        }
    
        @JsonProperty("file_size")
        public void setFileSize(int file_size) {
            this.file_size = file_size;
        }
    
        @JsonProperty("up_score")
        public int getUpScore() {
            return up_score;
        }
    
        @JsonProperty("up_score")
        public void setUpScore(int up_score) {
            this.up_score = up_score;
        }
    
        @JsonProperty("down_score")
        public int getDownScore() {
            return down_score;
        }
    
        @JsonProperty("down_score")
        public void setDownScore(int down_score) {
            this.down_score = down_score;
        }
    
        @JsonProperty("is_pending")
        public boolean getIsPending() {
            return is_pending;
        }
    
        @JsonProperty("is_pending")
        public void setIsPending(boolean is_pending) {
            this.is_pending = is_pending;
        }
    
        @JsonProperty("is_flagged")
        public boolean getIsFlagged() {
            return is_flagged;
        }
    
        @JsonProperty("is_flagged")
        public void setIsFlagged(boolean is_flagged) {
            this.is_flagged = is_flagged;
        }
    
        @JsonProperty("is_deleted")
        public boolean getIsDeleted() {
            return is_deleted;
        }
    
        @JsonProperty("is_deleted")
        public void setIsDeleted(boolean is_deleted) {
            this.is_deleted = is_deleted;
        }
    
        @JsonProperty("tag_count")
        public int getTagCount() {
            return tag_count;
        }
    
        @JsonProperty("tag_count")
        public void setTagCount(int tag_count) {
            this.tag_count = tag_count;
        }
    
        @JsonProperty("updated_at")
        public Date getUpdatedAt() {
            return updated_at;
        }
    
        @JsonProperty("updated_at")
        public void setUpdatedAt(Date updated_at) {
            this.updated_at = updated_at;
        }
    
        @JsonProperty("is_banned")
        public boolean getIsBanned() {
            return is_banned;
        }
    
        @JsonProperty("is_banned")
        public void setIsBanned(boolean is_banned) {
            this.is_banned = is_banned;
        }
    
        @JsonProperty("pixiv_id")
        public String getPixivId() {
            return pixiv_id;
        }
    
        @JsonProperty("pixiv_id")
        public void setPixivId(String pixiv_id) {
            this.pixiv_id = pixiv_id;
        }
    
        @JsonProperty("last_commented_at")
        public String getLastCommentedAt() {
            return last_commented_at;
        }
    
        @JsonProperty("last_commented_at")
        public void setLastCommentedAt(String last_commented_at) {
            this.last_commented_at = last_commented_at;
        }
    
        @JsonProperty("has_active_children")
        public boolean getHasActiveChildren() {
            return has_active_children;
        }
    
        @JsonProperty("has_active_children")
        public void setHasActiveChildren(boolean has_active_children) {
            this.has_active_children = has_active_children;
        }
    
        @JsonProperty("bit_flags")
        public int getBitFlags() {
            return bit_flags;
        }
    
        @JsonProperty("bit_flags")
        public void setBitFlags(int bit_flags) {
            this.bit_flags = bit_flags;
        }
    
        @JsonProperty("tag_count_meta")
        public int getTagCountMeta() {
            return tag_count_meta;
        }
    
        @JsonProperty("tag_count_meta")
        public void setTagCountMeta(int tag_count_meta) {
            this.tag_count_meta = tag_count_meta;
        }
    
        @JsonProperty("has_large")
        public boolean getHasLarge() {
            return has_large;
        }
    
        @JsonProperty("has_large")
        public void setHasLarge(boolean has_large) {
            this.has_large = has_large;
        }
    
        @JsonProperty("has_visible_children")
        public boolean getHasVisibleChildren() {
            return has_visible_children;
        }
    
        @JsonProperty("has_visible_children")
        public void setHasVisibleChildren(boolean has_visible_children) {
            this.has_visible_children = has_visible_children;
        }
    
        @JsonProperty("tag_string_general")
        public String getTagStringGeneral() {
            return tag_string_general;
        }
    
        @JsonProperty("tag_string_general")
        public void setTagStringGeneral(String tag_string_general) {
            this.tag_string_general = tag_string_general;
        }
    
        @JsonProperty("tag_string_character")
        public String getTagStringCharacter() {
            return tag_string_character;
        }
    
        @JsonProperty("tag_string_character")
        public void setTagStringCharacter(String tag_string_character) {
            this.tag_string_character = tag_string_character;
        }
    
        @JsonProperty("tag_string_copyright")
        public String getTagStringCopyright() {
            return tag_string_copyright;
        }
    
        @JsonProperty("tag_string_copyright")
        public void setTagStringCopyright(String tag_string_copyright) {
            this.tag_string_copyright = tag_string_copyright;
        }
    
        @JsonProperty("tag_string_artist")
        public String getTagStringArtist() {
            return tag_string_artist;
        }
    
        @JsonProperty("tag_string_artist")
        public void setTagStringArtist(String tag_string_artist) {
            this.tag_string_artist = tag_string_artist;
        }
    
        @JsonProperty("tag_string_meta")
        public String getTagStringMeta() {
            return tag_string_meta;
        }
    
        @JsonProperty("tag_string_meta")
        public void setTagStringMeta(String tag_string_meta) {
            this.tag_string_meta = tag_string_meta;
        }
    
        @JsonProperty("file_url")
        public String getFileUrl() {
            return file_url;
        }
    
        @JsonProperty("file_url")
        public void setFileUrl(String file_url) {
            this.file_url = file_url;
        }
    
        @JsonProperty("large_file_url")
        public String getLargeFileUrl() {
            return large_file_url;
        }
    
        @JsonProperty("large_file_url")
        public void setLargeFileUrl(String large_file_url) {
            this.large_file_url = large_file_url;
        }
    
        @JsonProperty("preview_file_url")
        public String getPreviewFileUrl() {
            return preview_file_url;
        }
    
        @JsonProperty("preview_file_url")
        public void setPreviewFileUrl(String preview_file_url) {
            this.preview_file_url = preview_file_url;
        }

        @Override
        public String getScoreString() {
            return Integer.toString(score);
        }

        @Override
        public String getOwner() {
            return tag_string_artist;
        }

        @Override
        public String getTags() {
            return tag_string;
        }
    
}
