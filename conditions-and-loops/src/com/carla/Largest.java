package com.carla;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;

        System.out.print("Please enter a number: ");
        int x = sc.nextInt();
        System.out.print("Please enter another number: ");
        int y = sc.nextInt();
        System.out.print("Please enter the last number: ");
        int z = sc.nextInt();

        if (x > y && x > z) {
            largest = x;
        } else if (y > x && y > z) {
            largest = y;
        } else if (z > x && z > y) {
            largest = z;
        }

        /*
        Without using logical operators
            - assume the first number is the largest then compare the largest against y then z
            - get the max between x and y, then compare z against max(x,y)
         */

        System.out.println("The largest number among the three is " + largest);
    }
}
