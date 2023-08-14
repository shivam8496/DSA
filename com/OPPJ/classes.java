package com.OPPJ;

import java.util.Arrays;

//Copy constructors are the examples of Polymorphism
public class classes {
    public static void main(String[] args)
    {
        student s1=new student("Shivam");
        s1.marks1[0]=1;
        s1.marks1[1]=2;
        s1.marks1[2]=3;
        student s2=new student(s1);
        s1.marks1[0]=11;
        s1.marks1[1]=22;
        s1.marks1[2]=33;
        s1.name="Not shivam";
        System.out.println(Arrays.toString( s2.marks1) +" "+s2.name );



    }
}

class student
{
    int [] marks1=new int[3];
    int marks;
    String name;
    student(int marks)
    {this.marks=marks;
        System.out.println("New object made  INT type constructor called");
    }

//    DEEP COPY CONSTRUCTOR
    student(student s1)
    {   //Only for arrays
        for (int i = 0; i < 3; i++) {
            this.marks1[i]=s1.marks1[i];
        }



      this.name=s1.name;
    }


    student()
    {
        System.out.println("New object made");
    }
    student(String name)
    {
        this.name=name;
        System.out.println("New object made CHAR Type constructor called");
    }
    student(int marks,String name)
    {
        this.name=name;
//        this.marks=marks;
        System.out.println("New object made All type constructor called");
    }

}
