package vn.codegym.validation_form.service;

import vn.codegym.validation_form.model.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findAll();

    void create(Person person);
}
