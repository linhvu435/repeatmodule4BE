package com.example.repeatmodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int amount;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "id_bill")
    private Bill bill;

    public BillDetail() {
    }

    public BillDetail( int amount, Product product, Bill bill) {
        this.amount = amount;
        this.product = product;
        this.bill = bill;
    }
}
