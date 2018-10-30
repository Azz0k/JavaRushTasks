package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws  Exception{
        byte key=68;
        switch (args[0]){
            case "-e":

            case "-d":
                FileInputStream fileInputStream =new FileInputStream(args[1]);
                FileOutputStream fileOutputStream=new FileOutputStream(args[2]);
                byte [] bytes=new byte[fileInputStream.available()];
                fileInputStream.read(bytes);
                for (int i = 0; i <bytes.length ; i++) {
                    bytes[i]^=key;
                }
                fileOutputStream.write(bytes);
                fileInputStream.close();
                fileOutputStream.close();
                break;

        }
    }

}
