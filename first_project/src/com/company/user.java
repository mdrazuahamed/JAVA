package com.company;

import java.util.Scanner;
import java.util.Random;
public class user {
    public static void main(String[] args) {
        Random rand = new Random();
        int computer_1 ;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            int win = 0;
            int loss = 0;
            System.out.println("0 for Rock, 1 for Paper, 2 for scissor");
            int my_num = sc.nextInt();
            computer_1 = rand.nextInt(3);
            System.out.println(computer_1);
            switch(computer_1){
                  case 0 -> {

                  }
                  case 1 -> {

                  }
                  case 2 -> {

                  }
                  default -> System.out.println("Wrong");

            }
        }
    }
}
