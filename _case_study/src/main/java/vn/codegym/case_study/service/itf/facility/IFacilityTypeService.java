package vn.codegym.case_study.service.itf.facility;

import vn.codegym.case_study.model.facility.FacilityType;

import java.util.List;

public interface IFacilityTypeService {
    List<FacilityType> findAll();
}
