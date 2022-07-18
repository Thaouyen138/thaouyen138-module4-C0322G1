package com.codegym.model;

public class Product {
    private  String name;
    private String price;
    private String describle;
    private String producer;

    public Product() {
    }

    public Product(String name, String price, String describle, String producer) {
        this.name = name;
        this.price = price;
        this.describle = describle;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
