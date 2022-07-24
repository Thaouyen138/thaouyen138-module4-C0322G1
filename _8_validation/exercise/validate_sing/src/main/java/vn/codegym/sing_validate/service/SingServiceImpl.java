package vn.codegym.sing_validate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.sing_validate.model.Sing;
import vn.codegym.sing_validate.repository.ISingRepository;

import java.util.List;

@Service
public class SingServiceImpl implements ISingService {

    @Autowired
    private ISingRepository iSingRepository;

    @Override
    public List<Sing> findAll() {
        return iSingRepository.findAll();
    }

    @Override
    public void create(Sing sing) {
        iSingRepository.save(sing);
    }
}
