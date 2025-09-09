package designpatterns.prototype;

import java.util.Map;
import java.util.HashMap;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<String, Student>();
    public void register(String key,Student student){
        map.put(key, student);
    }
    public Student get(String key){
        return map.get(key);
    }
}
