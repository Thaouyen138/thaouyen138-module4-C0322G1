package vn.codegym.rent_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.rent_book.model.Book;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}
