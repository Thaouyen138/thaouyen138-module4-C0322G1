package vn.codegym.case_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.customer.Customer;
import vn.codegym.case_study.repository.ICustomerRepository;
import vn.codegym.case_study.service.ICustomerService;
 @Service
public class CustomerService implements ICustomerService {

     @Autowired
     private ICustomerRepository customerRepository;
    @Override
    public Page<Customer> findALl(Pageable pageable) {
        return customerRepository.findAllCustomer(pageable);
    }
}
