package vn.codegym.restful_blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.codegym.restful_blog.model.Blog;
import vn.codegym.restful_blog.service.IBlogService;
import java.util.List;
@RestController
@RequestMapping("/blog/api/v1")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getBlogList(){
        List<Blog> blogList = iBlogService.findAll();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return  new ResponseEntity<>(blogList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogId(@PathVariable Integer id){
        Blog blog = (iBlogService.findbyId(id));
        if (blog == null){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }
}
