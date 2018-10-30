package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        String fileName3=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(fileName1);
        int len=0;
        if (fileInputStream.available()%2>0)
            len=fileInputStream.available()/2+1;
        else
             len=fileInputStream.available()/2;
        byte[] buffer=new byte[len];
        fileInputStream.read(buffer);
        FileOutputStream fileOutputStream=new FileOutputStream(fileName2);
        fileOutputStream.write(buffer);
        fileOutputStream.close();
        buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileOutputStream=new FileOutputStream(fileName3);
        fileOutputStream.write(buffer);
        fileOutputStream.close();
        fileInputStream.close();



    }
}
