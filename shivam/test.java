package com.shivam;

public class test {

    public static class Node {

        int val;

        Node prev;

        Node next;

        Node child;


        Node(int _val) {

            val = _val;

            prev = null;

            next = null;

            child = null;

        }
    }

        public static Node flat(Node head){
            Node curr = head;
            Node last = head;
            while(curr!=null){
                if(curr.child!=null){
                    //if we encounter child we will try to flatten that child and return its tail
                    Node midTail = flat(curr.child);

                    //if current node next is not null we need to connect it with curr next
                    Node next = curr.next;
                    if(next!=null){
                        midTail.next = next;
                        next.prev = midTail;
                    }

                    //there we are connecting mid node's first node with curr node next pointer
                    curr.next = curr.child;
                    curr.child.prev = curr;

                    //we make sure all child nodes should be null;
                    curr.child = null;

                    //there, we are giving curr pointer to midTail which is the end of child linked list
                    curr = midTail;
                }
                //we used last pointer to get the last node of child
                last = curr;
                curr = curr.next;
            }
            return last;
        }


    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);

        head.next.prev = head;

        head.next.next = new Node(3);

        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);

        head.next.next.next.prev = head.next.next;

        head.next.next.next.next = new Node(5);

        head.next.next.next.next.prev = head.next.next.next;

        head.next.next.next.next.next = new Node(6);

        head.next.next.next.next.next.prev = head.next.next.next.next;



        head.next.next.child = new Node(7);

        head.next.next.child.next = new Node(8);

        head.next.next.child.next.prev = head.next.next.child;

        head.next.next.child.next.next = new Node(9);

        head.next.next.child.next.next.prev = head.next.next.child.next;

        head.next.next.child.next.next.next = new Node(10);

        head.next.next.child.next.next.next.prev = head.next.next.child.next.next;



        head.next.next.child.next.child = new Node(11);

        head.next.next.child.next.child.next = new Node(12);

        head.next.next.child.next.child.next.prev = head.next.next.child.next.child;

        flat(head);
        while(head!=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}

