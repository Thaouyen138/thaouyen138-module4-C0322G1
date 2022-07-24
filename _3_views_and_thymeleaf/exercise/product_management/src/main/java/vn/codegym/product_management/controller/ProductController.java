package vn.codegym.product_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.product_management.model.Product;
import vn.codegym.product_management.service.IProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/")
    public String showList(@RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name="id",defaultValue = "") String id,
                           @RequestParam(name="name",defaultValue = "") String name,
                           Model model) {
        model.addAttribute("productList", iProductService.findAll(id,name,PageRequest.of(page, 5)));
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
        return "redirect:/";
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
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id, Model model) {
        iProductService.delete(id);
        return "redirect:/";
    }
}
