package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Sing;
import vn.codegym.service.ISingService;

@Controller
public class SingController {
    @Autowired
    ISingService iSingService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("singList", iSingService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("sing", new Sing());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("sing") Sing sing, Model model) {
        iSingService.create(sing);
        model.addAttribute("singList", iSingService.findAll());
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model) {
        Sing sing = iSingService.findById(id);
        model.addAttribute("sing", sing);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("sing") Sing sing, Model model) {
        iSingService.update(sing);
        model.addAttribute("singList", iSingService.findAll());
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        iSingService.delete(id);
        model.addAttribute("singList", iSingService.findAll());
        return "list";
    }
}
