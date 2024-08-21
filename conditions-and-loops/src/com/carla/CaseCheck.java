package com.carla;

import java.util.Scanner;

public class CaseCheck {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter a string: ");
        char ch = sc.next().trim().charAt(0);

        // ASCII dec capital letters are in 65-90 range
        if (ch >= 65 && ch <= 90) {
            System.out.println("The letter " + ch + " is an uppercase.");
        } else {
            System.out.println("The letter " + ch + " is a lowercase.");
        }
    }
}
