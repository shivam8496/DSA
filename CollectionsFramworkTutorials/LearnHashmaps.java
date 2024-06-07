package com.CollectionsFramworkTutorials;
import java.util.Map;
import java.util.HashMap;
public class LearnHashmaps {
    public static void main(String[] args) {
        Map<String,Integer> hm= new HashMap<>();
        hm.put("one",1);
        hm.put("two",2);
        hm.put("Three",3);
        hm.put("four",4);
        hm.put("five",5);
        hm.remove("two");
        System.out.println(hm);
        for(Map.Entry<String,Integer> hm2 : hm.entrySet())
        {
            System.out.println(hm2.getValue());
        }


    }


}
