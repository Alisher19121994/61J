package com.best.a61j;

public class Details {
    String name;
    int imageview;

    public Details(String name, int imageview) {
        this.name = name;
        this.imageview = imageview;
    }

    public String getName() {
        return name;
    }

    public int getImageview() {
        return imageview;
    }

    @Override
    public String toString() {
        return "Details{" +
                "name='" + name + '\'' +
                ", imageview=" + imageview +
                '}';
    }
}
