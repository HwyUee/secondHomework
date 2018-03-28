package cn.school.thoughtworks.section2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


public class PracticeB {
    public static  Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> mp =new LinkedHashMap<String, Integer>();
        int num =0;
        for (int i = 0; i <collection1.size() ; i++) {
            String[] sr2=collection1.get(i).split("-");
            if (sr2.length==1){
                num=1;
            }
            else{
                num =Integer.parseInt(sr2[1]);
            }
            if (mp.containsKey(sr2[0])){
                mp.put(sr2[0],mp.get(sr2[0])+num);
            }
            else {
                mp.put(sr2[0],num);
            }
        }
        return  mp;
    }

   /* public static void main(String[] args) {
        List<String> collection1 = Arrays.asList(
                "a", "a", "a",
                "e", "e", "e", "e", "e", "e", "e",
                "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h",
                "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t", "t",
                "f", "f", "f", "f", "f", "f", "f", "f", "f",
                "c", "c", "c", "c", "c", "c", "c", "c",
                "g", "g", "g", "g", "g", "g", "g",
                "b", "b", "b", "b", "b", "b",
                "d-5"
        );
        System.out.println(countSameElements(collection1));
    }*/
}
