package vn.codegym.rent_book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.rent_book.model.Book;
import vn.codegym.rent_book.model.RentBook;
import vn.codegym.rent_book.service.IBookService;
import vn.codegym.rent_book.service.IRentBookService;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private IBookService iBookService;

    @Autowired
    private IRentBookService iRentBookService;

    @ModelAttribute(name = "rentBook")
    private List<RentBook> showRentBook(){
        return iRentBookService.findAll();
    }

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("bookList", iBookService.findALl());
        return "list";
    }
    @GetMapping("/rentBook/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model) {
        Book book = iBookService.findById(id);
        model.addAttribute("book", book);
        return "rentbook";
    }

    @PostMapping("/rentBook")
    public String edit(@ModelAttribute("blog") Book book, Model model) {
        iBookService.rentBook(book);
        return "redirect:/";
    }
}
