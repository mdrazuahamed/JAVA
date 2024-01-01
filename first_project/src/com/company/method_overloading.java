package com.company;
class test_ {
    public void overload(int a){
        System.out.println("First"+a);
    }
    public void overload(){
        System.out.println("Second");
    }
    public int overload(int b, int c){
        System.out.println("Third"+b);
        return c;
    }
}
public class method_overloading {
    public static void main(String[] args) {
        test_ t = new test_();
        t.overload();
        t.overload(20);
        t.overload(50,70);
    }
}
