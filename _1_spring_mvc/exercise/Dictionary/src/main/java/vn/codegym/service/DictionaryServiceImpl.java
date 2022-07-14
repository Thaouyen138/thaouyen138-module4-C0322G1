package vn.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Override
    public String dictionary(String input) {
        return input;
    }
}
