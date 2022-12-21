package com.example.repeatmodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;

    public Shop() {
    }

    public Shop(String name, Account account) {
        this.name = name;
        this.account = account;
    }
}
