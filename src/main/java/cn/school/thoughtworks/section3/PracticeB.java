package cn.school.thoughtworks.section3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> m =new LinkedHashMap();
        List<String> l = object.get("value");
        for (int i = 0; i <l.size() ; i++) {

            if(collectionA.containsKey(l.get(i))){
                int count=collectionA.get(l.get(i));
                collectionA.put(l.get(i),count-count/3);
            }
        }
        m=collectionA;
        return m;

    }
}
