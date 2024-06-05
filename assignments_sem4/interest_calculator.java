package com.assignments_sem4;


import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args) {
        amount(100000);
    }
    static void amount(double amount){
        if(amount>1000000)
            {crore(amount);}
            System.out.println("Enter the in which form u want to invest \n 1.FD(Fixed Deposit) \n 2.RD(Return Deposit) \n 3.SB(Saving account)");
            Scanner input=new Scanner(System.in);
            int choice= input.nextInt();
         if(choice==1){
            FD(amount);
            }
            else if(choice==2){
                RD(amount);
            }
            else if(choice==3){
                SB(amount);
            }
        }


     static void SB(double amount) {
         System.out.println("Enter the time (in days) ==>");
         Scanner input=new Scanner(System.in);
         double days=input.nextDouble();
         if(days>=7 && days<=14)
         {  amountclacdays(amount,days,6.50);}
         else if (days>=7 && days<=14) {
             amountclacdays(amount,days,6.75);
         }
         else
         {
             System.out.println("You cant enter less than 7 days OR more than 29 days!!!!");
         }
     }

    static void RD(double amount) {
        double [] ratesG={7.50,7.75,8.00,8.25,8.50,8.75};
        double [] ratesS={8.00,8.25,8.50,8.75,9.00,9.25};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age ==>");
        int age=input.nextInt();
        if(age>60)
        {   System.out.println("Enter the time (in form of months ==>)");
            int days=input.nextInt();
            if(days>=7 && days<=14)
            {  amountclacmonths(amount,days,ratesS[0]);}
            else if (days<=15 && days<=39) {
                amountclacmonths(amount,days,ratesS[1]);
            }
            else if (days<=30 && days<=45) {
                amountclacmonths(amount,days,ratesS[2]);
            }
            else if (days<=45 && days<=60) {
                amountclacmonths(amount,days,ratesS[3]);
            }
            else if (days<=61 && days<=184) {
                amountclacmonths(amount,days,ratesS[4]);
            }
            else if (days<=185 && days<=365) {
                amountclacmonths(amount,days,ratesS[5]);
            }
            else
            {
                System.out.println("You cant enter less than 7 days OR more than 1 year!!!!");
            }


        }
        else {
            System.out.println("Enter the time (in form of days ==>)");
            int days=input.nextInt();
            if(days>=7 && days<=14)
            {  amountclacmonths(amount,days,ratesS[0]);}
            else if (days<=15 && days<=39) {
                amountclacmonths(amount,days,ratesS[1]);
            }
            else if (days<=30 && days<=45) {
                amountclacmonths(amount,days,ratesS[2]);
            }
            else if (days<=45 && days<=60) {
                amountclacmonths(amount,days,ratesS[3]);
            }
            else if (days<=61 && days<=184) {
                amountclacmonths(amount,days,ratesS[4]);
            }
            else if (days<=185 && days<=365) {
                amountclacmonths(amount,days,ratesS[5]);
            }
            else
            {
                System.out.println("You cant enter less than 7 days OR more than 1 year!!!!");
            }
        }

    }
     static void FD(double amount) {
        double [] ratesG={4.50,4.75,5.50,7.00,7.50,8.00};
        double [] ratesS={5.00,5.25,6.00,7.50,8.00,8.50};
         Scanner input=new Scanner(System.in);
         System.out.println("Enter your age ==>");
         int age=input.nextInt();
         if(age>60)
         {   System.out.println("Enter the time (in form of days ==>)");
             double days=input.nextDouble();
             if(days>=7 && days<=14)
             {  amountclacdays(amount,days,ratesS[0]);}
             else if (days<=15 && days<=39) {
                 amountclacdays(amount,days,ratesS[1]);
             }
             else if (days<=30 && days<=45) {
                 amountclacdays(amount,days,ratesS[2]);
             }
             else if (days<=45 && days<=60) {
                 amountclacdays(amount,days,ratesS[3]);
             }
             else if (days<=61 && days<=184) {
                 amountclacdays(amount,days,ratesS[4]);
             }
             else if (days<=185 && days<=365) {
                 amountclacdays(amount,days,ratesS[5]);
             }
             else
             {
                 System.out.println("You cant enter less than 7 days OR more than 1 year!!!!");
             }


         }
         else {
             System.out.println("Enter the time (in form of days ==>)");
             int days=input.nextInt();
             if(days>=7 && days<=14)
             {  amountclacdays(amount,days,ratesS[0]);}
             else if (days<=15 && days<=39) {
                 amountclacdays(amount,days,ratesS[1]);
             }
             else if (days<=30 && days<=45) {
                 amountclacdays(amount,days,ratesS[2]);
             }
             else if (days<=45 && days<=60) {
                 amountclacdays(amount,days,ratesS[3]);
             }
             else if (days<=61 && days<=184) {
                 amountclacdays(amount,days,ratesS[4]);
             }
             else if (days<=185 && days<=365) {
                 amountclacdays(amount,days,ratesS[5]);
             }
             else
             {
                 System.out.println("You cant enter less than 7 days OR more than 1 year!!!!");
             }
         }

    }

    static void crore(double amount) {
        double [] rates={6.50,6.75,6.75,8.00,8.50,10.00};
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the time (in form of days ==>)");
         double days=input.nextDouble();
        if(days>=7 && days<=14)
        {  amountclacdays(amount,days,rates[0]);}
        else if (days<=15 && days<=39) {
            amountclacdays(amount,days,rates[1]);
        }
        else if (days<=30 && days<=45) {
            amountclacdays(amount,days,rates[2]);
        }
        else if (days<=45 && days<=60) {
            amountclacdays(amount,days,rates[3]);
        }
        else if (days<=61 && days<=184) {
            amountclacdays(amount,days,rates[4]);
        }
        else if (days<=185 && days<=365) {
            amountclacdays(amount,days,rates[5]);
        }
        else
        {
            System.out.println("You cant enter less than 7 days OR more than 1 year!!!!");
        }



     }

     static void amountclacdays(double amount, double days, double rate) {
        double interest=(amount*rate*(days/360));
         System.out.println("Total Interest is ==>"+interest);
         System.out.println("Total amount after interest is ==>"+interest+amount);
    }
    static void amountclacmonths(double amount, double months, double rate) {
        double interest=(amount*rate*(months/12));
        System.out.println("Total Interest is ==>"+interest);
        System.out.println("Total amount after interest is ==>"+interest+amount);
    }
}
