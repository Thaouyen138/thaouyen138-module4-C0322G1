package vn.codegym.restful_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.restful_blog.model.Blog;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value = "select * from blog where name like :name", nativeQuery = true)
    List<Blog> findByName(@Param("name") String name);
}
