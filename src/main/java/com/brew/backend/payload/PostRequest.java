package com.brew.backend.payload;

import java.time.LocalDateTime;

public class PostRequest {

    private String title;
    private String category;
    private String description;
    private LocalDateTime publish_date;
    private String file;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(LocalDateTime publish_date) {
        this.publish_date = publish_date;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
