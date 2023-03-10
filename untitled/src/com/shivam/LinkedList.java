package com.shivam;
//
//
//  class node {
//      int data;
//      node next;
//      node (int data)
//      {this.data=data;}
//  }
//
//
//public class LinkedList {
//    public static void main(String[] args) {
////      Making elements
//       node n1=new node(10);
//        node n2=new node(39);
//        node n3=new node(32);
//        node n4=new node(3);
////        Linking elements
//        node head=n1;
//        head.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        node tail=n4;
//        n4.next=null;
////      Printing elements
//
////        printpos(head,3);
//        print(head);
//        insert(head,69,0);
//        print(head);
//
//    }
//    static void print(node head)
//    {
//        node cur=head;
//        while(cur!=null)
//        {
//            System.out.print(cur.data+" ");
//            cur=cur.next;
//        }
//        System.out.println();
//    }
//    static int print_index(node head,int pos)
//    {  node cur=head;
//        for (int i = 0; i < pos; i++) {
//            cur=cur.next;
//
//        }
//        return cur.data;
//    }
//    static void insert(node head ,int num, int pos)
//    {   node add=new node(num);
//        if(pos==0)
//        {   add.next=head;
//            head =add;
//            return;
//        }
//
//        node prev= head;
//
//        for (int i = 0; i < pos-1; i++)
//        {
//            prev=prev.next;
//        }
//            add.next=prev.next;
//            prev.next=add;
//        }
//
//
//
//       }
//
//
//
//
