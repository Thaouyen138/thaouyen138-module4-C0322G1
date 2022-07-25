package vn.codegym.case_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.customer.CustomerType;
import vn.codegym.case_study.repository.ICustomerTypeRepository;
import vn.codegym.case_study.service.ICustomerTypeService;
import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {

    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findALl() {
        return iCustomerTypeRepository.findAll();
    }
}
