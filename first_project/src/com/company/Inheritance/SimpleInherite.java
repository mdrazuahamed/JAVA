package com.company.Inheritance;

public class SimpleInherite {
    public static void main(String args []) {
        first superOb = new first();
        B subOb = new B();
        C grandChild = new C();
// The superclass may be used by itself.
        superOb.i = 10;
        //superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();
/* The subclass has access to all public members of
its superclass. */
        subOb.i = 7;
        //subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();
        grandChild.doller=5;
        grandChild.money = 10;
        grandChild.euro = 15;
        grandChild.total();
        grandChild.i = 50;
        grandChild.j =60;
        grandChild.total();
        grandChild.showij();



    }
}