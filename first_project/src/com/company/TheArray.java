package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArray {
    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

        int[] numbers = {5, 3, 7, 1, 4};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        int index = Arrays.binarySearch(numbers, 4);
//        System.out.println(index);
//        int[] copy = Arrays.copyOf(numbers, 3);
//        System.out.println(Arrays.toString(copy));
//        Arrays.fill(numbers, 2);
//        System.out.println(Arrays.toString(numbers));
    }
}
