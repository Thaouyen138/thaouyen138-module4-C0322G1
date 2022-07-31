package vn.codegym.phone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.phone.model.Phone;
import vn.codegym.phone.repository.IPhoneRepository;

import java.util.List;

@Service
public class PhoneServiceImpl implements IPhoneService {

    @Autowired
    private IPhoneRepository iPhoneRepository;


    @Override
    public List<Phone> findAll() {
        return iPhoneRepository.findAll();
    }

    @Override
    public Phone findById(Integer id) {
        return iPhoneRepository.findById(id).orElse(null);
    }
}
