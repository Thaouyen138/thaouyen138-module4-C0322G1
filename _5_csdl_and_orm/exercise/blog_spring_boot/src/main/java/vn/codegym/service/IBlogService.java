package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.model.Blog;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    void create(Blog blog);

    Blog findById(Integer id);

    void update(Blog blog);

    void delete(Integer id);
}
