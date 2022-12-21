package com.example.repeatmodule4.model;

public class Cart {
    private long id_product;
    private String name;
    private String img;
    private double price;
    private int amount;
    public Cart() {
    }

    public Cart(long id_product, String name, String img, double price, int amount) {
        this.id_product = id_product;
        this.name = name;
        this.img = img;
        this.price = price;
        this.amount = amount;
    }

    public long getId_product() {
        return id_product;
    }

    public void setId_product(long id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
