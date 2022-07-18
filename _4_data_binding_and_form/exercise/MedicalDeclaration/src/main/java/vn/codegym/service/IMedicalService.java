package vn.codegym.service;

import vn.codegym.model.Medical;

import java.util.List;

public interface IMedicalService {
    List<Medical> findAll();

    void create(Medical medical);
}
