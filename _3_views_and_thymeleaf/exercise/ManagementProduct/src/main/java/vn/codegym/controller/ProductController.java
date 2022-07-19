package vn.codegym.controller;

import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Product;
import vn.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("productList", iProductService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("product") Product product, Model model) {
        iProductService.create(product);
        model.addAttribute("productList", iProductService.findAll());
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") String id, Model model) {
        Product product = iProductService.findById(id);
        model.addAttribute("product", product);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("product") Product product, Model model) {
        iProductService.update(product);
        model.addAttribute("productList", iProductService.findAll());
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id, Model model) {
        iProductService.delete(id);
        model.addAttribute("productList", iProductService.findAll());
        return "list";
    }
}
