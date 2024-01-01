package com.company;

import java.util.HashMap;

public class Collection_framework_Hash_Map {
    public static void main(String[] args) {
        HashMap <Integer,String>  hm= new HashMap<>();
        hm.put(5,"Razu");
        hm.put(10,"Sazu");
        hm.put(12,"Raz");
        System.out.println(hm);
        hm.remove(10);
        System.out.println(hm);
        System.out.println(hm.containsKey(5));
        System.out.println(hm.containsValue("Razu"));
        hm.replace(5,"Sneha");
        System.out.println(hm);
        hm.put(12,"Razz");
        System.out.println(hm);
        //hm.clear();
        System.out.println(hm);
        System.out.println(hm.values());
        System.out.println(hm.get(12));

    }
}
