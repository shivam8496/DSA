package com.Graphs;

import java.util.*;

public class directedGraph {

    static class Edge{
        int src;
        int dest;

        Edge(int source,int destination)
        {
            this.src=source;
            this.dest=destination;
        }
    }

    public static void createGraph(List<Edge> [] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }

    public static boolean cycleDetection(List<Edge> [] graph,int src,boolean [] visited,List<Boolean> stack)
    {
        visited[src]=true;
        stack.add(true);
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);

            if(stack.get(e.dest)==true) return true;
            else if(visited[e.dest]==false) cycleDetection(graph,e.dest,visited,stack);
            stack.remove(stack.size()-1);
        }
      return false;

    }
    public static void main(String [] args){
         int V=4;
        List<Edge> [] graph=new ArrayList[V];
      boolean [] visited=new boolean[V];
      createGraph(graph);
   System.out.println(cycleDetection(graph,1,visited,new ArrayList<>()));
    }
}
