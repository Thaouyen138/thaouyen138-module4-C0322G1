package vn.codegym.phone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.phone.model.Phone;

public interface IPhoneRepository extends JpaRepository<Phone,Integer> {
}
