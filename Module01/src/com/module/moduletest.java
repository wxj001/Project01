package com.module;

import java.util.ArrayList;
import java.util.Date;

public class moduletest {



    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1,"nihao");
        try {
            System.out.println();
            Date date = new Date();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println("list.toString() = " + list.toString());
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            
        }
        for (Object o : list) {
            
        }
        for (Object o : list) {
            
        }


    }

}
