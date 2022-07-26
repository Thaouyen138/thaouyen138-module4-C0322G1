package vn.codegym.rent_book.service;

import vn.codegym.rent_book.model.RentBook;

import java.util.List;

public interface IRentBookService {
    List<RentBook> findAll();
}
