package com.carla;

import java.util.Scanner;

public class TypeCasting {
    public static void main (String[] args) {
        // Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println(num);

        // Type casting
//        int num = (int)(67.34f);
//        System.out.println(num);

        // Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // 257 % 256 = 1

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c; // a,b,c are automatically integers in this line because of the operator

        System.out.println(d);


    }
}

