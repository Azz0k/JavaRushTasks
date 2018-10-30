package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int indexMax=0;
        int indexMin=0;


        for (int i =0;i<10;i++)
            strings.add(scanner.nextLine());
        int lenghtmin=strings.get(0).length();
        int lenghmax=strings.get(0).length();
        for (int i =1;i<10;i++)
        {
            if (strings.get(i).length()<lenghtmin)
            {
                lenghtmin=strings.get(i).length();
                indexMin=i;
            }
            if (strings.get(i).length()>lenghmax)
            {
                lenghmax=strings.get(i).length();
                indexMax=i;
            }
        }
                    System.out.println(indexMin<indexMax?strings.get(indexMin):strings.get(indexMax));


    }
}
