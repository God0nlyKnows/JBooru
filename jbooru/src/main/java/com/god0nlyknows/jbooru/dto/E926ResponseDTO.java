package com.god0nlyknows.jbooru.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;



public class E926ResponseDTO implements IResponseDTO {
    private Post posts;

    @JsonProperty("posts")
    public Post getPosts() {
        return posts;
    }

    @JsonProperty("posts")
    public void setPosts(Post posts) {
        this.posts = posts;
    }

    @Override
    public String getFileUrl() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getScoreString() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getRating() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getOwner() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getSource() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTags() {
        // TODO Auto-generated method stub
        return null;
    }
}


class File {
    private int width;
    private int height;
    private String ext;
    private int size;
    private String md5;
    private String url;

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

    @JsonProperty("ext")
    public String getExt() {
        return ext;
    }

    @JsonProperty("ext")
    public void setExt(String ext) {
        this.ext = ext;
    }

    @JsonProperty("size")
    public int getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(int size) {
        this.size = size;
    }

    @JsonProperty("md5")
    public String getMd5() {
        return md5;
    }

    @JsonProperty("md5")
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}

class Flags {
    private boolean pending;
    private boolean flagged;
    private boolean note_locked;
    private boolean status_locked;
    private boolean rating_locked;
    private boolean deleted;

    @JsonProperty("pending")
    public boolean getPending() {
        return pending;
    }

    @JsonProperty("pending")
    public void setPending(boolean pending) {
        this.pending = pending;
    }

    @JsonProperty("flagged")
    public boolean getFlagged() {
        return flagged;
    }

    @JsonProperty("flagged")
    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    @JsonProperty("note_locked")
    public boolean getNoteLocked() {
        return note_locked;
    }

    @JsonProperty("note_locked")
    public void setNoteLocked(boolean note_locked) {
        this.note_locked = note_locked;
    }

    @JsonProperty("status_locked")
    public boolean getStatusLocked() {
        return status_locked;
    }

    @JsonProperty("status_locked")
    public void setStatusLocked(boolean status_locked) {
        this.status_locked = status_locked;
    }

    @JsonProperty("rating_locked")
    public boolean getRatingLocked() {
        return rating_locked;
    }

    @JsonProperty("rating_locked")
    public void setRatingLocked(boolean rating_locked) {
        this.rating_locked = rating_locked;
    }

    @JsonProperty("deleted")
    public boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}

class Post {
    private int id;
    private Date created_at;
    private Date updated_at;
    private File file;
    private Preview preview;
    private Score score;
    private Tags tags;
    private String[] locked_tags; //assumed data type to be string
    private int change_seq;
    private Flags flags;
    private String rating;
    private int fav_count;
    private String[] sources;
    private String[] pools; //assumed data type to be string
    private Relationships relationships;
    private String approver_id;
    private int uploader_id;
    private String description;
    private int comment_count;
    private boolean is_favorited;
    private boolean has_notes;
    private String duration;

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

    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updated_at;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updated_at) {
        this.updated_at = updated_at;
    }

    @JsonProperty("file")
    public File getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(File file) {
        this.file = file;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("score")
    public Score getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Score score) {
        this.score = score;
    }

    @JsonProperty("tags")
    public Tags getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    @JsonProperty("locked_tags")
    public String[] getLockedTags() {
        return locked_tags;
    }

    @JsonProperty("locked_tags")
    public void setLockedTags(String[] locked_tags) {
        this.locked_tags = locked_tags;
    }

    @JsonProperty("change_seq")
    public int getChangeSeq() {
        return change_seq;
    }

    @JsonProperty("change_seq")
    public void setChangeSeq(int change_seq) {
        this.change_seq = change_seq;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("fav_count")
    public int getFavCount() {
        return fav_count;
    }

    @JsonProperty("fav_count")
    public void setFavCount(int fav_count) {
        this.fav_count = fav_count;
    }

    @JsonProperty("sources")
    public String[] getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(String[] sources) {
        this.sources = sources;
    }

    @JsonProperty("pools")
    public String[] getPools() {
        return pools;
    }

    @JsonProperty("pools")
    public void setPools(String[] pools) {
        this.pools = pools;
    }

    @JsonProperty("relationships")
    public Relationships getRelationships() {
        return relationships;
    }

    @JsonProperty("relationships")
    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }

    @JsonProperty("approver_id")
    public String getApproverId() {
        return approver_id;
    }

    @JsonProperty("approver_id")
    public void setApproverId(String approver_id) {
        this.approver_id = approver_id;
    }

    @JsonProperty("uploader_id")
    public int getUploaderId() {
        return uploader_id;
    }

    @JsonProperty("uploader_id")
    public void setUploaderId(int uploader_id) {
        this.uploader_id = uploader_id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("comment_count")
    public int getCommentCount() {
        return comment_count;
    }

    @JsonProperty("comment_count")
    public void setCommentCount(int comment_count) {
        this.comment_count = comment_count;
    }

    @JsonProperty("is_favorited")
    public boolean getIsFavorited() {
        return is_favorited;
    }

    @JsonProperty("is_favorited")
    public void setIsFavorited(boolean is_favorited) {
        this.is_favorited = is_favorited;
    }

    @JsonProperty("has_notes")
    public boolean getHasNotes() {
        return has_notes;
    }

    @JsonProperty("has_notes")
    public void setHasNotes(boolean has_notes) {
        this.has_notes = has_notes;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }
}

