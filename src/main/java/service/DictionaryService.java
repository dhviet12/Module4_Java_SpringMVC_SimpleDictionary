package service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService {
    private static Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("hello","xin chao");
        dictionary.put("student","hoc sinh");
        dictionary.put("car","xe hoi");
        dictionary.put("mobile","dien thoai di dong");
        dictionary.put("tree","cai cay");
        dictionary.put("dog","con cho");
        dictionary.put("class","lop hoc");
    }
    public String translate(String key){
        return dictionary.get(key);
    }
}
