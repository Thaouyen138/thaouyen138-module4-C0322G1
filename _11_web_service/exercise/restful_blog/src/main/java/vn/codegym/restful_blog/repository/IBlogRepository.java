package vn.codegym.restful_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.restful_blog.model.Blog;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
