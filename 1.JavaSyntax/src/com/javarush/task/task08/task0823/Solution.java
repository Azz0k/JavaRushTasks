package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Pattern pattern=Pattern.compile("(?:^|\\s)(\\S)");
        Matcher matcher=pattern.matcher(s);

        //String    res=matcher.replaceAll(el->el.group().toUpperCase());
        String res="";
        int prev=0;
        while (matcher.find()) {


            res += s.substring(prev, matcher.end() - 1) + s.substring(matcher.end() - 1, matcher.end()).toUpperCase();
            prev=matcher.end();
        }
        res+=s.substring(prev);
        System.out.println(res);
        //напишите тут ваш код
    }
}
