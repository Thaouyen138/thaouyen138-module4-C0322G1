package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Blog;
import vn.codegym.repository.IBlogRepository;
import vn.codegym.service.IBlogService;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAllBlog(pageable);
    }

    @Override
    public void create(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(Integer id) {
        //orelse : nếu khônng tìm thấy trả về null
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void delete(Integer id) {
        Blog blog = findById(id);
        blog.setStatusDelete(1);
        iBlogRepository.save(blog);
    }
}
