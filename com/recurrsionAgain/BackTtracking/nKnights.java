package com.recurrsionAgain.BackTtracking;




public class nKnights {
    public static void main(String[] args) {
        int n=2;
        boolean [][] board = new boolean[n][n];
        nKnight(0,0,board,n);

    }

    static void nKnight(int row, int col,boolean [][] board,int k)
    {
        if(k==0)
        {
            display(board);
            System.out.println(" ");
            System.out.println(" ");
            return;
        }
        if(row==board.length-1  && col==board.length)
        {
            return;
        }
        if(col==board.length)
        {
            nKnight(row+1,0,board,k);
            return;
        }

        if(isSafe(row,col,board))
        {
            board[row][col]=true;
            nKnight(row,col+1,board,k-1);
            board[row][col]=false;
        }

        nKnight(row,col+1,board,k);
    }

    private static boolean isSafe(int row, int col, boolean[][] board) {
          if(isValid(row-1,col-2,board))
          {
              if(board[row-1][col-2])
                  return false;
          }

        if(isValid(row-1,col+2,board))
        {
            if(board[row-1][col+2])
                return false;
        }

        if(isValid(row-2,col+1,board))
        {
            if(board[row-2][col+1])
                return false;
        }

        if(isValid(row-2,col-1,board))
        {
            if(board[row-2][col-1])
                return false;
        }


        return true;

    }
    static boolean isValid(int row,int col,boolean [][] board)
    {
        if(row>= 0 && row< board.length && col>= 0 && col< board.length )
            return true;
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean [] row:board) {

            for (boolean element:row) {

                if(element)
                {
                    System.out.print("K");
                }
                else
                {
                    System.out.print(".");}

            }
            System.out.println(" ");
        }
    }
}
