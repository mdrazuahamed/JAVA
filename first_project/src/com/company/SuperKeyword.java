package com.company;
class Parent{
    int a;

    public int getA() {
        return a;
    }

    public Parent() {
    }

    Parent(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class Child extends Parent{
    public Child() {
        System.out.println("I am default constructor");
    }

    public Child(int c){
        System.out.println("I am child class constructor");

    }
}
public class SuperKeyword {
}
