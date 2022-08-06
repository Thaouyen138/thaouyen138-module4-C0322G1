package vn.codegym.case_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.case_study.model.customer.Customer;
import vn.codegym.case_study.model.customer.CustomerType;
import vn.codegym.case_study.model.facility.Facility;
import vn.codegym.case_study.model.facility.FacilityType;
import vn.codegym.case_study.model.facility.RentType;
import vn.codegym.case_study.service.itf.facility.IFacilityService;
import vn.codegym.case_study.service.itf.facility.IFacilityTypeService;
import vn.codegym.case_study.service.itf.facility.IRentTypeService;

import java.util.List;

@Controller
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private IFacilityTypeService iFacilityTypeService;

    @Autowired
    private IRentTypeService iRentTypeService;

    @ModelAttribute(name = "facilityType")
    private List<FacilityType> showFacilityType(){
        return iFacilityTypeService.findAll();
    }

    @ModelAttribute(name = "rentType")
    private List<RentType> showRentType(){
        return iRentTypeService.findAll();
    }

    @GetMapping("")
    public String showListCustomer(@RequestParam(name = "page", defaultValue = "0") int page,
                                   @RequestParam(name = "id",defaultValue = "") String id,
                                   @RequestParam(name = "name",defaultValue = "") String name,
                                   Model model ){
        model.addAttribute("facilityList", iFacilityService.findAll(id,name, PageRequest.of(page, 8)));
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        return  "facility/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("facility", new Facility());
        return "facility/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("facility") Facility facility) {
        iFacilityService.create(facility);
        return "redirect:/facility";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") String id, Model model) {
        Facility facility = iFacilityService.findById(id);
        model.addAttribute("facility", facility);
        return "facility/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("facility") Facility facility) {
        iFacilityService.edit(facility);
        return "redirect:/facility";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        iFacilityService.delete(id);
        return "redirect:/facility";
    }
}
