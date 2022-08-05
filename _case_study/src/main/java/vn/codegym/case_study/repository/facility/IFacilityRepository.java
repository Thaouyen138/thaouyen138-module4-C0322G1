package vn.codegym.case_study.repository.facility;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.case_study.model.facility.Facility;

public interface IFacilityRepository extends JpaRepository<Facility,String> {

    @Query(value = "select * from facility where status_delete=0 and id like:id and name like :name", nativeQuery = true)
    public Page<Facility> findByField(@Param("id") String id,@Param("name") String name, Pageable pageable);

}
