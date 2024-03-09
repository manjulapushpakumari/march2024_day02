package com.ucsc.automationcc.superkeyword;

public class Spider extends Animal{
    int noOfLegs = 8;

    void display(){
        System.out.println("No of legs for the spider is : " + noOfLegs);
        System.out.println("No of legs for the animal is : " + super.noOfLegs);
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.display();
    }
}
