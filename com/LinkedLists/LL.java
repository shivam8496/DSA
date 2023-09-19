package com.LinkedLists;

public class LL {
      private Node head;
      private Node tail;
      private int size;
      public LL()
      {
          this.size=0;
      }
      public void insertFirst(int value)
      {
          Node node=new Node(value);
          node.next=head;
          head=node;

          if(tail ==null)
          {
              tail=head;
          }
          size+=1;
      }
     public int deletefirst()
     {
         int value=head.value;
         head=head.next;
         if(head==tail)
         {
             tail=tail.next;
         }
         size--;
         return value;
     }
      public void insert(int value,int index){
          if(index==0)
          {insertFirst(value);
          return;
          }
          if(index==size)
          {   insertLast(value);
              return;
          }
          if(index>size || index<0)
          {
              System.out.println(index+" List Index out of Bound of "+size);
              return;
          }
          Node temp=head;
          for (int i = 1; i <index ; i++) {
              temp=temp.next;

          }
          Node node=new Node(value,temp.next);
          temp.next=node;
          size++;
      }
        public void insertLast(int value)
        {
            if(tail==null)
            {
                insertFirst(value);
                return;
            }
            Node node= new Node(value);
            tail.next=node;
            tail=node;
            size++;

        }

        public void InsertRec(int val,int index)
        {   Node node=head;
            helper(val,index,node);
            size++;
        }
        private Node helper(int val,int index,Node node)
        {
            if(index==0)
            {
                Node value=new Node(val);
                value.next=node;
                return value;

            }
            node.next=helper(val,index-1,node.next);
            return node;
        }
      public void display()
      {
          Node temp=head;
          while(temp!=null)
          {
              System.out.print(temp.value+" --> ");
              temp=temp.next;

          }
          System.out.println("END");
      }
      public int deleteLast()
      {   if(size<=1)
          {deletefirst();}
          Node node=get(size-2);
          int value=tail.value;
          tail=node;
          size--;
          tail.next=null;
          return value;
      }
      public Node get(int index)
      {
          Node node=head;
          for (int i = 0; i < index; i++) {
              node=node.next;
          }
          return node;
      }
    private class Node{
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }

//        ListNode head=node;
//        if(node==null)
//        {return node;}
//
//        while(node.next!=null)
//        {
//            if(node.val==node.next.val)
//            {
//                node=node.next.next;
//            }
//            else{
//                node=node.next;
//            }
//        }
//
//        return head;

    }
}
