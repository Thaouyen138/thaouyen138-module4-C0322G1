package vn.codegym.repository;

import vn.codegym.model.Sing;

import java.util.List;

public interface ISingRepository {
    List<Sing> findAll();
}
