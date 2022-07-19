package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Sing;

import javax.persistence.EntityTransaction;
import java.util.List;
@Repository
public class SingRepositoryImpl implements ISingRepository {
    @Override
    public List<Sing> findAll() {
        String select = "select s from sing s where status_delete=0";
        List<Sing> sings = BaseRepository.entityManager.createQuery(select, Sing.class).getResultList();
        return sings;
    }

    @Override
    public void create(Sing sing) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(sing);
        entityTransaction.commit();
    }

    @Override
    public Sing findById(Integer id) {
        String select = "select s from sing s where s.id = ?1 ";
        Sing sing = BaseRepository.entityManager.createQuery(select, Sing.class).setParameter(1, id).getSingleResult();
        return sing;
    }

    @Override
    public void update(Sing sing) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(sing);
        entityTransaction.commit();
    }

    @Override
    public void delete(Integer id) {
        Sing sing = findById(id);
        sing.setStatusDelete(1);
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(sing);
        entityTransaction.commit();
    }
}
