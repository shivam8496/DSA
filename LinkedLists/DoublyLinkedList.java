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
        if(head==null) {
            System.out.println("NULL");
            return;
        }
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
        int count=0;

        ListNode curr=head;

        while(head!=null){
            count++;
            if(count==index) break;
            curr=curr.next;
        }
        if(curr.prev==null) {
            head=deleteHead(head);
            return head;
        }
        if(curr.next==null){
            head=deleteTail(head);
            return head;
        }
        ListNode back=curr.prev;
        ListNode front=curr.next;
        back.next=front;
        front.prev=back;
        curr.prev=null;
        curr.next=null;
        return head;
    }

    public static ListNode deleteHead(ListNode head){
        if(head==null ||  head.next==null) {
            return null;
        }

        ListNode curr=head;
        head=head.next;
        curr.next=null;
        head.prev=null;

        return head;



    }
    public static ListNode deleteTail(ListNode head){
        if(head==null || head.next==null) return null;

        ListNode curr = head;

        while(curr.next!=null){
           curr=curr.next;
        }
        ListNode temp=curr.prev;
        curr.prev=null;
        temp.next=null;



        return head;
    }

    public static ListNode insertAtHead(ListNode head,int value){
        if(head==null){
            return new ListNode(value);
        }

        ListNode node = new ListNode(value);
        node.next=head;
        head.prev=node;
        head=head.prev;

        return head;
    }

    public static ListNode insertAtTail(ListNode head,int value){
        if(head==null)return new ListNode(value);

        ListNode curr=head;

        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=new ListNode(value);

        curr.next.prev=curr;

        return head;
    }

    public static ListNode insertAtIndex(ListNode head,int index,int value){

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
       ListNode li=createList(arr);
//       deleteNode(li,0);
//        li=deleteHead(li);
//        li=deleteTail(li);
//        li=deleteNode(li,3);
//        li=insertAtHead(li,0);
        
       print(li);
    }

}
