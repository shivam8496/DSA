package com.recurrsionAgain.BackTtracking;

public class MazeProblemo {
    public static void main(String[] args) {
      int up=3;
      int p=3;
        System.out.println(Maze(up,p));
    }


    static int Maze(int p,int up)
    {
        if(p==0 || up==0)
        {
            System.out.println(p+" "+up);
            return 1 ;
        }
        int count=0;
        count=count+Maze(p-1,up)+Maze(p,up-1);;

        return count;
    }


}
