package com.carla;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int x,y, diff, sum, rem, prod;
        int quot = 0;

        // Take input from user till user does not press X or x

        System.out.println("This program will stop taking input when X or x is entered...");
        while (true) {
            // Take the operator as input

            System.out.print("Please enter an operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // Input two numbers
                System.out.print("Please enter a number: ");
                x = sc.nextInt();
                System.out.print("Please enter another number: ");
                y = sc.nextInt();

                if (op == '+') {
                    sum = x + y;
                    System.out.println("The sum of " + x + " and " + y + " is "+ sum);
                } else if (op == '-') {
                    diff = x - y;
                    System.out.println("The difference of " + x + " and " + y + " is "+ diff);
                } else if (op == '*') {
                    prod = x * y;
                    System.out.println("The product of " + x + " and " + y + " is "+ prod);
                } else if (op == '/') {
                    if (y != 0) {
                        quot = x / y;
                    }
                    System.out.println("The quotient of " + x + " and " + y + " is "+ quot);
                } else {
                    rem = x % y;
                    System.out.println("The remainder of " + x + " and " + y + " is "+ rem);
                }

            } else if (op == 'X' || op == 'x') {
                System.out.println("Stopping this program...");
                break;
            } else {
                System.out.println("Invalid operator.");
            }
        }
    }
}
