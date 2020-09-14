package com.example.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String make;
    private Integer memo;
    private String core;
    private String tower;
    private Boolean used;
    private Float price;
    private Integer year;

    public Note(String model, String make, Integer memo, String core, String tower, Boolean used, Float price, Integer year) {
        this.model = model;
        this.make = make;
        this.memo = memo;
        this.core = core;
        this.tower = tower;
        this.used = used;
        this.price = price;
        this.year = year;
    }

}
