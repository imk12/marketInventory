package com.igor.marketInventory.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String marketName;

    @OneToMany(mappedBy = "market",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Shelf> shelves = new ArrayList<>();

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public List<Shelf> getShelves() {
        return shelves;
    }

    public void addShelf(Shelf shelf) {
        shelf.setMarket(this);
        shelves.add(shelf);
    }

    //Constructor

    protected Market () {}

    public Market(String marketName) {
        this.marketName = marketName;
    }
}
