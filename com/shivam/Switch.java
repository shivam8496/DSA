package com.shivam;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Employ ID");
        int i =input.nextInt();
        System.out.println("Enter the department");
        String dep = input.nextLine();

        switch (i) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> {
                System.out.println("employ 3");

                switch (dep) {
                    case "Nothing" -> System.out.println("Nothing");

                    case "Somthing with" -> System.out.println("somthing with space ");

                    default -> System.out.println("Enter The valid statement");
                }
            }
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Plese the enter the Valid number ");
        }

    }
}
