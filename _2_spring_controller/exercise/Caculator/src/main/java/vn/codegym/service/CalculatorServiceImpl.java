package vn.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public double cal(String calculator, double num1, double num2) {
        double result = 0;
        switch (calculator) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
