package com.database.webshop.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Product_options_choice")
@Table(name = "product_options_choice")
public class Product_options_choice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column
    private String name;

    @JsonBackReference
    @ManyToMany(mappedBy = "productOptionsChoiceList")
    private List<Product_options> productOptionsList = new ArrayList<>();

    public Product_options_choice() {
    }

    public Product_options_choice(Long ID, String name, List<Product_options> productOptionsList) {
        this.ID = ID;
        this.name = name;
        this.productOptionsList = productOptionsList;
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

    public List<Product_options> getProductOptionsList() {
        return productOptionsList;
    }

    public void setProductOptionsList(List<Product_options> productOptionsList) {
        this.productOptionsList = productOptionsList;
    }
}
