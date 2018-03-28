package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeA {
    static  List<String>  collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> sameElements =new ArrayList();

            for (int j = 0; j < collection1.size(); j++) {
                if(collection2.contains(collection1.get(j))){
                    sameElements.add(collection1.get(j));
                }
            }
        return sameElements;
    }

    /*public static void main(String[] args) {
        List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
        List<String> collection2 = Arrays.asList("a", "d", "e", "f");

        System.out.println( collectSameElements(collection1,collection2));

    }*/
}
