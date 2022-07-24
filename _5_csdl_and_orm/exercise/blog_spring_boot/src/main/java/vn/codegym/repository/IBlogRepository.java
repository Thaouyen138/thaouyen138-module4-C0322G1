package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.model.Blog;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "SELECT * FROM blog WHERE status_delete = 0 AND content LIKE :content AND category_id Like :categoryId", nativeQuery = true)
    public Page<Blog> findAllBlog(@Param("content") String content, @Param("categoryId") String categoryId, Pageable pageable);
}
