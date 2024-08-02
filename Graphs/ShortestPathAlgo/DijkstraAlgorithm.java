package com.Graphs.ShortestPathAlgo;

import java.util.*;

public class DijkstraAlgorithm {
    static class Edge {
        int src ;
        int dest ;
        int wt ;

        Edge(int source, int destination) {
            this.src = source;
            this.dest = destination;
        }

        Edge(int source, int destination, int weight) {
            this.src = source;
            this.dest = destination;
            this.wt = weight;
        }

        Edge(int source) {
            this.src = source;

        }
    }


    static List<List<Edge>> graph;

    static class Pairs implements Comparable<Pairs> {
        int Node;
        int wt;

        public Pairs(int value, int Weight) {
            this.Node = value;
            this.wt = Weight;
        }

        @Override
        public int compareTo(Pairs p2) {
            return this.wt - p2.wt;
        }

    }

    public static void createWeightedGraph(List<List<Edge>> graph, int V) {
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(0).add(new Edge(0, 2, 4));

        graph.get(1).add(new Edge(1, 2, 1));
        graph.get(1).add(new Edge(1, 3, 7));

        graph.get(2).add(new Edge(2, 4, 3));

        graph.get(3).add(new Edge(3, 5, 1));

        graph.get(4).add(new Edge(4, 3, 2));
        graph.get(4).add(new Edge(4, 5, 5));

        

    }

    public static int [] DikstraAlgo(List<List<Edge>> graph)
    {
      Queue<Pairs> pq = new PriorityQueue<>();
      int [] dist= new int[graph.size()];
      Arrays.fill(dist,Integer.MAX_VALUE);
      dist[0]=0;
      boolean [] visited= new boolean[graph.size()+1];
      pq.offer(new Pairs(graph.get(0).get(0).src,0));

      while(!pq.isEmpty())
      {
          Pairs curr=pq.poll();
          if(!visited[curr.Node])
          {
            for(int i=0;i<graph.get(curr.Node).size();i++)                   //Find Neighbours
            {
                Edge e=graph.get(curr.Node).get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                if(dist[u]+wt<dist[v])
                {
                    dist[v]=dist[u]+wt;
                    pq.offer(new Pairs(v,dist[v]));
                }

            }

          }
      }

      return dist;
    }


    public static void main(String [] args){
         graph=new ArrayList<>();
         createWeightedGraph(graph,5);
         System.out.println(Arrays.toString(DikstraAlgo(graph)));

    }

}
