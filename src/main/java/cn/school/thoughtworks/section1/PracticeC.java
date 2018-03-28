package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    static  List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> sameElements =new ArrayList();
        List getList=  collection2.get("value");

        for (int j = 0; j < collection1.size(); j++) {
            if(getList.contains(collection1.get(j))){
                sameElements.add(collection1.get(j));
            }
        }
        return sameElements;
    }

    /*public static void main(String[] args) {
        List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
        List<String> list = Arrays.asList("a", "d", "e", "f");
        HashMap<String, List<String>> collection2 = new HashMap();
        collection2.put("value",list);
        System.out.println( collectSameElements(collection1,collection2));
    }*/
}
