package vn.codegym.case_study.service;

import vn.codegym.case_study.model.customer.Customer;
import vn.codegym.case_study.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findALl();
}
