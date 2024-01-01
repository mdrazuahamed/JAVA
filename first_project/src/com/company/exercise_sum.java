package com.company;

import java.util.Scanner;

public class exercise_sum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Insert input1");
        int num1 = num.nextInt();
        System.out.println("Insert input2");
        int num2 = num.nextInt();
        System.out.println("Insert input3");
        int num3 = num.nextInt();
        int sum = num1 + num2 + num3;
        System.out.printf("Sum = %d", sum);

    }
}
