package com.database.webshop.models;

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

    @ManyToMany(mappedBy = "categoriesList")
    private List<Products> products = new ArrayList<>();

    public Categories() {
    }

    public Categories(Long ID, String name, String description, String thumbnail, Long main_category, List<Products> products) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.main_category = main_category;
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
        return products;
    }

    public void setPosts(List<Products> products) {
        this.products = products;
    }
}
