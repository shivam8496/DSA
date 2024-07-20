package com.Trees;

import java.util.Scanner;

public class Binarytree {




    private static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int num) {
            this.data = num;
            this.left=null;
            this.right=null;
        }

    }
      private Node root;
        public  void BuildTree(Scanner scanner)
        {
            System.out.println("Enter the root node ==>");
            int value=scanner.nextInt();
            root = new Node(value);
            populate(scanner,root);
        }
       private void populate(Scanner scanner,Node node)
       {

//           System.out.println("Do you want to enter the left of "+node.data);
//           boolean left= scanner.nextBoolean();
//           if(left) {
//               System.out.println("Enter the left Node ==>");
//               int value = scanner.nextInt();
//               node.left = new Node(value);
//               populate(scanner,node.left);
//           }
           System.out.println("Enter the value left of "+node.data);
           int value=scanner.nextInt();
           if(value!=-1)
           {
               node.left=new Node(value);
               populate(scanner,node.left);
           }


//           System.out.println("Do you want to enter the right of "+node.data);
//           boolean right= scanner.nextBoolean();
//           if(right) {
//               System.out.println("Enter the right Node ==>");
//               int value = scanner.nextInt();
//               node.right = new Node(value);
//               populate(scanner,node.right);
//           }


           System.out.println("Enter the value right of "+node.data);
           value=scanner.nextInt();
           if(value!=-1)
           {
               node.right=new Node(value);
               populate(scanner,node.right);
           }

       }

     public void display()
     {
         display("\t",root);
     }
     private void display(String indent , Node node)
     {
         if( node==null)
         {
           return;
         }
         display(indent+"\t",node.right);
         System.out.println(indent+node.data);
         display(indent+"\t",node.left);


     }


}
