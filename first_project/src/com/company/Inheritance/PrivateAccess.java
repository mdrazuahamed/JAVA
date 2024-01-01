package com.company.Inheritance;

// Create a superclass.
class A {
    int i; // public by default
    private int j; // private to A
    void setij(int x, int y) {
        this.i = x;
        this.j = y;
    }
}
// A's j is not accessible here.
class Child extends A {
    int total;
    void sum() {
        total = i ; // ERROR, j is not accessible here
    }
}
public class PrivateAccess {

    public static void main(String args[]) {
        Child subOb = new Child();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}