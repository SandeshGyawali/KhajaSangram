package com.example.khajasangram;

public class Food {
    private String id;
    private String name;
    private int res_id;
    private int price;
    private String img_path;
    private int menu_id;

    public Food(String id, String name, int res_id, int price, String img_path, int menu_id) {
        this.id = id;
        this.name = name;
        this.res_id = res_id;
        this.price = price;
        this.img_path = img_path;
        this.menu_id = menu_id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRes_id() {
        return res_id;
    }

    public int getPrice() {
        return price;
    }

    public String getImg_path() {
        return img_path;
    }

    public int getMenu_id() {
        return menu_id;
    }
}
