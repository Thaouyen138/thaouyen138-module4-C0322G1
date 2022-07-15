package vn.codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;
@Repository
public class DictionaryRepositoryImpl implements  IDictionaryRepository{
    static Map<String,String> dic= new LinkedHashMap<>();
    static {
        dic.put("xin chào", "hello");
        dic.put("tạm biệt", "goodbye");
        dic.put("cảm ơn", "thanks");
    }

    @Override
    public Map<String, String> dictionary() {
        return dic;
    }
}
