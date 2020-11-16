package com.database.webshop.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "Countries")
@Table(name = "countries")
public class Countries implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String name;

    private int code;

    @JsonManagedReference
    @OneToMany(mappedBy="country")
    private Set<Orders> orders;

    @JsonManagedReference
    @OneToMany(mappedBy="country")
    private Set<Users> users;

    public Countries() {
    }

    public Countries(Long ID, String name, int code, Set<Orders> orders, Set<Users> users) {
        this.ID = ID;
        this.name = name;
        this.code = code;
        this.orders = orders;
        this.users = users;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}
