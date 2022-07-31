package vn.codegym.restful_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.restful_blog.model.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
