package com.Graphs.ShortestPathAlgo;

import java.util.*;

public class MinimumSpanningTree {

    public static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int source,int destination,int weight)
        {
            this.src=source;
            this.dest=destination;
            this.wt=weight;
        }
        Edge(int source,int destination)
        {
            this.src=source;
            this.dest=destination;
        }
    }

    public static void  createGraph(List<List<Edge>> graph,int V){
        for(int i=0;i<=V;i++)
        {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0,1,10));
        graph.get(0).add(new Edge(0,2,15));
        graph.get(0).add(new Edge(0,3,30));

        graph.get(1).add(new Edge(1,0,10));
        graph.get(1).add(new Edge(1,3,40));

        graph.get(2).add(new Edge(2,0,15));
        graph.get(2).add(new Edge(2,3,50));

        graph.get(3).add(new Edge(3,1,40));
        graph.get(3).add(new Edge(3,2,50));

    }

    public static class  Pair implements Comparable<Pair>{
        int Node;
        int src;
        int wt;

        Pair(int source,int node,int weight)
        {
            this.Node=node;
            this.src=source;
            this.wt=weight;
        }

        @Override
        public int compareTo(Pair p2){
            return this.wt-p2.wt;
        }
    }

    public static List<List<Integer>>  primsAlgo(List<List<Edge>> graph,int V ){
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        List<List<Integer>> MST=new ArrayList<>();
        boolean [] visited = new boolean[V];

        pq.add(new Pair(0,0,-1));
        int cost=0;
         while(!pq.isEmpty())
         {
             Pair curr=pq.poll();
             if(!visited[curr.Node] ) {
                 visited[curr.Node]=true;
                 cost+=curr.wt;
                 if(curr.wt!=-1) MST.add(new ArrayList<>(List.of(curr.src,curr.Node)));
                 for (int i = 0; i <graph.get(curr.Node).size() ; i++) {
                     Edge e=graph.get(curr.Node).get(i);
                     if(!visited[e.dest])
                     {
                         pq.add(new Pair(e.src,e.dest,e.wt));
                     }
                 }
             }
         }

        return MST;
    }





    public static void main(String [] args)
    {
        int V=4;
        List<List<Edge>> graph = new ArrayList<>();
        createGraph(graph,V);
        List<int []> edges =new ArrayList<>();
        System.out.println(primsAlgo(graph,V));


    }
}
