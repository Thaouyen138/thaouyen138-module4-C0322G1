package vn.codegym.cart.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.cart.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Page<Product> findALl(Pageable pageable);

    Optional<Product> findById(Integer id);

    void create(Product product);
}
