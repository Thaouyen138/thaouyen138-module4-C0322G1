package vn.codegym.case_study.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.case_study.model.customer.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
//    @Query(value = "SELECT  * FROM customer where  status_delete = 0", nativeQuery = true)
//    public Page<Customer> findAllCustomer(Pageable pageable);

    @Query(value = "select  * from customer where id=:id and status_delete=0", nativeQuery = true)
    Customer findById(String id);
    @Query(value = "select * from  customer where status_delete=0 AND id like :id and customer_type like :customerType", nativeQuery = true)
    public Page<Customer> findByField(@Param("id") String id,@Param("customerType") String  customerType, Pageable pageable);
}
