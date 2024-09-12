package com.LinkedLists;

import java.util.*;

public class DoublyLinkedList {

    private static class ListNode {
        int value;
        ListNode next;
        ListNode prev;

        public ListNode(int data, ListNode back, ListNode front) {
            this.value = data;
            this.prev = back;
            this.next = front;

        }

        public ListNode(int data) {
            this.value = data;
        }


    }

    public static int calculateSize(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;
    }

    public static ListNode createList(int [] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i], temp, null);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
    public static void print(ListNode head){
        while(head.next!=null){
            System.out.print(head.value+"->");
            head=head.next;
        }
        System.out.println(head.value+"\n");
        while(head!=null){
            System.out.print("<-"+head.value);
            head=head.prev;
        }
    }

    public static ListNode deleteNode(ListNode head,int index){
     if(head==null) return null;
     if(head.next==null && head.prev==null) return null;
     int size=calculateSize( head);

     if(index<0 || index>=size) return head;

     ListNode curr=head;

     ListNode back=head;
     for(int i=0;i<index;i++){
         back=head;
         head=head.next;
     }

     back.next=back.next.next;
     head.prev=head.prev.prev;

     return curr.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
       ListNode li=createList(arr);
       deleteNode(li,0);
       print(li);
    }
}
