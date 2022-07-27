package vn.codegym.rent_book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.rent_book.model.Book;
import vn.codegym.rent_book.repository.IBookRepository;
import vn.codegym.rent_book.service.IBookService;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository iBookRepository;
    @Override
    public List<Book> findALl() {
        return iBookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return iBookRepository.findById(id).orElse(null);
    }

    @Override
    public void rentBook(Book book) {
        iBookRepository.save(book);
    }
}
