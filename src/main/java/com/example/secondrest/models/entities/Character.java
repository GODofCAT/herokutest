package com.example.secondrest.models.entities;

import javax.persistence.*;

@Entity
 public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;
    @Column
    public double rating;

    public Character() {
    }
}
