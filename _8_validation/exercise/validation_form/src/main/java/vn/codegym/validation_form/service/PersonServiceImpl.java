package vn.codegym.validation_form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.validation_form.model.Person;
import vn.codegym.validation_form.repository.IPersonRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonRepository iPersonRepository;


    @Override
    public List<Person> findAll() {
        return  iPersonRepository.findAll();
    }

    @Override
    public void create(Person person) {
        iPersonRepository.save(person);
    }
}
