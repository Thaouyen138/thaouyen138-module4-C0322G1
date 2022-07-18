package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private static final Map<Integer, Customer> customerMap = new HashMap<>();

    static {
        customerMap.put(1, new Customer(1, "Hảo", "hao@codegym.vn", "nam định"));
        customerMap.put(2, new Customer(2, "uyên", "uyen@codegym.vn", "Danang"));
        customerMap.put(3, new Customer(3, "trung", "trung@codegym.vn", "quảng nam"));
        customerMap.put(4, new Customer(4, "hoàng", "hoang@codegym.vn", "đà nẵng"));
        customerMap.put(5, new Customer(5, "toàn", "toan@codegym.vn", "quảng nam"));
        customerMap.put(6, new Customer(6, "cường", "cuong@codegym.vn", "quảng bình"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void create(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }

    @Override
    public void delete(int id) {
        customerMap.remove(id);
    }
}
