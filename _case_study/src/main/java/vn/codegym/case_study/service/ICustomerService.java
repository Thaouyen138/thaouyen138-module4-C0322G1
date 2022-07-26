package vn.codegym.case_study.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study.model.customer.Customer;


public interface ICustomerService {

    Page<Customer> findALl(Pageable pageable);

    void create(Customer customer);
}
