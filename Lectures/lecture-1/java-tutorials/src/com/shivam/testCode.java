package com.shivam;

public class TestCode {
     static class Rectangle
    {
        double length, width , area;
        String color;
        void set_length(double l)
        {
            length=l;
        }
        void set_width(double w)
        {
            width =w;
        }
        void set_color(String a){
            color=a;
        }
        String getColor(){
            return color;
        }
        void find_area(){
            area = length* width;
        }
        double getArea(){
            return area;
        }
    }

        public static void main(String[] args) {
            Rectangle r1=new Rectangle();
            r1.set_length(2);
            r1.set_width(10);
            r1.set_color("RED");
            r1.find_area();
            Rectangle r2=new Rectangle();
            r2.set_length(2);
            r2.set_width(10);
            r2.find_area();
            r2.set_color("RED");
            if(r1.getColor().equals(r2.getColor()) && r1.area == r2.area )
            {
                System.out.println("Matching Rectangles");
                if(r1.length== r2.length)
                    System.out.println("As well as Length and breath are also matching");
            }
            else
            {
                System.out.println("Non Matching Rectangles");
            }
        }





    }



