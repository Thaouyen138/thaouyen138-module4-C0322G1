package vn.codegym.service;

import vn.codegym.model.Blog;
import vn.codegym.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
