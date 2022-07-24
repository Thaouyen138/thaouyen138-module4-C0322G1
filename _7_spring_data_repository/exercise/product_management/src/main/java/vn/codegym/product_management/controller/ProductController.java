package vn.codegym.product_management.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.product_management.dto.ProductDto;
import vn.codegym.product_management.model.Product;
import vn.codegym.product_management.service.IProductService;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("/")
    public String showList(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        model.addAttribute("productList", iProductService.findAll(PageRequest.of(page, 5)));
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated ProductDto productDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()){
            return "create";
        }
        else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto,product);
            iProductService.create(product);
            redirectAttributes.addFlashAttribute("message", "create person:" +product.getId()+"OK!");
            return "redirect:/";
        }
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
