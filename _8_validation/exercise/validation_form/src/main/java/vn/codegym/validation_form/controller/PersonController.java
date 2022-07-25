package vn.codegym.validation_form.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.validation_form.dto.PersonDto;
import vn.codegym.validation_form.model.Person;
import vn.codegym.validation_form.service.IPersonService;

@Controller
public class
PersonController {

    @Autowired
    private IPersonService iPersonService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("personList", iPersonService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("personDto", new PersonDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated PersonDto personDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            Person person = new Person();
            BeanUtils.copyProperties(personDto, person);
            iPersonService.create(person);
            redirectAttributes.addFlashAttribute("message", "create person:" + person.getFirstName() + person.getLastName() + "OK!");
            return "redirect:/";
        }
    }

}
