package vn.codegym.product_management.dto;

import javax.validation.constraints.NotEmpty;

public class ProductDto {

    @NotEmpty
    private String id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String price;

    @NotEmpty
    private String describle;

    @NotEmpty
    private String producer;

    public ProductDto() {
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
