package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int [] arr1=new  int[5];
        for (int i = 0; i <5 ; i++)
            arr1[i]=i;
        int [] arr2=new  int[2];
        for (int i = 0; i <2 ; i++)
            arr2[i]=i;
        int [] arr3=new  int[4];
        for (int i = 0; i <4 ; i++)
            arr3[i]=i;
        int [] arr4=new  int[7];
        for (int i = 0; i <7 ; i++)
            arr4[i]=i;
        int [] arr5=new  int[0];
        ArrayList<int []> res=new ArrayList<>();
        res.add(arr1);
        res.add(arr2);
        res.add(arr3);
        res.add(arr4);
        res.add(arr5);
        return res;


    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
