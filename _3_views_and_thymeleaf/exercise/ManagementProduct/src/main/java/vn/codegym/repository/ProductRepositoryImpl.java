package vn.codegym.repository;

import vn.codegym.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {


    @Override
    public List<Product> findAll() {
        String select = "select p from product p";
        List<Product> productList = BaseRepository.entityManager.createQuery(select, Product.class).getResultList();
        return productList;
    }

    @Override
    public void create(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(String id) {
        String select = "select p from product p where p.id = ?1 ";
        Product product = BaseRepository.entityManager.createQuery(select, Product.class).setParameter(1, id).getSingleResult();
        return product;
    }

    @Override
    public void update(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void delete(String id) {
        Product product = findById(id);
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }
}
