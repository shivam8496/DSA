package com.DisjointSet;

import java.util.*;

public class DisjointSet {

    public static class Disjoint{
        List<Integer> rank=new ArrayList<>();
        List<Integer> parent=new ArrayList<>();
        List<Integer> size=new ArrayList<>();

        public Disjoint(int n){
            for(int i=0;i<=n;i++){
                this.rank.add(0);
                this.size.add(1);
                this.parent.add(i);
            }
        }

        public  int findUParent(int node){
            if(node==parent.get(node)){
                return node;
            }

            int ultimateParent=findUParent(parent.get(node));
            parent.set(node,ultimateParent);

            return parent.get(node);
        }

        public void setUniounbySize(int u,int v){
            int parentU=findUParent(u);
            int parentV=findUParent(v);
            if(parentU==parentV) return ;
            if(size.get(parentU)<size.get(parentV))
            {
                parent.set(parentU,parentV);
                size.set(size.get(parentU),size.get(parentU)+size.get(parentV));
            }
            else
            {
                parent.set(parentV,parentU);
                size.set(size.get(parentV),size.get(parentU)+size.get(parentV));
            }

        }

        public  void setUnioun(int u,int v){
            int uParentU=findUParent(u);
            int uParentV=findUParent(v);

            if(uParentV == uParentU) return;

            else if(rank.get(u)>rank.get(v)){
                parent.set(uParentV,uParentU);
            }

            else if(rank.get(u)<rank.get(v)){
                parent.set(uParentU,uParentV);
            }

            else{
                parent.set(uParentV,uParentU);
                rank.set(uParentU,rank.get(uParentU)+1);
            }
        }
    }






    public static void main(String [] args){
         Disjoint set=new Disjoint(7);
         set.setUnioun(1,2);
        set.setUnioun(2,3);
        set.setUnioun(4,5);
        set.setUnioun(6,7);
        set.setUnioun(5,6);


        Disjoint set2=new Disjoint(7);
        set2.setUniounbySize(1,2);
        set2.setUniounbySize(2,3);
        set2.setUniounbySize(4,5);
        set2.setUniounbySize(6,7);
        set2.setUniounbySize(5,6);
//
//
//        if(set.findUParent(3)==set.findUParent(7)){
//            System.out.println("Same UltimateParent");
//        }
//        else{
//            System.out.println("Not Same");
//        }
//
//        set.setUnioun(3,7);
//        if(set.findUParent(3)==set.findUParent(7)){
//            System.out.println("Same UltimateParent");
//        }
//        else{
//            System.out.println("Not Same");
//        }
//
        if(set2.findUParent(3)==set2.findUParent(7)){
            System.out.println("Same UltimateParent");
        }
        else{
            System.out.println("Not Same");
        }

        set2.setUnioun(3,7);
        if(set2.findUParent(3)==set2.findUParent(7)){
            System.out.println("Same UltimateParent");
        }
        else{
            System.out.println("Not Same");
        }

    }
}
