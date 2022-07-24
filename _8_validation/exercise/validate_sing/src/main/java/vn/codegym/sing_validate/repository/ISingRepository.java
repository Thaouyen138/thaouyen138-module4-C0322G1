package vn.codegym.sing_validate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.sing_validate.model.Sing;

public interface ISingRepository extends JpaRepository<Sing, Integer> {
}
