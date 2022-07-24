package vn.codegym.validation_form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.validation_form.model.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {
}
