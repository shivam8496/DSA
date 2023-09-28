package com.Stacks;

public class main {
    public static void main(String[] args) {
      DynamicStack st=new DynamicStack(5 );

        st.push(1);
        System.out.println(st.peek());
        st.push(2);
        System.out.println(st.peek());
        st.push(3);
        System.out.println(st.peek());
        st.push(4);
        System.out.println(st.peek());
        st.push(5);
        System.out.println(st.peek());
      st.push(6);
      System.out.println(st.peek());



    }
}
