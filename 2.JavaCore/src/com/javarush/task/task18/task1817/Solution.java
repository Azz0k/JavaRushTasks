package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        String fileName=args[0];
        FileInputStream fileInputStream=new FileInputStream(fileName);
        int fileSize=fileInputStream.available();
        byte[] buffer=new byte[fileSize];
        fileInputStream.read(buffer);
        String string=new String(buffer);
        fileInputStream.close();

        Pattern pattern=Pattern.compile("[\\s]");
        Matcher matcher=pattern.matcher(string);
        int count=0;
        while (matcher.find())
            count++;
        System.out.printf("%.2f",100.0*count/string.length());
    }
}
