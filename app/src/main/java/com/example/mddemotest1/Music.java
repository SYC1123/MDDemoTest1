package com.example.mddemotest1;


public class Music {
    private String name;
    private int imageId;

    public Music(String name, int imageId) {
        this.imageId = imageId;
        this.name=name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }
}
