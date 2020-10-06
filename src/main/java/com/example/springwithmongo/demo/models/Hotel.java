package com.example.springwithmongo.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

// This let mongo treat this as a document and stored in collections
@Document("Hotels")
public class Hotel {

    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int pricePerNight;
    private Address address;


    public Hotel(String name, int pricePerNight, Address address) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
