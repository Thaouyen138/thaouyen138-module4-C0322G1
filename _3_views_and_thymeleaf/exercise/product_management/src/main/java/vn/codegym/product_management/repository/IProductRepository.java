package vn.codegym.product_management.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.product_management.model.Product;

public interface IProductRepository extends JpaRepository<Product, String> {
    @Query(value = "SELECT * FROM product WHERE id LIKE :id AND name Like :name", nativeQuery = true)
    public Page<Product> findAllBlog(@Param("id") String id, @Param("name") String name, Pageable pageable);

}
