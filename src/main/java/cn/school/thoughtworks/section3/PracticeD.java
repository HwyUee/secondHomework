package cn.school.thoughtworks.section3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import cn.school.thoughtworks.section2.PracticeB;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> ma =new LinkedHashMap();
        List<String> l3 =object.get("value");
        ma=PracticeB.countSameElements(collectionA);
        for (int i = 0; i <l3.size() ; i++) {

            if(ma.containsKey(l3.get(i))){
                int count= ma.get(l3.get(i));
                ma.put(l3.get(i),count-count/3);
            }
        }
        return ma;
    }
}
