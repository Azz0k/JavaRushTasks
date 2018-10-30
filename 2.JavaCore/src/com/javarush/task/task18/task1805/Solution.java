package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> set=new HashSet<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream=null;

        try {
            fileInputStream=new FileInputStream(reader.readLine());
            while (fileInputStream.available()>0) {
                int tmp=fileInputStream.read();
                if (!set.contains(tmp))
                    set.add(tmp);

            }
            fileInputStream.close();
        }
        catch (Exception e) {}
        Integer[] arr=set.toArray(new Integer[set.size()]);
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
