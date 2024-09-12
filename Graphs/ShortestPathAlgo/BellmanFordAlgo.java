package com.Graphs.ShortestPathAlgo;

import java.util.*;

public class BellmanFordAlgo {


    public static  class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int source,int destination)
        {
            this.src=source;
            this.dest=destination;
        }

        public Edge(int source,int destination,int weight)
        {
            this.src=source;
            this.dest=destination;
            this.wt=weight;
        }
    }

    public static void createGraph(List<List<Edge>> graph,int V)
    {
        for(int i=0;i<=V;i++)
        {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0,1,2));
        graph.get(0).add(new Edge(0,2,4));

        graph.get(1).add(new Edge(1,2,-4));

        graph.get(2).add(new Edge(2,3,2));

        graph.get(3).add(new Edge(3,4,4));

        graph.get(3).add(new Edge(4,1,-1));
        
    }

    public static int[] bellmanFord(List<List<Edge>> graph,int V,int s)
    {
        int [] dist=new int[graph.size()] ;
        Arrays.fill(dist,Integer.MAX_VALUE);
         dist[s]=0;
         for(int k=0;k<V-1;k++) {
             for (int i = 0; i < V; i++) {
                 for (int j = 0; j < graph.get(i).size(); j++) {
                     Edge e = graph.get(i).get(j);
                     int u = e.src;
                     int v = e.dest;
                     int wt = e.wt;
                     if ((dist[u] + wt) < dist[v] && dist[u] != Integer.MAX_VALUE) {
                         dist[v] = dist[u] + wt;
                     }
                 }

             }
         }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                Edge e = graph.get(i).get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if ((dist[u] + wt) < dist[v] && dist[u] != Integer.MAX_VALUE) {
                   return new int[]{-1};
                }
            }

        }


        return dist;

    }
    public static void main(String [] args)
    {
        int V=4;
        List<List<Edge>> graph= new ArrayList<>();
        createGraph(graph,V);
        System.out.println(Arrays.toString(bellmanFord(graph,V,0)));

    }
}
