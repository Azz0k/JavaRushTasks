package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream=null;
        int min=Integer.MAX_VALUE;
        try {
            fileInputStream=new FileInputStream(reader.readLine());
            while (fileInputStream.available()>0) {
                int tmp=fileInputStream.read();
                min = tmp<min?tmp:min;
            }
            fileInputStream.close();
        }
        catch (Exception e) {}
        System.out.println(min);
    }
}
