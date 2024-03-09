package com.ucsc.automationcc.stringpool;

public class Demo {
    public static void main(String[] args) {
        String a = "Apple";
        String b = "Apple";

        String c = new String("Orange");
        String d = new String("Orange");

        System.out.println(a==b);
        System.out.println(c==d);
    }
}
