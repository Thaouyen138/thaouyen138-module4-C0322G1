package vn.codegym.rent_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.rent_book.model.RentBook;

public interface IRentBookRepository extends JpaRepository<RentBook,Integer> {
}
