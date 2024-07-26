package com.Graphs;
import java.util.*;
public class graphsArrays {
    static int [][] graph={ {0,2} , {1,0} , {2,3} , {3,0} };
    public static void main(String []  args)
    {
      int V=graph.length;
      boolean [] visited=new boolean[V];
        System.out.println(cycleCheck(graph,1,visited,new ArrayList<>()));
    }
    public static boolean cycleCheck(int [][] graph,int curr,boolean [] visited,List<Boolean> stack)
    {
        visited[curr]=true;
        stack.add(true);
        for(int i=0;i<graph[curr].length;i++)
        {
            if(stack.get(i)==true) return true;    //Base Case
            else if(visited[curr]==false) cycleCheck(graph,graph[curr][i],visited,stack);
            stack.remove(stack.size()-1);
        }
     return false;
    }


}
