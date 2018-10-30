package com.javarush.task.task19.task1924;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
        }

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader=new FileReader(reader.readLine());
        //InputStreamReader fileReader=new InputStreamReader(new FileInputStream(reader.readLine()), StandardCharsets.UTF_8);
        reader.close();
        reader=new BufferedReader(fileReader);
        while (reader.ready()){
            String line=reader.readLine();
            Pattern pattern=Pattern.compile("\\b(0|1|2|3|4|5|6|7|8|9|10|11|12){1}\\b");
            Matcher matcher=pattern.matcher(line);
            StringBuffer sb=new StringBuffer();
            while (matcher.find())
            {
                matcher.appendReplacement(sb,map.get(Integer.parseInt(matcher.group())));
            }
            matcher.appendTail(sb);
            System.out.println(sb.toString());
        }
        fileReader.close();
        reader.close();
    }
}
