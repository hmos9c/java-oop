package hmos9c.data;

import hmos9c.annotation._54Fancy;
@_54Fancy(name = "AnimalApp", tags = {"application", "java"})
public enum _43Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    _43Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}