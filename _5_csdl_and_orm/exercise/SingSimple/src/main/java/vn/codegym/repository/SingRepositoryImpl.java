package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Sing;

import java.util.List;
@Repository
public class SingRepositoryImpl implements ISingRepository {
    @Override
    public List<Sing> findAll() {
        return null;
    }
}
