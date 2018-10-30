package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader=new FileReader(reader.readLine());
        reader.close();
        reader=new BufferedReader(fileReader);
        while (reader.ready()){
            StringBuffer sb=new StringBuffer(reader.readLine());
            sb.reverse();
            System.out.println(sb.toString());
        }
        reader.close();
        fileReader.close();

    }
}
