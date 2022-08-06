package vn.codegym.case_study.service.itf.facility;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study.model.customer.Customer;
import vn.codegym.case_study.model.facility.Facility;

public interface IFacilityService {

  Page<Facility> findAll(String id, String name, Pageable pageable);

  void create(Facility facility);

  void edit(Facility facility);

  Facility findById(String id);

  void delete(String id);
}
