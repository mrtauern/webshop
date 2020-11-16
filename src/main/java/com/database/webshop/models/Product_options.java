package com.database.webshop.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Product_options")
@Table(name = "product_options")
public class Product_options implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column
    private String name;

    @JsonBackReference
    @ManyToMany(mappedBy = "productOptionsList")
    private List<Products> products  = new ArrayList<>();

    @JsonManagedReference
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "product_options_product_options_choice",
            joinColumns = @JoinColumn(name = "Product_optionsID"),
            inverseJoinColumns = @JoinColumn(name = "Product_options_choiceID")
    )
    private List<Product_options_choice> productOptionsChoiceList = new ArrayList<>();

    public Product_options() {
    }

    public Product_options(Long ID, String name, List<Products> products, List<Product_options_choice> productOptionsChoiceList) {
        this.ID = ID;
        this.name = name;
        this.products = products;
        this.productOptionsChoiceList = productOptionsChoiceList;
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

    public List<Product_options_choice> getProductOptionsChoiceList() {
        return productOptionsChoiceList;
    }

    public void setProductOptionsChoiceList(List<Product_options_choice> productOptionsChoiceList) {
        this.productOptionsChoiceList = productOptionsChoiceList;
    }
}
