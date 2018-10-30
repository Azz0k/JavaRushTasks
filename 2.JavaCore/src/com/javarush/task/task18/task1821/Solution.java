package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args)throws Exception {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte[] buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();
        String string=new String(buffer);
        HashMap<String,Integer> hMap=new HashMap<>();
        TreeMap<String,Integer> tMap=new TreeMap<>();
        for (int i = 0; i <string.length() ; i++) {
            String temp=string.substring(i,i+1);
            if (hMap.containsKey(temp))
            {
                int count=hMap.remove(temp);
                hMap.put(temp,++count);
                }
            else
                    hMap.put(temp,1);
        }
        tMap.putAll(hMap);
        tMap.forEach((key,val)->{
            System.out.println(key+" "+val);
        });

    }
}
