package com.database.webshop.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "Categories")
@Table(name = "categories")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String thumbnail;
    @Column
    private Long main_category;

    //@JsonManagedReference
    @JsonBackReference
    @ManyToMany(mappedBy = "categoriesList")
    private List<Products> productsList = new ArrayList<>();



    public Categories() {
    }

    public Categories(Long ID, String name, String description, String thumbnail, Long main_category, List<Products> productsList) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.main_category = main_category;
        this.productsList = productsList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Long getMain_category() {
        return main_category;
    }

    public void setMain_category(Long main_category) {
        this.main_category = main_category;
    }

    public List<Products> getProducts() {
        return productsList;
    }

    public void setPosts(List<Products> productsList) {
        this.productsList = productsList;
    }
}
