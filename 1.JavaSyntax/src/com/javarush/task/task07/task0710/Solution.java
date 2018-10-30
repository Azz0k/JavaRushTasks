package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings=new ArrayList<>();
        for (int i =0;i<10;i++)
            strings.add(0,scanner.nextLine());
        for (int i =0;i<10;i++)
            System.out.println(strings.get(i));

    }
}
