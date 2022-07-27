package vn.codegym.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.cart.dto.CartDto;

@Controller
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public ModelAndView showCart (@SessionAttribute(name = "cart",required = false)CartDto cartDto){
        return  new ModelAndView("cart", "cart", cartDto);
    }
}
