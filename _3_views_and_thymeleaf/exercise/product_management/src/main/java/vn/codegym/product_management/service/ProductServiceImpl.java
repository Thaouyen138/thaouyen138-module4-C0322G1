package vn.codegym.product_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.product_management.model.Product;
import vn.codegym.product_management.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void create(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(String id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void delete(String id) {
        iProductRepository.deleteById(id);
    }
}
