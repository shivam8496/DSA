package com.Graphs;

import java.util.*;

public class Graphs {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int Source,int destination)
        {
            this.src=Source;
            this.dest=destination;
            this.wt=-10;
        }
        Edge(int Source,int destination,int weight)
        {
            this.src=Source;
            this.dest=destination;
            this.wt=weight;
        }
    }
    public static void createGraph(List<Edge> [] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,1));
    }
    public static void createWeightedGraph(List<Edge> [] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,3,-1));
        graph[2].add(new Edge(2,1,10));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    public static void printAllNeighbours(List<Edge> [] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                if(e.wt==-10)
                {
                    if(j==graph[i].size()-1)
                    {
                        System.out.print(e.src+" Neighbour ==>"+e.dest+" ");
                    }
                    else {
                        System.out.print(e.src+" Neighbour ==>"+e.dest+" , ");
                    }
                }

                else
                {
                    if(j==graph[i].size()-1)
                    {
                        System.out.print(e.src+" Neighbour ==>"+e.dest+" Weight==> "+e.wt+" ");
                    }
                    else {
                        System.out.print(e.src+" Neighbour ==>"+e.dest+" Weight==> "+e.wt+" , ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int V=4;
        List<Edge> [] graph=new ArrayList[V];
//        createGraph(graph);
        createWeightedGraph(graph);
        printAllNeighbours(graph);
    }

}
