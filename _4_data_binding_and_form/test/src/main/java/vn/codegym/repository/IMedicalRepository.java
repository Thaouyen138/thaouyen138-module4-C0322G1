package vn.codegym.repository;

import org.springframework.stereotype.Service;
import vn.codegym.model.Medical;

import java.util.List;
public interface IMedicalRepository {
    List<Medical> findAll();
    void create(Medical medical);
}
