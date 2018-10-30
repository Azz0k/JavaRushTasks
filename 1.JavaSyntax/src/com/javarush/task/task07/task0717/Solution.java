package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<10;i++)
            list.add(scanner.nextLine());

        ArrayList<String> result = doubleValues(list);
        for (int i=0;i<result.size();i++)
            System.out.println(result.get(i));
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list1= new ArrayList<>();
        for (int i=0;i<list.size();i++)
        {
            list1.add(list.get(i));
            list1.add(list.get(i));
        }
        return list1;
    }
}
