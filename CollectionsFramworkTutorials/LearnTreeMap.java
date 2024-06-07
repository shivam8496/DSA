package com.CollectionsFramworkTutorials;
import java.util.*;
public class LearnTreeMap {
    public static void main(String[] args) {

        Map<Integer,String> tMap = new TreeMap<>();

        tMap.put(1,"one");
        tMap.put(4,"four");
        tMap.put(2,"two");
        tMap.put(3,"Three");

        tMap.put(5,"five");
        tMap.remove(3);

        System.out.println(tMap.size());
        System.out.println(tMap);
       for(Map.Entry<Integer,String> e:tMap.entrySet())
       {
           System.out.println(e.getValue());
       }

    }
}
