package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int random_number;
    public int number_of_guess=0;

    public int getNumber_of_guess() {
        return number_of_guess;
    }

    public void setNumber_of_guess(int number_of_guess) {
        this.number_of_guess = number_of_guess;
    }

    Game(){
        Random rand = new Random();
        int exact_number = rand.nextInt(100);
        this.random_number= exact_number;
    }
    int take_User_Input(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
    boolean is_Correct_Number(int num){
        if(random_number==num){
            return true;
        }
        else {
            return false;
        }
    }
}
public class guess_the_number {
    public static void main(String[] args) {
        Game g=new Game();
        int my_number;
        System.out.println("Give your Number");
        my_number= g.take_User_Input();
        do {
            if(my_number>g.random_number){
                System.out.println("Incorrect You give big number");
            } else if (my_number< g.random_number) {
                System.out.println("Incorrect You give Small number");
            }
            g.number_of_guess++;
            System.out.println("Give your number");
            my_number= g.take_User_Input();
        }
        while(!g.is_Correct_Number(my_number));
        System.out.println("Correct number is "+my_number);
        System.out.println("Number of guess = "+g.number_of_guess);
    }
}
