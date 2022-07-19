package vn.codegym.service;

import vn.codegym.model.Product;
import vn.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void create(Product product) {
        iProductRepository.create(product);
    }

    @Override
    public Product findById(String id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void update( Product product) {
        iProductRepository.update( product);
    }

    @Override
    public void delete(String id) {
        iProductRepository.delete(id);
    }
}
