package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import vn.codegym.service.IDictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("/")
    public String showDictionary() {
        return "list";
    }


}
