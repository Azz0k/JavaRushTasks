package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
         class Container{
             public boolean isNumber;
             public int Link;

        }
        Container[] containers=new Container[array.length];
         Integer[] numbers=new Integer[array.length];
         int maxNumbers=0;
         String[] strings=new String[array.length];
         int maxStr=0;
        for (int i = 0; i <array.length ; i++) {
            if (isNumber(array[i]))
            {
                numbers[maxNumbers]=Integer.parseInt(array[i]);
                containers[i]=new Container();
                containers[i].isNumber=true;
                containers[i].Link=maxNumbers;
                maxNumbers++;
            }
            else {
                strings[maxStr]=array[i];
                containers[i]=new Container();
                containers[i].isNumber=false;
                containers[i].Link=maxStr;
                maxStr++;
            }

        }
        numbers= Arrays.copyOf(numbers,maxNumbers);
        strings=Arrays.copyOf(strings,maxStr);
        Arrays.sort(strings);
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int i = 0; i <array.length ; i++) {
            array[i]=containers[i].isNumber?""+numbers[containers[i].Link]:strings[containers[i].Link];

        }
        isGreaterThan(array[0],array[1]);
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
