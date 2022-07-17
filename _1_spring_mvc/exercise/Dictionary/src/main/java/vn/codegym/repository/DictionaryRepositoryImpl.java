package vn.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
@Repository
public class DictionaryRepositoryImpl implements  IDictionaryRepository{
    static Map<String,String> dic= new LinkedHashMap<>();
    static {
        dic.put("hello","xin chào");
        dic.put( "goodbye","tạm biệt");
        dic.put( "thanks","cảm ơn");
    }


    @Override
    public String dictionary(String word) {
        return dic.get(word);
    }
}
