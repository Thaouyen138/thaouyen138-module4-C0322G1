package vn.codegym.case_study.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.codegym.case_study.model.customer.Customer;

public interface ICustomerRepository  extends JpaRepository<Customer,Integer> {
    @Query(value = "SELECT  * FROM customer where  status_delete = 0" ,nativeQuery = true)
    public Page<Customer> findAllCustomer (Pageable pageable);

}
