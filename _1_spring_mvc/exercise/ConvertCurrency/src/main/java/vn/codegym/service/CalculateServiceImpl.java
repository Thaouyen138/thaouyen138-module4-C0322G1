package vn.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements ICalculateService {
    @Override
    public Double convertCurrentcy(Double input) {
        return input * 23000;
    }
}
