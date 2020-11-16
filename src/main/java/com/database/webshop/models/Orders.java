package com.database.webshop.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Entity(name = "Orders")
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private int tracking_number;

    private String order_firstname;
    private String order_lastname;
    private String order_streetname;
    private String order_streetnumber;
    private String order_town;
    private String order_zip;
    private String order_email;
    private int order_phone;

    private Timestamp create_date;

    private String comment;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UsersID")
    private Users user;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Order_statusID")
    private Order_status order_status;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountriesID")
    private Countries country;

    @JsonManagedReference
    @OneToMany(mappedBy="order")
    private Set<Items> items;

    public Orders() {
    }

    public Orders(Long ID, int tracking_number, String order_firstname, String order_lastname, String order_streetname, String order_streetnumber, String order_town, String order_zip, String order_email, int order_phone, Timestamp create_date, String comment, Users user, Order_status order_status, Countries country, Set<Items> items) {
        this.ID = ID;
        this.tracking_number = tracking_number;
        this.order_firstname = order_firstname;
        this.order_lastname = order_lastname;
        this.order_streetname = order_streetname;
        this.order_streetnumber = order_streetnumber;
        this.order_town = order_town;
        this.order_zip = order_zip;
        this.order_email = order_email;
        this.order_phone = order_phone;
        this.create_date = create_date;
        this.comment = comment;
        this.user = user;
        this.order_status = order_status;
        this.country = country;
        this.items = items;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getTracking_number() {
        return tracking_number;
    }

    public void setTracking_number(int tracking_number) {
        this.tracking_number = tracking_number;
    }

    public String getOrder_firstname() {
        return order_firstname;
    }

    public void setOrder_firstname(String order_firstname) {
        this.order_firstname = order_firstname;
    }

    public String getOrder_lastname() {
        return order_lastname;
    }

    public void setOrder_lastname(String order_lastname) {
        this.order_lastname = order_lastname;
    }

    public String getOrder_streetname() {
        return order_streetname;
    }

    public void setOrder_streetname(String order_streetname) {
        this.order_streetname = order_streetname;
    }

    public String getOrder_streetnumber() {
        return order_streetnumber;
    }

    public void setOrder_streetnumber(String order_streetnumber) {
        this.order_streetnumber = order_streetnumber;
    }

    public String getOrder_town() {
        return order_town;
    }

    public void setOrder_town(String order_town) {
        this.order_town = order_town;
    }

    public String getOrder_zip() {
        return order_zip;
    }

    public void setOrder_zip(String order_zip) {
        this.order_zip = order_zip;
    }

    public String getOrder_email() {
        return order_email;
    }

    public void setOrder_email(String order_email) {
        this.order_email = order_email;
    }

    public int getOrder_phone() {
        return order_phone;
    }

    public void setOrder_phone(int order_phone) {
        this.order_phone = order_phone;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Order_status getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Order_status order_status) {
        this.order_status = order_status;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public Set<Items> getItems() {
        return items;
    }

    public void setItems(Set<Items> items) {
        this.items = items;
    }
}