package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=bufferedReader.readLine();
        String fileName2=bufferedReader.readLine();
        String fileName3=bufferedReader.readLine();
        FileOutputStream fileOutputStream=new FileOutputStream(fileName1);
        FileInputStream fileInputStream=new FileInputStream(fileName2);
        byte [] buffer =new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileOutputStream.write(buffer);
        fileOutputStream.flush();
        fileInputStream.close();
        fileInputStream=new FileInputStream(fileName3);
        buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileOutputStream.write(buffer);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
