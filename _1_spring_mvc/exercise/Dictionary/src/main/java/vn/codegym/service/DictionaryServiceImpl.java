package vn.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Override
    public String dictionary(String mean, String input) {
        if (input.equals(mean)){
        }return mean;
    }
}
