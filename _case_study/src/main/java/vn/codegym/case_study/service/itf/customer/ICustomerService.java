package vn.codegym.case_study.service.itf.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study.model.customer.Customer;


public interface ICustomerService {

    Page<Customer> findALl(String id, String customerType,String name, Pageable pageable);

    void create(Customer customer);

    void edit(Customer customer);

    Customer findById(String id);

    void delete(String id);
}
