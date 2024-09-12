package com.Graphs.BridgeFinding;

import java.util.*;

public class TarjanAlgo {

    public static class Edge{
        int src;
        int dest;

        public Edge(int source,int destination){
            this.src=source;
            this.dest=destination;
        }
    }

    public static void createGraph(List<List<Edge>> graph,int V){
        for(int i=0;i<=V;i++){
            graph.add(new ArrayList<>());
        }


        graph.get(0).add(new Edge(0,1));
        graph.get(0).add(new Edge(0,2));
        graph.get(0).add(new Edge(0,3));

        graph.get(1).add(new Edge(1,2));
        graph.get(1).add(new Edge(1,0));

        graph.get(2).add(new Edge(2,1));
        graph.get(2).add(new Edge(2,0));

        graph.get(3).add(new Edge(3,4));
        graph.get(3).add(new Edge(3,5));

        graph.get(4).add(new Edge(4,3));
        graph.get(4).add(new Edge(4,5));

        graph.get(5).add(new Edge(5,3));
        graph.get(5).add(new Edge(5,4));

    }


    public static void TarjanAlgo(List<List<Edge>> graph,int curr,int parent,int time ,int [] dt,int [] low,boolean [] visited ){
        dt[curr]=low[curr]=time++;
        visited[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++){
            Edge e=graph.get(curr).get(i);
            if(e.dest==parent) continue;
            if(!visited[e.dest]){
                TarjanAlgo(graph,e.dest,curr,time,dt,low,visited);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.println(curr+" "+ e.dest);
                }
            }
            if(visited[e.dest]){
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }

        }

    }

    public static void main (String [] args){
        int V=5;
        List<List<Edge>> graph = new ArrayList<>();
        createGraph(graph,V);
        int [] dt=new int[V+1];
        int [] low=new int[V+1];
//        Arrays.fill(dt,0);
//        Arrays.fill(low,0);
        boolean [] visited=new boolean[V + 1];
        int time =0;
        for(int i=0;i<=V;i++) {
            if(!visited[i])
            TarjanAlgo(graph, i, -1, time,dt, low,visited );
        }
    }
}
