package com.recurrsionAgain.BackTtracking;

public class MazeProblemo {
    public static void main(String[] args) {
      int up=3;
      int p=3;
//        System.out.println(MazeDiagonalPath("",up,p));
        boolean [][] maze= {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPaths(0,0,maze,"");
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
    static int MazeDiagonalPathRestriction(String path,int p,int up)
    {   if(p==1 && up==2)
    {
        System.out.println("River");
        return 0;
    }
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

    static void MazeRestriction(int r,int c,boolean [][] maze,String path)
    {
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(path);
            return;
        }
        if(!maze[r][c])
        {
            System.out.println(path+" "+"Restricted path");
            return;
        }
        if(r< maze.length-1)
        {
            MazeRestriction(r+1,c,maze,path+"R");
        }
        if(c< maze[0].length-1)
        {
            MazeRestriction(r,c+1,maze,path+"D");
        }

    }



    static void allPaths(int r,int c,boolean [][] maze,String path)
    {
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(path);
            return;
        }
        if(!maze[r][c])
        {

            return;
        }



        if(r< maze.length-1)
        {   maze[r][c]=false;  //This is where rat will enter And mark this path as visited.
            allPaths(r+1,c,maze,path+"R");
            maze[r][c]=true;   //This is where function will be returned and this path will be adverted back to like it was in previous call
        }
        if(r>0)
        {      maze[r][c]=false;   //This is where rat will enter And mark this path as visited.
            allPaths(r-1,c,maze,path+"U");
            maze[r][c]=true;   //This is where function will be returned and this path will be adverted back to like it was in previous call
        }
        if(c>0)
        {      maze[r][c]=false;    //This is where rat will enter And mark this path as visited.
            allPaths(r,c-1,maze,path+"L");
            maze[r][c]=true;       //This is where function will be returned and this path will be adverted back to like it was in previous call
        }
        if(c< maze[0].length-1)
        {   maze[r][c]=false;   //This is where rat will enter And mark this path as visited.
            allPaths(r,c+1,maze,path+"D");
            maze[r][c]=true; //This is where function will be returned and this path will be adverted back to like it was in previous call
        }



    }


}
