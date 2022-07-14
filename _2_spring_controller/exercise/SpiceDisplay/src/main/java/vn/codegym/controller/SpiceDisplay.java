package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.service.ISpiceService;

@Controller
public class SpiceDisplay {
    @Autowired
    ISpiceService iSpiceService;

    @GetMapping("/")
    public String showSpice() {
        return "list";
    }

    @PostMapping("/spice")
    public String displaySpice(@RequestParam(name = "spice", required = false) String[] spiceList, Model model) {
        String[] displaySpice = iSpiceService.displaySpice(spiceList);
        model.addAttribute("displaySpice", displaySpice);
        return "result";
    }
}
