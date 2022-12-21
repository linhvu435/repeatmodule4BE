package com.example.repeatmodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_shop")
    private Shop shop;

}
