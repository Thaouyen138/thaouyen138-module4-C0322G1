package vn.codegym.sing_validate.service;

import vn.codegym.sing_validate.model.Sing;

import java.util.List;

public interface ISingService {
    List<Sing> findAll();

    void create(Sing sing);
}
