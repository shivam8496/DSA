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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
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


    public static  void BFS(List<Edge> [] graph,boolean [] visited , int start)
    {
     Queue<Integer> q=new LinkedList<>();

     q.add(start);
        while (!q.isEmpty()) {
            int curr=q.remove();
            if(visited[curr]==false)
            {
                System.out.print(curr);
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String [] args){
        int V=7;
        List<Edge> [] graph=new ArrayList[V];
        createGraph(graph);
//        createWeightedGraph(graph);
//        printAllNeighbours(graph);

        boolean [] visited = new boolean[graph.length];
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false)
            {
                BFS(graph,visited,i);
            }
        }

    }

}
