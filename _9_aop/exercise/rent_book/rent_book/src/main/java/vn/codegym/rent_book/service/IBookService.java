package vn.codegym.rent_book.service;

import vn.codegym.rent_book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findALl();

    Book findById(Integer id);

    void rentBook(Book book);
}
