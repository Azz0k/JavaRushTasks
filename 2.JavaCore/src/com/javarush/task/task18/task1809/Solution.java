package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(fileName1);
        byte[] buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();
        byte[] outputBuffer=buffer.clone();
        for (int i = 0; i <buffer.length ; i++)
            outputBuffer[buffer.length-i-1]=buffer[i];
        FileOutputStream fileOutputStream=new FileOutputStream(fileName2);
        fileOutputStream.write(outputBuffer);
        fileOutputStream.close();
    }
}
