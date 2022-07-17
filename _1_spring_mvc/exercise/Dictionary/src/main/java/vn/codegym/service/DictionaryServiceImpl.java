package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.repository.IDictionaryRepository;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Autowired
   private IDictionaryRepository iDictionaryRepository;
    @Override
    public String dictionary(String word) {
        return iDictionaryRepository.dictionary(word);
    }
}
