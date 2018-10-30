package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list= new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<10;i++)
            list.add(scanner.nextLine());
        int len=list.get(0).length();
        int index=0;
        for (int i=1;i<10;i++)
            if (list.get(i).length()>=len)
                len=list.get(i).length();
            else
            {
                System.out.println(i);
                break;
            }
    }
}

