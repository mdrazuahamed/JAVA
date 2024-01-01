package com.company;

import java.util.HashSet;
import java.util.Set;

public class Collection_framework_Hash_set {
    public static void main(String[] args) {
        Set <String> hs = new HashSet<>();
        hs.add("Red");
        hs.add("Blue");
        hs.add("Green");
        hs.add("Re");
        hs.add("Blu");
        hs.add("Gree");
        System.out.println(hs);
        hs.remove("Re");
        System.out.println(hs);
        System.out.println(hs.contains("Blu"));
    }
}
