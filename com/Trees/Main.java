package com.Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Binarytree tree=new Binarytree();
        Scanner input=new Scanner(System.in);
       tree.BuildTree(input);
       tree.display();


    }
}
