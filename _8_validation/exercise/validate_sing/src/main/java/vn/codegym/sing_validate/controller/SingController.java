package vn.codegym.sing_validate.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.sing_validate.dto.SingDto;
import vn.codegym.sing_validate.model.Sing;
import vn.codegym.sing_validate.service.ISingService;

@Controller
public class SingController {

    @Autowired
    private ISingService iSingService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("singList", iSingService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("singDto", new SingDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated SingDto singDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            Sing sing = new Sing( singDto.getNameSing(), singDto.getSinger(), singDto.getType());
            iSingService.create(sing);
            redirectAttributes.addFlashAttribute("message", "create sing:" + sing.getNameSing() + "OK!");
            return "redirect:/";
        }
    }

}
