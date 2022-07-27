package vn.codegym.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.cart.model.Product;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
