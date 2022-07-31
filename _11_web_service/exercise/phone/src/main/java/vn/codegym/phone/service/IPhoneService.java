package vn.codegym.phone.service;

import vn.codegym.phone.model.Phone;

import java.util.List;

public interface IPhoneService {

    List<Phone> findAll();

    Phone findById(Integer id);
}
