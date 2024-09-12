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
    public static void createGraph(List<List<Edge>> graph,int V)
    {
        for(int i=0;i<=V;i++)
        {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(0,1));
        graph.get(0).add(new Edge(0,2));

        graph.get(1).add(new Edge(1,0));
        graph.get(1).add(new Edge(1,3));

        graph.get(2).add(new Edge(2,0));
        graph.get(2).add(new Edge(2,4));

        graph.get(3).add(new Edge(3,1));
        graph.get(3).add(new Edge(3,4));
        graph.get(3).add(new Edge(3,5));

        graph.get(4).add(new Edge(4,2));
        graph.get(4).add(new Edge(4,3));
        graph.get(4).add(new Edge(4,5));

        graph.get(5).add(new Edge(5,3));
        graph.get(5).add(new Edge(5,4));
        graph.get(5).add(new Edge(5,6));
    }
//    public static void createWeightedGraph(List<List<Edge>> graph)
//    {
//        for(int i=0;i<graph.length;i++)
//        {
//            graph[i]=new ArrayList<>();
//        }
//        graph[0].add(new Edge(0,2,2));
//
//        graph[1].add(new Edge(1,2,10));
//        graph[1].add(new Edge(1,3,0));
//
//        graph[2].add(new Edge(2,0,2));
//        graph[2].add(new Edge(2,3,-1));
//        graph[2].add(new Edge(2,1,10));
//
//        graph[3].add(new Edge(3,1,0));
//        graph[3].add(new Edge(3,2,-1));
//    }

    public static void printAllNeighbours(List<List<Edge>> graph)
    {
        for(int i=0;i<graph.size();i++)
        {
            for(int j=0;j<graph.get(i).size();j++)
            {
                Edge e=graph.get(i).get(j);
                if(e.wt==-10)
                {
                    if(j==graph.get(i).size()-1)
                    {
                        System.out.print(e.src+" Neighbour ==>"+e.dest+" ");
                    }
                    else {
                        System.out.print(e.src+" Neighbour ==>"+e.dest+" , ");
                    }
                }

                else
                {
                    if(j==graph.get(i).size()-1)
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


    public static  void BFS(List<List<Edge>>  graph,boolean [] visited , int start)
    {
     Queue<Integer> q=new LinkedList<>();

     q.add(start);
        while (!q.isEmpty()) {
            int curr=q.remove();
            if(visited[curr]==false)
            {
                System.out.print(curr);
                visited[curr]=true;
                for(int i=0;i<graph.get(curr).size();i++)
                {
                    Edge e=graph.get(curr).get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(List<List<Edge>> graph,int curr, boolean [] visited)
    {
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++)
        {
            Edge e=graph.get(curr).get(i);
            if(visited[e.dest]==false){
                DFS(graph,e.dest,visited);
            }
        }
    }


    public static List<List<Integer>> find_all_paths(List<List<Edge>> graph,int curr,int target,List<Integer> paths,List<List<Integer>> ans , boolean [] visited)
    {
       if(curr==target)
       {
           paths.add(target);
           ans.add(new ArrayList<>(paths));
          return ans;
       }
       for(int i=0;i<graph.get(curr).size();i++)
        {
         Edge e=graph.get(curr).get(i);
         visited[curr]=true;
         paths.add(curr);
         if(visited[e.dest]==false) find_all_paths(graph,e.dest,target,paths, ans, visited);
         paths.remove(paths.size()-1);
         visited[curr]=false;
        }

      return ans;

    }
    public static void main(String [] args){
        int V=7;
        List<List<Edge>> graph=new ArrayList<>();
        createGraph(graph,V);
//        createWeightedGraph(graph);
//        printAllNeighbours(graph);

        boolean [] visited = new boolean[graph.size()];
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false)
            {
                BFS(graph,visited,i);
            }
        }

         List<Integer> paths=new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
        find_all_paths(graph,0,5,paths,ans,visited);
        System.out.println(ans);
    }

}
