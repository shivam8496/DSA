package BaskTracking;


import java.util.ArrayList;

public class sudukoSolver {
    public static void main(String[] args) {

        char [][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        if(solve(board))
        {
            display(board);
        }
        else
        {
            System.out.println("Cannot be solved");
        }

    }
static boolean solve(char [][] board){
    int n = board.length;
    int row = -1;
    int col = -1;

    boolean emptyLeft = true;

    // this is how we are replacing the r,c from arguments
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (board[i][j] == '.') {
                row = i;
                col = j;
                emptyLeft = false;
                break;
            }
        }
        // if you found some empty element in row, then break
        if (emptyLeft == false) {
            break;
        }
    }

    if (emptyLeft == true) {
        return true;
        // soduko is solved
    }





    for(char number=49; number<=57;number++)
        {
            if(isSafe(board,row,col,number))
            {  board[row][col]=number;
                if(solve(board))
               { // Answer Found
//                display(board);
               return true;
               }
                else
                {
                    board[row][col]='.';
                }
            }
        }
        return false;
}

    private static void display(char [][] board) {

        ArrayList<ArrayList<Character>> outer= new ArrayList<>();

        for(int i=0;i<board.length;i++)
        { ArrayList<Character> inner=new ArrayList<>();
            for(int j=0;j<board.length;j++)
            {

                inner.add(board[i][j]);
            }
            outer.add(inner);
        }

        for (ArrayList<Character> r:outer) {
            System.out.println(r);
        }
    }

    private static boolean isSafe(char [][] board, int row, int col,char num) {
//      for row
        for (int i=0;i<board.length;i++)
        {
            if(board[row][i] == num)
                return false;
        }
//        for column
        for (char [] nums:board) {
            if(nums[col]==num)
                return false;
        }
//       for submatric
        int sqrt= (int)Math.sqrt(board.length);
        int rowStart= row-row%sqrt;
        int colStart= col-col%sqrt;
        for(int i=rowStart;i<(rowStart+sqrt);i++)
        {
            for (int j = colStart; j <(colStart+sqrt) ; j++) {
                if(board[i][j]==num)
                    return false;
            }

        }



        return true;
    }

}
