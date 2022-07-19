package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void create(Product product);

    Product findById(String id);

    void update(Product product);

    void delete(String id);
}
