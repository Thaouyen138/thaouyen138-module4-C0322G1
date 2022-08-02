package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Blog;
import vn.codegym.service.IBlogService;

@RequestMapping("/blog")
@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;


    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("blogList", iBlogService.findAll());
        return "blog/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "blog/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("product") Blog blog, Model model) {
        iBlogService.create(blog);
        model.addAttribute("blogList", iBlogService.findAll());
        return "blog/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "blog/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("product") Blog blog, Model model) {
        iBlogService.update(blog);
        model.addAttribute("blogList", iBlogService.findAll());
        return "blog/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        iBlogService.delete(id);
        model.addAttribute("blogList", iBlogService.findAll());
        return "blog/list";
    }
}
