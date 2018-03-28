package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeB {
   static List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> sameElements =new ArrayList();

        for (int i = 0; i <collection2.size() ; i++) {
            List<String> l =collection2.get(i);
            for (int j = 0; j < collection1.size(); j++) {
              if(l.contains(collection1.get(j))){
                  boolean add = sameElements.add(collection1.get(j));
              }
          }
        }

        return sameElements;
    }
        /*public static void main(String[] args) {
            List<String> collection1 = Arrays.asList("a", "e", "h", "t", "f", "c", "g", "b", "d");
            List<String> list = Arrays.asList("a", "d", "e", "f");
            List<List<String>> collection2 = Arrays.asList(list);

        System.out.println(collectSameElements(collection1,collection2));

    }*/
}
