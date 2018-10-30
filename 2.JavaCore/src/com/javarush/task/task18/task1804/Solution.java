package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Integer> map=new HashMap<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream=null;

        try {
            fileInputStream=new FileInputStream(reader.readLine());
            while (fileInputStream.available()>0) {
                int tmp=fileInputStream.read();
                if (map.containsKey(tmp))
                    map.put(tmp,map.remove(tmp)+1);
                else
                    map.put(tmp,1);
            }
            fileInputStream.close();
        }
        catch (Exception e) {}
        Integer min=Integer.MAX_VALUE;
        for (Integer i:map.keySet()){
            if (map.get(i)<min)
                min=map.get(i);
        }
        for (Integer i:map.keySet()){
            if (min.equals(map.get(i)))
                System.out.print(i+" ");
        }




    }
}
