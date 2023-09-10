package com.recurrsionAgain.BackTtracking;

import java.awt.*;
import java.util.ArrayList;


public class NQueens {
    public static void main(String[] args) {

        Question(4);
    }

    static void Question(int n)
    {
        boolean [][] maze=new boolean[n][n];
        ArrayList<ArrayList<String>> ans= new ArrayList<>();
        ArrayList<ArrayList<String>> ans123= NQueenReturn(maze,0,"",ans);

        for (ArrayList<String> r:ans123) {
            System.out.println(r);
        }


    }
    static int NQueen(boolean [][]  maze,int r)
    { if(r==maze.length)
    {    display( maze);
        System.out.println(" ");
          return 1;
      }
        int count=0;
        for (int col=0 ; col <maze.length ; col++) {
            if(isSafe(maze,r,col))
            {
                maze[r][col]=true;
                count+=NQueen(maze,r+1);
                maze[r][col]=false;

            }
        }

        return count;
    }

    static boolean isSafe(boolean [][] maze,int r,int col)
    {
//        for Verticle Line
        for (int i = 0; i < r ; i++) {
            if(maze[i][col])
            {return false;}}
//            for leftDiagonal
            int leftmin=Math.min(r,col);
            for (int i = 0; i <=leftmin ; i++) {
             if(maze[r-i][col-i])
             {return false;}
            }
//            For RightDiagonal
            int rightmin=Math.min(r, (maze.length-col-1));
            for(int i=0;i<=rightmin;i++)
            {
                if(maze[r-i][col+i])
                    return false;
            }

            return true;






    }


    static void display(boolean [][] maze)
    {
        for (boolean [] row:maze) {

            for (boolean element:row) {

                if(element)
                {
                    System.out.print("Q");
                }
                else
                {
                    System.out.print(".");}

            }
            System.out.println(" ");
        }

    }
// static ArrayList<ArrayList<String>> ans=new ArrayList<>();
    static ArrayList<ArrayList<String>> NQueenReturn(boolean [][]  maze,int r,String path,ArrayList<ArrayList<String>> ans)
    {
        if(r==maze.length)
        {    ArrayList<String> li=new ArrayList<>();
            for (boolean [] row:maze) {
               path="";
                for (boolean element:row) {
                    if(element)
                    {
                       path=path+"Q";
                    }
                    else
                    {
                        path=path+".";
                    }

                }
                li.add(path);

            }
            ans.add(li);

            return ans;
    }


        for (int col=0 ; col <maze.length ; col++) {
            boolean b=true;
            for (int i = 0; i < r ; i++) {
                if(maze[i][col])
                {b= false;}}
//            for leftDiagonal
            int leftmin=Math.min(r,col);
            for (int i = 0; i <=leftmin ; i++) {
                if(maze[r-i][col-i])
                {b= false;}
            }
//            For RightDiagonal
            int rightmin=Math.min(r, (maze.length-col-1));
            for(int i=0;i<=rightmin;i++)
            {
                if(maze[r-i][col+i])
                    b= false;
            }


            if(b)
            {
                maze[r][col]=true;
                NQueenReturn(maze,r+1,path,ans);
                maze[r][col]=false;

            }
        }

        return ans;

    }

}
