package vn.codegym.cart.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.cart.dto.CartDto;
import vn.codegym.cart.dto.ProductDto;
import vn.codegym.cart.model.Product;
import vn.codegym.cart.service.IProductService;

import java.util.Optional;

@SessionAttributes("cart") // khai báo session tên là cart
@Controller
@RequestMapping("/shop")
public class ProductController {

    //khởi tạo giá trị mặc định cho session cart
    @ModelAttribute("cart")
    public CartDto card(){
        return new CartDto();
    }

    @Autowired
    private IProductService iProductService;

    @GetMapping
    public ModelAndView showList(@RequestParam(name = "page", defaultValue = "0") int page){
        return new ModelAndView("list", "productList",iProductService.findALl(PageRequest.of(page, 5)));
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Integer id,
                            @ModelAttribute("cart") CartDto cartDto)//lấy session ra dùng
    {
        Optional<Product> product = iProductService.findById(id);
        if (product.isPresent()){
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product.get(),productDto);
            cartDto.addProduct(productDto);
        }
        return "redirect:/cart";
    }



}
