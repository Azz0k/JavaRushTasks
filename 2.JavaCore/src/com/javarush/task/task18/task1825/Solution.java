package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        TreeSet<String> set=new TreeSet<>();
        while (!(fileName=reader.readLine()).equals("end")){
            set.add(fileName);
        }
        Pattern pattern=Pattern.compile("^(.*?)\\.part");
        Matcher matcher=pattern.matcher(set.first());
        matcher.find();
        FileOutputStream fileOutputStream=new FileOutputStream(matcher.group(1));
        for (String str:set){
            FileInputStream fileInputStream=new FileInputStream(str);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileOutputStream.write(buffer);
            fileOutputStream.flush();
            fileInputStream.close();

        }
        fileOutputStream.close();
    }
}
