package com.example.khajasangram;

public class Restaurant {
    private String  imageurl;
    private String restaurant_name;
    private String distance;
    private int rating;
    private String menuRef;



    public Restaurant(String imageurl, String restaurant_name, String distance, int rating, String menuRef) {
        this.imageurl = imageurl;
        this.restaurant_name = restaurant_name;
        this.distance = distance;
        this.rating = rating;
        this.menuRef = menuRef;
    }

    public Restaurant(String s) {

    }
    public Restaurant(String imageurl, String restaurant_name, String distance) {
        this.imageurl = imageurl;
        this.restaurant_name = restaurant_name;
        this.distance = distance;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public String getDistance() {
        return distance;
    }

    public int getRating() {
        return rating;
    }

    public String getMenuRef() {
        return menuRef;
    }
}
