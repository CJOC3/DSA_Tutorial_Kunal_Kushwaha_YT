package com.carla;

import java.util.Scanner;

public class ReverseNumber2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number to get its reverse: ");
        int num = sc.nextInt();
        int rem;
        int ans = 0;

        while (num > 0) {
            rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
