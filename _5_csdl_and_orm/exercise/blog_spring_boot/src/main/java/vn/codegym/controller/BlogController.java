package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Blog;
import vn.codegym.service.IBlogService;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;


    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("blogList", iBlogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("product") Blog blog, Model model) {
        iBlogService.create(blog);
        model.addAttribute("blogList", iBlogService.findAll());
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("product") Blog blog, Model model) {
        iBlogService.update(blog);
        model.addAttribute("blogList", iBlogService.findAll());
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        iBlogService.delete(id);
        model.addAttribute("blogList", iBlogService.findAll());
        return "list";
    }
}
