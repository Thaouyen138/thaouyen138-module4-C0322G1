package vn.codegym.case_study.service.impl.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.facility.RentType;
import vn.codegym.case_study.repository.facility.IRentTypeRepository;
import vn.codegym.case_study.service.itf.facility.IRentTypeService;
import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {

    @Autowired
    private IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return iRentTypeRepository.findAll();
    }
}
