package vn.codegym.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.cart.model.Product;
import vn.codegym.cart.repository.IProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findALl(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void create(Product product) {
        iProductRepository.save(product);
    }
}
