package com.recurrsionAgain.BackTtracking;

public class MazeProblemo {
    public static void main(String[] args) {
      int up=3;
      int p=3;
        System.out.println(MazeDiagonalPath("",up,p));
    }


    static int Maze(int p,int up)
    {
        if(p==1 || up==1)
        {
            System.out.println(p+" "+up);
            return 1 ;
        }
        int count=0;
        count=count+Maze(p-1,up)+Maze(p,up-1);;

        return count;
    }

    static int MazePath(String path,int p,int up)
    {
        if(p==1 && up==1)
        {
            System.out.println(path);
            return 1 ;
        }
        int c=0;
        int r=0;
        if(p>1)
        { r=MazePath(path+"D",p-1,up);}

        if(up>1) {
             c = MazePath(path + "R", p, up - 1);
        }
     return r+c;
    }



    static int MazeDiagonalPath(String path,int p,int up)
    {
        if(p==1 && up==1)
        {
            System.out.println(path);
            return 1 ;
        }
        int c=0;
        int r=0;
        if(p>1)
        { r=MazeDiagonalPath(path+"D",p-1,up);}
        int d=0;
        if (p>1 && up>1)d=MazeDiagonalPath(path+"Diagonal",p-1,up-1);
        if(up>1) {
            c = MazeDiagonalPath(path + "R", p, up - 1);
        }
        return r+c+d;
    }



}
