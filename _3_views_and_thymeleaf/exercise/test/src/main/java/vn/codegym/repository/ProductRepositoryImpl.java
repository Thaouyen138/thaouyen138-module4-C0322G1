package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    static Map<Integer, Product> productMap = new LinkedHashMap<>();

    static {
        productMap.put(1, new Product("1", "nokia X8", "20000", "new", "nokia"));
        productMap.put(2, new Product("2", "samsung galaxy note 8", "20000", "old", "samsung"));
        productMap.put(3, new Product("3", "iphone 11", "30000", "99%", "apple"));
        productMap.put(4, new Product("4", "iphone 13 pro max", "40000", "new", "apple"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> findByField(String name) {
        return new ArrayList<>(productMap.values());
    }
}
