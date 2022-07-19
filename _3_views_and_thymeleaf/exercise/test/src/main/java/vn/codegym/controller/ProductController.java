package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vn.codegym.service.IProductService;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("productList", iProductService.findAll());
        return "/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        iProductService.delete(id);
        model.addAttribute("productList", iProductService.findAll());
        return "list";
    }
}
