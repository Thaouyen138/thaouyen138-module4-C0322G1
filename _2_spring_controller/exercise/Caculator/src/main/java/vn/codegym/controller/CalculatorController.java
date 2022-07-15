package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.service.ICalculatorService;

@Controller
public class CalculatorController {
    @Autowired
    ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String cal() {
        return "list";
    }

    @GetMapping("/cal")
    public String result(@RequestParam String calculator, @RequestParam double num1, @RequestParam double num2, Model model) {
        double result = iCalculatorService.cal(calculator, num1, num2);
        model.addAttribute("result", result);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "list";
    }
}
