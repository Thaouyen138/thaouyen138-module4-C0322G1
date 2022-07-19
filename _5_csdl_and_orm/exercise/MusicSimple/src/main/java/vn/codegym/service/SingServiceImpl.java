package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Sing;
import vn.codegym.repository.ISingRepository;

import java.util.List;

@Service
public class SingServiceImpl implements ISingService {
    @Autowired
    ISingRepository iSingRepository;

    @Override
    public List<Sing> findAll() {
        return iSingRepository.findAll();
    }

    @Override
    public void create(Sing sing) {
        iSingRepository.create(sing);
    }

    @Override
    public Sing findById(Integer id) {
        return iSingRepository.findById(id);
    }

    @Override
    public void update(Sing sing) {
        iSingRepository.update(sing);
    }

    @Override
    public void delete(Integer id) {
        iSingRepository.delete(id);
    }
}
