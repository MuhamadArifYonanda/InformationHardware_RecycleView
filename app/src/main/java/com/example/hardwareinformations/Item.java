package com.example.hardwareinformations;

public class Item {
    private String title;
    private String overview;
    private String description;
    private int imageResId;

    public Item(String title, String overview, String description, int imageResId) {
        this.title = title;
        this.overview = overview;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
}

