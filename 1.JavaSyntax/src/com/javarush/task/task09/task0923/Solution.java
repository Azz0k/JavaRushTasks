package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char[] ch=str.toCharArray();
        String res1="";
        String res2="";
        for (char c:ch)
            if (isVowel(c))
                res1+=Character.toString(c)+" ";
            else
                if (c!=' ')
                    res2+=Character.toString(c)+" ";
        System.out.println(res1);
        System.out.println(res2);
        }





    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}