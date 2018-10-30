package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        FileInputStream fileInputStream =new FileInputStream(fileName1);
        byte[] buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();
        FileOutputStream fileOutputStream=new FileOutputStream(fileName1);
        fileInputStream=new FileInputStream(fileName2);
        byte[] buffer1=new byte[fileInputStream.available()];
        fileInputStream.read(buffer1);
        fileInputStream.close();
        fileOutputStream.write(buffer1);
        fileOutputStream.flush();
        fileOutputStream.write(buffer);
        fileOutputStream.close();
    }
}
