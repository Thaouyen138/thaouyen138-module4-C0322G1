package vn.codegym.case_study.service.impl.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.customer.Customer;
import vn.codegym.case_study.repository.customer.ICustomerRepository;
import vn.codegym.case_study.service.itf.customer.ICustomerService;
 @Service
public class CustomerService implements ICustomerService {

     @Autowired
     private ICustomerRepository customerRepository;
    @Override
    public Page<Customer> findALl(String id, String customerType,String name,Pageable pageable) {
        return customerRepository.findByField("%"+id +"%","%" + customerType+ "%","%"+name +"%",pageable);
    }

     @Override
     public void create(Customer customer) {
        customer.setStatusDelete(0);
         customerRepository.save(customer);
     }

     @Override
     public void edit(Customer customer) {
        customer.setStatusDelete(0);
        customerRepository.save(customer);
     }

     @Override
     public Customer findById(String id) {
         return customerRepository.findById(id);
     }

     @Override
     public void delete(String id) {
        Customer customer = findById(id);
        customer.setStatusDelete(1);
        customerRepository.save(customer);
     }
 }
