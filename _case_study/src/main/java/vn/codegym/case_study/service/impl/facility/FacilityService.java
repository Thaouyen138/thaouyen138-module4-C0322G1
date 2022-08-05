package vn.codegym.case_study.service.impl.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.facility.Facility;
import vn.codegym.case_study.repository.facility.IFacilityRepository;
import vn.codegym.case_study.service.itf.facility.IFacilityService;

@Service
public class FacilityService implements IFacilityService {

    @Autowired
    private IFacilityRepository iFacilityRepository;
    @Override
    public Page<Facility> findAll(String id, String name, Pageable pageable) {
        return iFacilityRepository.findByField("%"+id +"%", "%"+name +"%", pageable);
    }
}
