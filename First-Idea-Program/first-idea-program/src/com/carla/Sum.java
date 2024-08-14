package com.carla;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        System.out.println("The sum of the two numbers is " + (num1 + num2));

    }
}
