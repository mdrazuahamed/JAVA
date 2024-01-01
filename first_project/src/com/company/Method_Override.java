package com.company;


import org.w3c.dom.ls.LSOutput;

class A{
    public int a;
    int c;
    private int d;

    public void meth1(int a){
        System.out.println("I am method 1 of class A"+"\tc="+c);
    }
}

class B extends A{
    int c;
    @Override
    public void meth1(int b){
        System.out.println("I am method 1 of class B"+"\tc="+c);
    }


}
public class Method_Override {

    public static void main(String[] args) {
        A a = new A();
        a.meth1(1);

        B b = new B();
        b.c=5;
        b.a=5;
        b.meth1(1);

    }
}