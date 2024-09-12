package com.Graphs;

import java.util.*;

public class directedGraph {

    static class Edge{
        int src=-1;
        int dest=-1;
        int wt=-2;
        Edge(int source,int destination)
        {
            this.src=source;
            this.dest=destination;
        }
        Edge(int source,int destination,int weight)
        {
            this.src=source;
            this.dest=destination;
            this.wt=weight;
        }
        Edge(int source)
        {
            this.src=source;

        }
    }

    public static void createGraph(List<List<Edge>> graph,int V)
    {
        for(int i=0;i<=V;i++)
        {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0,2));
        graph.get(1).add(new Edge(1,0));
        graph.get(2).add(new Edge(2,3));
        graph.get(3).add(new Edge(3,0));
    }


    public static void createUndirectedGraph(List<List<Edge>> graph ,int V){
        for(int i=0;i<=V;i++)
        {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0,1));
        graph.get(0).add(new Edge(0,4));

        graph.get(1).add(new Edge(1,0));

        graph.get(1).add(new Edge(1,2));

        graph.get(2).add(new Edge(2,1));
        graph.get(2).add(new Edge(2,3));

        graph.get(3).add(new Edge(3,2));

        graph.get(4).add(new Edge(4,0));

        graph.get(4).add(new Edge(4,5));

        graph.get(4).add(new Edge(4,5));

    }

    public static boolean detectUndirectedCycle(List<List<Edge>> graph,int curr ,int prev,boolean [] visited )
    {
        visited[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++)
        {
            Edge e=graph.get(curr).get(i);
            if(visited[e.dest] && e.dest!=prev) return true;
            else if(!visited[e.dest] ) {
                if(detectUndirectedCycle(graph,e.dest,curr,visited)==true) return true;
                if(detectUndirectedCycle(graph,e.dest,curr,visited)==false) return false;

            }
        }
      return false;

    }

    public static boolean cycleDetection(List<List<Edge>> graph,int src,boolean [] visited,boolean [] stack)
    {
        visited[src]=true;
        stack[src]=true;
        for(int i=0;i<graph.get(src).size();i++)
        {
            Edge e=graph.get(src).get(i);

            if(stack[e.dest]==true) return true;
            else if(visited[e.dest]==false)
                if(cycleDetection(graph,e.dest,visited,stack))
                    return true;

        }
        stack[src]=false;
      return false;

    }
    public static void main(String [] args){
         int V=5;
        List<List<Edge>> graph=new ArrayList<>();


    }
}
