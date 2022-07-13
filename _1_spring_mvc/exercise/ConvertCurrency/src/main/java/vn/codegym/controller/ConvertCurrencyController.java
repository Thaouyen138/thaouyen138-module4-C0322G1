package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.service.CalculateServiceImpl;
import vn.codegym.service.ICalculateService;

import javax.jws.WebParam;

@Controller

public class ConvertCurrencyController {
    @Autowired
    private ICalculateService calculateService;

    @PostMapping("/convert")
    public String showCalculate(@RequestParam(name = "usd") Double usd, Model model) {
        Double result = calculateService.convertCurrentcy(usd);
        model.addAttribute("result", result);
        return "list";
    }

    @GetMapping("/")
    public String showCalculate() {
        return "list";
    }

}
