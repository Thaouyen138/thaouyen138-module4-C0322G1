package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Blog;
import vn.codegym.model.Category;
import vn.codegym.service.IBlogService;
import vn.codegym.service.ICategoryService;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

    @ModelAttribute(name = "category")
    private List<Category> showCategory(){
        return iCategoryService.findAll();
    }


    @GetMapping("/")
    public String showList(@RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "categoryId", defaultValue = "") String categoryId,
                           @RequestParam(name = "content", defaultValue = "") String content,
                           Model model) {
        model.addAttribute("blogList", iBlogService.findAll(content, categoryId, PageRequest.of(page, 5)));
        model.addAttribute("content", content);
        model.addAttribute("categoryId", categoryId);
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
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
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog, Model model) {
        iBlogService.update(blog);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        iBlogService.delete(id);
        return "redirect:/";
    }
}
