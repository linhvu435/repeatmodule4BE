package com.example.repeatmodule4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Evaluate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int number_star;
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;
    public Evaluate(int number_star) {
        this.number_star = number_star;
    }

    public Evaluate() {

    }
}
