package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.codegym.model.Blog;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "SELECT * FROM blog WHERE status_delete = 0", nativeQuery = true)
    public Page<Blog> findAllBlog(Pageable pageable);
}
