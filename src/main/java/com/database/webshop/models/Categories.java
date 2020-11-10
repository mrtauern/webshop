package com.database.webshop.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@Entity
public class Categories {

    @Transient
    Logger log = Logger.getLogger(Products.class.getName());

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

    @ManyToMany
    @JoinTable(name = "Products_Categories",
            joinColumns = @JoinColumn(name = "CategoriesID"),
            inverseJoinColumns = @JoinColumn(name = "ProductsID"))
    private Set<Products> productsCategories = new HashSet<>();

    public Categories() {
    }

    public Categories(Logger log, Long ID, String name, String description, String thumbnail, Long main_category) {
        this.log = log;
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.main_category = main_category;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
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
}
