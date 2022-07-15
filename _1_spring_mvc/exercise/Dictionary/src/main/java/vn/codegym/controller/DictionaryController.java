package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.service.IDictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("/")
    public String word() {
        return "list";
    }

    @GetMapping("/mean")
    public  String mean(@RequestParam String mean, @RequestParam String input, Model model){
        String result = iDictionaryService.dictionary(mean,input);
        model.addAttribute("result",mean);
        return "list";
    }

}
