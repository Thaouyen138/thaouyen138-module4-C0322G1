package vn.codegym.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product")
public class Product {
    @Id
    private String id;

    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    private String name;
    private String price;
    private String describle;
    private String producer;

    public Product() {
    }

    public Product(String id, String name, String price, String describle, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describle = describle;
        this.producer = producer;
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
