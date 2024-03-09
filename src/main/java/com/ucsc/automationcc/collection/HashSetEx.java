package com.ucsc.automationcc.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Sanath");
        hashSet.add("Haritha");
        hashSet.add("Thamira");
        hashSet.add("Sanath");

        for(String s : hashSet){
            System.out.println(s);
        }
    }
}
