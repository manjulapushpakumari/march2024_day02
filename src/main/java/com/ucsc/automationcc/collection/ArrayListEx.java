package com.ucsc.automationcc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList();
        nameList.add("Sanath");
        nameList.add("Ridmi");
        nameList.add("Dinushi");

//        for(String str : nameList){
//            System.out.println(str);
//        }

        Iterator iterator = nameList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
