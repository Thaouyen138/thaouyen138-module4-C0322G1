package vn.codegym.rent_book.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.rent_book.model.RentBook;
import vn.codegym.rent_book.repository.IRentBookRepository;
import vn.codegym.rent_book.service.IRentBookService;

import java.util.List;

@Service
public class RentBookService implements IRentBookService {

    @Autowired
    private IRentBookRepository iRentBookRepository;
    @Override
    public List<RentBook> findAll() {
        return iRentBookRepository.findAll();
    }
}
