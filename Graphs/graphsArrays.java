package com.Graphs;
import java.util.*;
public class graphsArrays {
    static int [][] graph={ {0,2} , {1,0} , {2,3} ,{3,0} };
    public static void main(String []  args)
    {
      int V=graph.length;
      boolean [] visited=new boolean[V];
        boolean [] stack=new boolean[V];
        System.out.println(cycleCheck(graph,1,visited,stack));
    }
    public static boolean cycleCheck(int [][] graph,int curr,boolean [] visited,boolean [] stack)
    {
        visited[curr]=true;
        stack[curr]=true;
        for(int [] edge:graph)
        {
                if (stack[edge[1]] == true) return true;    //Base Case
                else if (visited[edge[1]] == false) {
                    if (cycleCheck(graph, edge[1], visited, stack)) return true;
                }

        }
        stack[curr]=false;
     return false;
    }


}
