package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    public static Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map <String,Integer> sameElements =new LinkedHashMap<String, Integer>();

        for (int i = 0; i <collection1.size() ; i++) {

            if (sameElements.containsKey(collection1.get(i))){
                sameElements.put(collection1.get(i),sameElements.get(collection1.get(i))+1);
            }
            else {
                sameElements.put(collection1.get(i),1);
            }
        }
        return sameElements;
    }

/*    public static void main(String[] args) {
        List<String> collection1 = Arrays.asList(
                "a", "a", "a",
                "e", "e", "e", "e", "e", "e", "e",
                "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h",
                "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t",
                "f", "f", "f", "f", "f", "f", "f", "f", "f",
                "c", "c", "c", "c", "c", "c", "c", "c",
                "g", "g", "g", "g", "g", "g", "g",
                "b", "b", "b", "b", "b", "b",
                "d", "d", "d", "d", "d"
        )；
        System.out.println(countSameElements(collection1));
    }*/
}
