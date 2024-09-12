package com.Graphs.StronglyConnectedComponents;
import com.Graphs.topologicalSort;

import java.util.*;

public class KosarajuAlgorithm {

    private static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    public static void  createGraph(List<List<Edge>> graph,int V){

        for(int i=0;i<=V;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0,2));
        graph.get(0).add(new Edge(0,3));

        graph.get(1).add(new Edge(1,0));

        graph.get(2).add(new Edge(2,1));

        graph.get(3).add(new Edge(3,4));

    }


//    private static void KosarajuAlgo(List<List<Edge>> graph,int V,int curr,boolean [] visited, Stack<Integer> st){
//
////        boolean [] visited=new boolean[V];
//
//        // Step-1
//
//        for(int i=0;i<=V;i++){
//            if(!visited[i]) {
//                visited[curr] = true;
//                for (int j = 0; j < graph.get(i).size(); j++) {
//                    Edge e = graph.get(i).get(j);
//                    if (!visited[e.dest]) KosarajuAlgo(graph, V, e.dest, visited, st);
//                }
//            }
//            st.push(curr);
//        }
//
//        //Step-2
//        List<List<Edge>> transpose=new ArrayList<>();
//        for(int i=0;i<=V;i++){
//            visited[V]=false;
//            transpose.add(new ArrayList<>());
//        }
//
//        for(int i=0;i<=V;i++){
//            if(!visited[V]){
//
//                visited[V]=true;
//
//                for(int j=0;j<graph.get(i).size();j++){
//                    Edge e=graph.get(i).get(j);
//                    if(!visited[e.dest]){
//
//                        transpose.get(e.dest).add(new Edge(e.dest,e.src));
//                        KosarajuAlgo(graph,V,e.dest,visited,st);
//
//                    }
//                }
//
//            }
//        }
//
//        //Step-3
//        boolean [] visited2 = new boolean[V+1];
//        while(!st.isEmpty()){
//            int popped=st.pop();
//            if(!visited2[popped]){
//                System.out.print(popped+" ");
//                visited2[popped]=true;
//                for(int i=0;i<transpose.get(popped).size();i++)
//                {
//                    Edge e=transpose.get(popped).get(i);
//                    if(!visited[e.dest]) KosarajuAlgo(transpose, V,e.dest,visited2,  st);
//                }
//                System.out.println();
//            }
//        }
//
//
//
//    }

public static void kosarajuAlgorithm(List<List<Edge>> graph,int V){
        //Step-1
        Stack<Integer> st=new Stack<>();

        boolean [] visited=new boolean[V+1];

        for(int i=0;i<=V;i++){
            topoSort(graph,st,i,visited);
        }

        //Step-2
        List<List<Edge>> transpose=new ArrayList<>();
        for(int i=0;i<=V;i++){
            visited[i]=false;
            transpose.add(new ArrayList<>());
         } visited[V]=false;
     for(int i=0;i<=V;i++){
         for(int j=0;j<graph.get(i).size();j++){
             Edge e=graph.get(i).get(j);
             transpose.get(e.dest).add(new Edge(e.dest,e.src));
         }
     }

     // Step-3
    while(!st.isEmpty()) {
        int curr = st.pop();
        if(!visited[curr]) {
            System.out.print("SCC : ");
            dfs(transpose, curr, visited);
            System.out.println();
        }
    }

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

    public static void dfs(List<List<Edge>> transpose, int popped, boolean[] visited) {

        visited[popped]=true;
        System.out.print(popped+" ");
        for(int i=0;i<transpose.get(popped).size();i++){
            Edge e=transpose.get(popped).get(i);

            if(!visited[e.dest]){
                dfs(transpose,e.dest,visited);
            }

        }

    }

    public static void main(String [] args){
       int V=4;
//       boolean [] visited=new boolean[V+1];
       List<List<Edge>> graph=new ArrayList<>();
        createGraph(graph,V);
//        KosarajuAlgo(List<List<Edge>> graph,int V,int curr,boolean [] visited, Stack<Integer> st)
//        KosarajuAlgo(graph,V,0,visited,new Stack<>());
        kosarajuAlgorithm( graph, V);

    }
}
