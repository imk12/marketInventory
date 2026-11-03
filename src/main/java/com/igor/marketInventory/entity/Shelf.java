package com.igor.marketInventory.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String shelfName;

    @OneToMany(mappedBy = "shelf",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "market_id")
    private Market market;

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelf_name) {
        this.shelfName = shelf_name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product products) {
        products.setShelf(this);
        this.products.add(products);
    }

    public Market getMarket() {
        return market;
    }

    //Constructor

    protected Shelf() {}

    public Shelf(Market market, String shelf_name) {
        this.market = market;
        this.shelfName = shelf_name;
    }
}
