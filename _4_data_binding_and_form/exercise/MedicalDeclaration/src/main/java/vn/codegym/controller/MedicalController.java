package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Medical;
import vn.codegym.repository.IMedicalRepository;
import vn.codegym.service.IMedicalService;

@Controller
public class MedicalController {
    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("/")
    public String medical(Model model) {
        model.addAttribute("medical", new Medical());
        return "medical";
    }

    @PostMapping("/create")
    public String medicalDeclaration(@ModelAttribute("medical") Medical medical, Model model) {
        iMedicalService.create(medical);
        model.addAttribute("medicalList", iMedicalService.findAll());
        return "medical-declaration";
    }
}
