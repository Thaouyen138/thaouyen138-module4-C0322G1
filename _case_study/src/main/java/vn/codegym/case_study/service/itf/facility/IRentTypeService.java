package vn.codegym.case_study.service.itf.facility;

import vn.codegym.case_study.model.facility.RentType;

import java.util.List;

public interface IRentTypeService {
    List<RentType> findAll();
}
