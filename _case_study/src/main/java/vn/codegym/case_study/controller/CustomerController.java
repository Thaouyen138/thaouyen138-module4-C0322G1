package vn.codegym.case_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.case_study.model.customer.CustomerType;
import vn.codegym.case_study.service.ICustomerService;
import vn.codegym.case_study.service.ICustomerTypeService;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerTypeService iCustomerTypeService;
    @Autowired
    private ICustomerService iCustomerService;

    @ModelAttribute(name = "customerType")
    private List<CustomerType> showCustomerType(){
        return iCustomerTypeService.findALl();
    }

    @GetMapping("/customer")
    public String showListCustomer(@RequestParam(name = "page", defaultValue = "0") int page,
                                   Model model
    ) {
        model.addAttribute("customerList", iCustomerService.findALl(PageRequest.of(page, 5)));
        return  "customer/list";
    }

    @GetMapping("/")
    public String showList(){
        return  "home";
    }
}
