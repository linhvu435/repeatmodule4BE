package com.example.repeatmodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "img", columnDefinition = "longtext")
    private String img;
    private double price;
    private int amount;
    @ManyToOne
    @JoinColumn(name = "id_shop")
    private Shop shop;
    @ManyToOne
    @JoinColumn(name = "id_evaluate")
    private Evaluate evaluate;
    public Product() {
    }

    public Product(long id, String name, String img, double price, int amount, Shop shop) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.amount = amount;
        this.shop = shop;
    }
}
