package vn.codegym.case_study.service.impl.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.facility.FacilityType;
import vn.codegym.case_study.repository.facility.IFacilityTypeRepository;
import vn.codegym.case_study.service.itf.facility.IFacilityTypeService;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {

    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }
}
