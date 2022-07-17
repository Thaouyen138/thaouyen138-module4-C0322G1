package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Medical;

@Controller
public class MedicalController {
    @GetMapping("/")
    public String medical(Model model) {
        model.addAttribute("medical", new Medical());
        return "medical";
    }

    @PostMapping("/create")
    public String medicalDeclaration(@ModelAttribute("medical") Medical medical, Model model) {
        model.addAttribute("medical", medical);
        return "medical-declaration";
    }
}
