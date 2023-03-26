package com.huy.model;

public class Picture {
    private int id;
    private String picture_code;
    private double width;
    private double height;
    private String material;
    private String description;
    private double price;

    public Picture() {
    }

    public Picture(int id, String picture_code, double width, double height, String material, String description, double price) {
        this.id = id;
        this.picture_code = picture_code;
        this.width = width;
        this.height = height;
        this.material = material;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture_code() {
        return picture_code;
    }

    public void setPicture_code(String picture_code) {
        this.picture_code = picture_code;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
