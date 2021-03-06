package com.example.farmmarketback.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Seller {


    private String name;
    private String email;
    private String username;
    private String password;
    private String personalInformation;
    private String address;
    private String phone;

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "seller")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public Seller setProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(String personalInformation) {
        this.personalInformation = personalInformation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

