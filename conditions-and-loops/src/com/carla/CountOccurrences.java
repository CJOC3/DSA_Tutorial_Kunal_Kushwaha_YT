package com.carla;

import java.util.Scanner;

/**
 * This program counts the number of occurrences of a digit.
 */
public class CountOccurrences {
    public static void main (String[] args) {

        // Input, variables 
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        System.out.print("Please enter which digit of the number to find occurrences: ");
        int target = sc.nextInt();
        int rem;
        int count = 0;

        // while there is a digit to be checked from the input
        while (num > 0) {
            rem = num % 10; //Isolate the last digit
            if (rem == target) {
                count++;
            }
            num /= 10; // Remove the current digit in check
        }
        System.out.println("The number of occurrences of the digit " + target + " is " + count);
    }
}
