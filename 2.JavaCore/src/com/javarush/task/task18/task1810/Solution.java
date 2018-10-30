package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception,DownloadException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        int len;
        FileInputStream fileInputStream;
        while (true){
            fileName=reader.readLine();
            fileInputStream=new FileInputStream(fileName);
            len=fileInputStream.available();
            fileInputStream.close();
            if (len<1000)
                throw new DownloadException();
        }

    }

    public static class DownloadException extends Exception {

    }
}
