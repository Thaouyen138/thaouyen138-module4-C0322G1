package vn.codegym.cart.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(columnDefinition = "LONGBLOB")
    private String description;

    private long price;
    private String image;

    public Product(Integer id, String nameProduct, String description, long price, String image) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
