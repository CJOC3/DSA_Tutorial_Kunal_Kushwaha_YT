package com.carla;

import java.util.Scanner;

/**
 * This program reverses the input number.
 */

public class ReverseNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to get its reverse: ");
        int num = sc.nextInt();
        String sNum = String.valueOf(num); //Convert number to String
        int numOfDigits = sNum.length(); //Get the number of digits of the input

        //Loop through the digits, starting at the last digit
        for (int i = numOfDigits - 1; i >= 0; i--) {
            System.out.print(sNum.charAt(i));
        }

    }
}
