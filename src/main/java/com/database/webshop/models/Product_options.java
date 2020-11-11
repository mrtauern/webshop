package com.database.webshop.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Product_options")
@Table(name = "Product_options")
public class Product_options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column
    private String name;

    @ManyToMany(mappedBy = "Products_Product_options")
    private List<Products> products  = new ArrayList<>();

    public Product_options() {
    }

    public Product_options(Long ID, String name, List<Products> products) {
        this.ID = ID;
        this.name = name;
        this.products = products;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
