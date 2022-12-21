package com.example.repeatmodule4.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String text;
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    public Comment() {
    }

    public Comment(String text, Account account, Product product) {
        this.text = text;
        this.account = account;
        this.product = product;
    }
}
