package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Medical;
import vn.codegym.repository.IMedicalRepository;

import java.util.List;

@Service
public class MedicalServiceImpl implements IMedicalService {
    @Autowired
    private IMedicalRepository iMedicalRepository;

    @Override
    public List<Medical> findAll() {
        return iMedicalRepository.findAll();
    }

    @Override
    public void create(Medical medical) {
        iMedicalRepository.create(medical);
    }
}
