package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        FileInputStream fileInputStream =new FileInputStream(fileName1);
        byte[] buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();
        String string=new String(buffer);
        Pattern pattern=Pattern.compile("[0-9\\.-]+");
        Matcher matcher=pattern.matcher(string);
        FileOutputStream fileOutputStream=new FileOutputStream(fileName2);
        while (matcher.find())
            fileOutputStream.write((Math.round(Float.parseFloat(matcher.group(0)))+" ").getBytes());
        fileOutputStream.close();
    }
}
