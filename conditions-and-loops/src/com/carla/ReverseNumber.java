package com.carla;

import java.util.Scanner;

public class ReverseNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to get its reverse: ");
        int num = sc.nextInt();
        String sNum = String.valueOf(num);
        int numOfDigits = sNum.length();

        for (int i = numOfDigits - 1; i >= 0; i--) {
            System.out.print(sNum.charAt(i));
        }

    }
}
