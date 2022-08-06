package vn.codegym.case_study.service.impl.facility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.customer.Customer;
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

    @Override
    public void create(Facility facility) {
        facility.setStatusDelete(0);
        iFacilityRepository.save(facility);
    }

    @Override
    public void edit(Facility facility) {
        facility.setStatusDelete(0);
        iFacilityRepository.save(facility);
    }

    @Override
    public Facility findById(String id) {
        return iFacilityRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(String id) {
        Facility facility = findById(id);
        facility.setStatusDelete(1);
        iFacilityRepository.save(facility);
    }
}
