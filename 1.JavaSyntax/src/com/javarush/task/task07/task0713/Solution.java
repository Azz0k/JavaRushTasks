package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listall= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        for (int i=0;i<20;i++)
        {
            int temp = scanner.nextInt();
            listall.add(temp);
            if ((temp%3==0) || (temp%2 ==0)) {
                if (temp % 3 == 0)
                    list3.add(temp);
                if (temp % 2 == 0)
                    list2.add(temp);

            }
            else list.add(temp);

        }
        printList(list3);
        printList(list2);
        printList(list);

    }

    public static void printList(List<Integer> list) {
        for (int i=0; i<list.size();i++)
            System.out.println(list.get(i));
    }
}
