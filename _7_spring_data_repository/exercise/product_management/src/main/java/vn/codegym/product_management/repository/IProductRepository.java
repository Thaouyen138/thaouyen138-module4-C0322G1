package vn.codegym.product_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.product_management.model.Product;

public interface IProductRepository extends JpaRepository<Product, String> {
}
