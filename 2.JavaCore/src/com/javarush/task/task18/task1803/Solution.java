package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые частые байты
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
        Integer max=0;
        for (Integer i:map.keySet()){
            if (map.get(i)>max)
                max=map.get(i);
        }
        for (Integer i:map.keySet()){
            if (max.equals(map.get(i)))
                System.out.print(i+" ");
        }




    }
}
