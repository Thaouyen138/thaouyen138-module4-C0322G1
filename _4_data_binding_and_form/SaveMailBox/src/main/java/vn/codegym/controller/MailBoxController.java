package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.MailBox;

@Controller
public class MailBoxController {
    @GetMapping("/")
    public String mail(Model model) {
        model.addAttribute("mailBox", new MailBox());
        return "list";
    }

    @PostMapping("/create")
    public String mailBox(@ModelAttribute("mailBox") MailBox mailBox, Model model) {
        model.addAttribute("mailBox", mailBox);
        return "mail-box";
    }
}
