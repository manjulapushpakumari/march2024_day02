package com.ucsc.automationcc.stringpool;

public class StringDemo {
    int x = 10;
    int y = 20;

    String a = "Hello ";
    String b = "World";
    String c = "world";

    void display(){
        String helloWorld = a + b;
        System.out.println(helloWorld);
        System.out.println("-----------------");
        String values = String.format("Value for the a is %s and y is %d", a, y);
        System.out.println(values);
        System.out.println("------------------");
        System.out.println(b.equals(c));
        System.out.println(b.equalsIgnoreCase(c));
        System.out.println("-------string buffer-------------");
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println(stringBuffer);
        System.out.println("----------------------------");
        System.out.println(c.contains("ld"));
        System.out.println("-----------------------------");
        String name = "Sanath Kaushalya";
        System.out.println(name.replaceAll("a", "e"));
        System.out.println("-----------------------");
        String splitStr = "Dogs eat meat. Cats eat fishes.";
        String[] splitStrArr = splitStr.split(" ");
        for(String s : splitStrArr){
            System.out.println(s);
        }
        System.out.println("---------------------");
        String trimStr = " Dog is eating meat ";
        System.out.println(trimStr + ".");
        System.out.println(trimStr.trim() + ".");
        System.out.println("--------------------------");
        System.out.println(c.toUpperCase());
        System.out.println("---------------------");
        String[] arr = new String[]{"apple", "orange", "banana"};
        System.out.println(String.join("-", arr));
    }

    public static void main(String[] args) {
        new StringDemo().display();
    }
}