class Preview {
    private int width;
    private int height;
    private String url;

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

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}

class Relationships {
    private String parent_id;
    private boolean has_children;
    private boolean has_active_children;
    private Post[] children;

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

    @JsonProperty("has_active_children")
    public boolean getHasActiveChildren() {
        return has_active_children;
    }

    @JsonProperty("has_active_children")
    public void setHasActiveChildren(boolean has_active_children) {
        this.has_active_children = has_active_children;
    }

    @JsonProperty("children")
    public Post[] getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(Post[] children) {
        this.children = children;
    }
}


class Score {
    private int up;
    private int down;
    private int total;

    @JsonProperty("up")
    public int getUp() {
        return up;
    }

    @JsonProperty("up")
    public void setUp(int up) {
        this.up = up;
    }

    @JsonProperty("down")
    public int getDown() {
        return down;
    }

    @JsonProperty("down")
    public void setDown(int down) {
        this.down = down;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }
}

class Tags {
    private String[] general;
    private String[] species;
    private String[] character; //assumed data type to be string
    private String[] copyright; //assumed data type to be string
    private String[] artist;
    private String[] invalid; //assumed data type to be string
    private String[] lore; //assumed data type to be string
    private String[] meta;

    @JsonProperty("general")
    public String[] getGeneral() {
        return general;
    }

    @JsonProperty("general")
    public void setGeneral(String[] general) {
        this.general = general;
    }

    @JsonProperty("species")
    public String[] getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(String[] species) {
        this.species = species;
    }

    @JsonProperty("character")
    public String[] getCharacter() {
        return character;
    }

    @JsonProperty("character")
    public void setCharacter(String[] character) {
        this.character = character;
    }

    @JsonProperty("copyright")
    public String[] getCopyright() {
        return copyright;
    }

    @JsonProperty("copyright")
    public void setCopyright(String[] copyright) {
        this.copyright = copyright;
    }

    @JsonProperty("artist")
    public String[] getArtist() {
        return artist;
    }

    @JsonProperty("artist")
    public void setArtist(String[] artist) {
        this.artist = artist;
    }

    @JsonProperty("invalid")
    public String[] getInvalid() {
        return invalid;
    }

    @JsonProperty("invalid")
    public void setInvalid(String[] invalid) {
        this.invalid = invalid;
    }

    @JsonProperty("lore")
    public String[] getLore() {
        return lore;
    }

    @JsonProperty("lore")
    public void setLore(String[] lore) {
        this.lore = lore;
    }

    @JsonProperty("meta")
    public String[] getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(String[] meta) {
        this.meta = meta;
    }
}