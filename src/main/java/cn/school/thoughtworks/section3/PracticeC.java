package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String,Integer> m =new LinkedHashMap();
        m=PracticeA.countSameElements(collectionA);
        List<String> l = object.get("value");
        for (int i = 0; i <l.size() ; i++) {

            if(m.containsKey(l.get(i))){
                int count=m.get(l.get(i));
                m.put(l.get(i),count-count/3);
            }
        }
        return m;
    }
}
