package com.ucsc.automationcc.exceptionex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            double value = Math.random();
            System.out.println("print try start with value of " + value);
            if(value >= 0.5){
                throw new RuntimeException();
            }
            System.out.println("print try end");
        }catch (NumberFormatException nex){
            System.out.println("Number format exception");
        }catch (Exception ex){
            System.out.println("print exception");
        }finally {
            System.out.println("print finally");
        }

        System.out.println("--------------------");
        new TryCatchFinally().readText();
    }

    public void display() throws Exception{
        System.out.println("Something");
    }

    public void readText(){
        try(Scanner scanner = new Scanner(new File("names.txt"))){
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch (FileNotFoundException fex){
            fex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
