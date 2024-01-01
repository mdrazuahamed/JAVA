package com.company;

import java.util.Scanner;

public class exercise_cgpa {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Insert input1");
        float num1 = num.nextFloat();
        System.out.println("Insert input2");
        float num2 = num.nextFloat();
        System.out.println("Insert input3");
        float num3 = num.nextFloat();
        float sum = num1 + num2 + num3;
        System.out.printf("Sum = %f", sum);
    }
}
