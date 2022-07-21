package vn.codegym.product_management.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.product_management.model.Product;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);

    void create(Product product);

    Product findById(String id);

    void update(Product product);

    void delete(String id);
}
