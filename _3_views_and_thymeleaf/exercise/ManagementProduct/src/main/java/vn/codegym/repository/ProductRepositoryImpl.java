package vn.codegym.repository;

import vn.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    static Map<Integer, Product> productList = new LinkedHashMap<>();

    static {
        productList.put(1, new Product("1", "iphone11", "2323", "new", "apple"));
        productList.put(2, new Product("2", "samsung galaxy note 10", "2323", "new", "samsung"));
        productList.put(3, new Product("3", "nokia x8", "2323", "new", "nokia"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void create(Product product) {
        productList.put(Integer.parseInt(product.getId()), product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void delete(int id) {
        productList.remove(id);
    }
}
