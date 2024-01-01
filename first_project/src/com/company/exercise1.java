package com.company;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        System.out.println("Please input the subject1 marks= ");
        int sub1 = mark.nextInt();
        System.out.println("Please input the subject2 marks= ");
        int sub2 = mark.nextInt();
        System.out.println("Please input the subject3 marks= ");
        int sub3 = mark.nextInt();
        System.out.println("Please input the subject4 marks= ");
        int sub4 = mark.nextInt();
        System.out.println("Please input the subject5 marks= ");
        int sub5 = mark.nextInt();
        int result = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.printf("percentage of marks = %d", result);

    }
}
