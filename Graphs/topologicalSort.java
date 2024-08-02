package com.Graphs;

import java.util.*;

public class topologicalSort {
    public static class Edge{
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



    public static void createDAG(List<List<Edge>> graph, int V)
    {
        for(int i=0;i<=V;i++)
        {
            graph.add(new ArrayList<>());
        }
//        graph.get(0).add(new Edge(0,0));
//        graph.get(1).add(new Edge(1,1));
        graph.get(2).add(new Edge(2,3));
        graph.get(3).add(new Edge(3,1));
        graph.get(4).add(new Edge(4,1));
        graph.get(4).add(new Edge(4,0));
        graph.get(5).add(new Edge(5,0));
        graph.get(5).add(new Edge(5,2));

    }


    public static List<Integer> topoSort(List<List<Edge>> graph, Stack<Integer> stack)
    {
        boolean [] visited=new boolean[graph.size()];

        for(int i=0;i<graph.size();i++)
        {
            if(!visited[i])
            {
                topoSort(graph,stack,i,visited);
            }
        }

        List<Integer> li=new ArrayList<>();
        while(!stack.empty())
        {
            li.add(stack.pop());
        }
        return li;
    }

    public static void topoSort(List<List<Edge>>graph , Stack<Integer> stack, int curr, boolean [] visited)
    {
        visited[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++)
        {
            Edge e=graph.get(curr).get(i);
            if(!visited[e.dest]) topoSort(graph,stack,e.dest,visited);
        }
        stack.push(curr);
    }

    public static List<Integer> topoSortInv(List<List<Edge>> graph, Stack<Integer> stack)
    {
        boolean [] visited=new boolean[graph.size()];

        for(int i=0;i<graph.size();i++)
        {
            if(!visited[i])
            {
                topoSort(graph,stack,i,visited);
            }
        }

        Stack<Integer> st=new Stack<>();
        while(!stack.isEmpty())
        {
            st.push(stack.pop());
        }
        List<Integer> li=new ArrayList<>();
        while(!st.isEmpty())
        {
            li.add(st.pop());
        }
        return li;
    }

    static List<List<Edge>> graph;

    public static void main(String [] args){

        int V=5;
        graph = new ArrayList<>();
        createDAG(graph,V);
        System.out.println(topoSort(graph,new Stack<>()));
        System.out.println(topoSortInv(graph,new Stack<>()));
    }
}
