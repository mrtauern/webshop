package com.database.webshop.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
//@Table(name = "Products")
/*@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getProductList",
                procedureName = "get_product_list",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "amount", type = int.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "page_no", type = int.class)
                },
                resultClasses = Products.class)
})*/
public class Products implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private double price;

    @Column
    private Integer stock;

    @Column
    private double weight;

    @Column
    private String picture;

    @Column
    private String thumbnail;

    @Column
    private Timestamp create_date;

    public Products() {
    }

    public Products(Long ID, String name, String description, double price, Integer stock, double weight, String picture, String thumbnail, Timestamp create_date) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.weight = weight;
        this.picture = picture;
        this.thumbnail = thumbnail;
        this.create_date = create_date;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }
}
