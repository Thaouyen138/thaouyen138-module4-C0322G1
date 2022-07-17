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

    @GetMapping("/dictionary")
    public  String mean(@RequestParam("word") String word, Model model){
        String result = iDictionaryService.dictionary(word);
        if(result == null) {
            model.addAttribute("result", "This word not exits");
        }else {
            model.addAttribute("result",result);
        }
        return "list";
    }

}
