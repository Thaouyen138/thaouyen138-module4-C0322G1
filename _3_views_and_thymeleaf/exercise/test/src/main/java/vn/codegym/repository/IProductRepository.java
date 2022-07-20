package vn.codegym.repository;


import vn.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void create(Product product);

    Product findById(String id);

    void update(Product product);

    void delete(String id);
}
