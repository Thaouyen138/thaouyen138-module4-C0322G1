package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Blog;
import vn.codegym.service.IBlogService;
import vn.codegym.service.ICategoryService;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;


    @GetMapping("/")
    public String showList(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        model.addAttribute("blogList", iBlogService.findAll(PageRequest.of(page, 1)));
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("category",iCategoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog) {
        iBlogService.create(blog);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model) {
        Blog blog = iBlogService.findById(id);
        model.addAttribute("category",iCategoryService.findAll());
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("product") Blog blog, Model model) {
        iBlogService.update(blog);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        iBlogService.delete(id);
        return "redirect:/";
    }
}
