package com.example.mddemotest1;

public class Photo_Item {
    private String name;
    private int imageId;

    public Photo_Item(String name, int imageId) {
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
