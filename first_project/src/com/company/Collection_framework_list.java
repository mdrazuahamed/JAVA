package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_framework_list {
    public static void main(String[] args) {
        List colors_num = new ArrayList();
        colors_num.add("blue");
        colors_num.add(1);
        System.out.println(colors_num);

        List <String> colors = new ArrayList<>();
        List <String> colors2 = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

//        System.out.println(colors);
//        System.out.println(colors.contains("Yellow"));
//        System.out.println(colors.contains("purple"));
//        for(String color : colors){
//            System.out.println(color);
//        }
//        colors.forEach(System.out::println);
        System.out.println(colors);
        System.out.println(colors.get(1));// read
        colors.remove(1);           // delete
        System.out.println(colors);
        colors.add(1, "blue"); // Insert
        System.out.println(colors);
        colors.set(0,"green");
        System.out.println(colors); // updata /replace
        colors2.addAll(colors);
        System.out.println(colors2);
        System.out.println(colors.contains("gree"));
    }
}
