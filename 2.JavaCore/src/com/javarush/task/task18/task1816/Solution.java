package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {

        String fileName=args[0];
        FileInputStream fileInputStream=new FileInputStream(fileName);
        byte[] buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        String string=new String(buffer);
        fileInputStream.close();

        Pattern pattern=Pattern.compile("[a-zA-Z]");
        Matcher matcher=pattern.matcher(string);
        int count=0;
        while (matcher.find())
            count++;
        System.out.println(count);

    }
}
