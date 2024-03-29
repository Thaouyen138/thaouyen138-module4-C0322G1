package vn.codegym.case_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.case_study.model.customer.Customer;
import vn.codegym.case_study.model.customer.CustomerType;
import vn.codegym.case_study.service.itf.customer.ICustomerService;
import vn.codegym.case_study.service.itf.customer.ICustomerTypeService;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerTypeService iCustomerTypeService;
    @Autowired
    private ICustomerService iCustomerService;

    @ModelAttribute(name = "customerType")
    private List<CustomerType> showCustomerType(){
        return iCustomerTypeService.findALl();
    }

    @GetMapping("")
    public String showListCustomer(@RequestParam(name = "page", defaultValue = "0") int page,
                                   @RequestParam(name = "id",defaultValue = "") String id,
                                   @RequestParam(name = "customerId",defaultValue = "") String customerId,
                                   @RequestParam(name = "name",defaultValue = "") String name,
                                   Model model ){
        model.addAttribute("customerList", iCustomerService.findALl(id,customerId,name,PageRequest.of(page, 8)));
        model.addAttribute("id",id);
        model.addAttribute("customerId",customerId);
        model.addAttribute("name",name);
        return  "customer/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("customer") Customer customer) {
        iCustomerService.create(customer);
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") String id, Model model) {
        Customer customer = iCustomerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Customer customer) {
        iCustomerService.edit(customer);
        return "redirect:/customer";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        iCustomerService.delete(id);
        return "redirect:/customer";
    }
}
