package vn.codegym.restful_blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.restful_blog.model.Blog;
import vn.codegym.restful_blog.repository.IBlogRepository;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService{

    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Blog findbyId(Integer id) {
        return iBlogRepository.findById(id).orElse(null);
    }
}
