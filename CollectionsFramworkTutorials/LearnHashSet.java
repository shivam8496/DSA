package com.CollectionsFramworkTutorials;

import java.util.Set;

import java.util.HashSet;
import java.util.TreeSet;
public class LearnHashSet {
    public static void main(String[] args) {

    Set<Integer> set=new HashSet<>();
    Set<Integer> tree=new TreeSet<>();
    set.add(1);
    set.add(3);
    set.add(10);
    set.add(441);
    set.add(0);
    System.out.println(set);
        tree.add(1);
        tree.add(3);
        tree.add(10);
        tree.add(441);
        tree.add(0);
    System.out.println(tree);
    }


}
