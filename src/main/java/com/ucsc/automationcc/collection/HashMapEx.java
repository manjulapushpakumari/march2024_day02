package com.ucsc.automationcc.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> personDetails = new HashMap<>();
        personDetails.put("Sanath", 35);
        personDetails.put("Ridmi", 24);
        personDetails.put("Dinushi", 29);

        for (Map.Entry<String, Integer> person: personDetails.entrySet()){
            String key = person.getKey();
            int val = person.getValue();
            System.out.printf("Name is %s and age is %d \n", key, val);
        }
    }
}
