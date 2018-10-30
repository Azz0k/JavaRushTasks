package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        @SuppressWarnings("unchecked")
        ArrayList<String>[] res= new ArrayList[10];
        for (int i = 0; i <10 ; i++) {
            res[i]=new ArrayList<>();
            for (int j = 0; j <5 ; j++) {
                res[i].add("fgf"+i+j);

            }
        }

        return res;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}