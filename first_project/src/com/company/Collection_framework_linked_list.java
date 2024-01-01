package com.company;

import java.util.LinkedList;

public class Collection_framework_linked_list {
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList<>();
        ll.add("This");
        ll.add("is");
        ll.add("Razu");
        ll.add(0,"index adding work");
        System.out.println(ll);
        ll.addFirst("Rignt shift");
        System.out.println(ll);
        ll.remove("is");
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        String get_data = ll.get(2);
        System.out.println(get_data);
        ll.set(1,"Insert");
        System.out.println(ll);
        System.out.println(ll.contains("Razu"));
    }
}
