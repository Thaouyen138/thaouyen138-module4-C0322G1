package vn.codegym.service;

import vn.codegym.model.Sing;

import java.util.List;

public interface ISingService {
    List<Sing> findAll();

    void create(Sing sing);

    Sing findById(Integer id);

    void update(Sing sing);

    void delete(Integer id);
}
