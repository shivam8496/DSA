package com.Recurrsion;

//Solve the problem of  Tower of hanoi using stacks
public class TowerOfHanoi {
    public static void main(String[] args) {
     towerofhanoi(3);
    }

    private static void towerofhanoi(int n) {
      String A_Rod="A";
      String B_Rod="B";
      String C_Rod="C";
      helper(n,A_Rod,B_Rod,C_Rod);
    }

    static void helper(int n, String A_Rod, String C_Rod, String  B_Rod)
    {
        if (n==0)
            return;
        helper(n-1,A_Rod,B_Rod,C_Rod);
        System.out.println( "Move disk "+ n + " From Rod " + A_Rod + " to rod " + B_Rod);
        helper(n-1,C_Rod,B_Rod,A_Rod);

    }
}
