package vn.codegym.restful_blog.service;

import vn.codegym.restful_blog.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    Blog findbyId(Integer id);

    List<Blog> findByName(String name);
}
