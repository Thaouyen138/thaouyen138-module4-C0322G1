package vn.codegym.restful_blog.service;

import vn.codegym.restful_blog.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();
}
