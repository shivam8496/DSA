package com.shivam;
import java.util.*;
public class test {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();


        adj.add(List.of(1, 3, 4));
        adj.add(List.of(4, 5, 6));
        adj.add(List.of(7, 8, 9));
        for (int i = 0; i < adj.size(); i++){
            for (Integer it : adj.get(i)) {
                System.out.print(it);
            }
            System.out.println();
    }

    }




    }

