package com.ucsc.automationcc.instanceinitializer;

public class MyClass {
    int x;

    public MyClass(){
        System.out.println("Constructor is called");
    }

    {
        System.out.println("Instance initializer is called");
        x = 10;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.x);
    }
}
