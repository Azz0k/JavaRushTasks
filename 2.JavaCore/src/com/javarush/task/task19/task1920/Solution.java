package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileReader fileReader=new FileReader(args[0]);
        BufferedReader reader=new BufferedReader(fileReader);
        HashMap<String,Double> map=new HashMap<>();
        Pattern pattern=Pattern.compile("^(.*?)\\s([0-9\\.\\-]+)");
        Matcher matcher;
        double max=Double.MIN_VALUE;
        while (reader.ready())
        {
            String line=reader.readLine();
            matcher=pattern.matcher(line);
            if (matcher.find()) {
                if (map.containsKey(matcher.group(1))) {
                    Double temp = map.remove(matcher.group(1));
                    temp += Double.parseDouble(matcher.group(2));
                    map.put(matcher.group(1), temp);
                    if (temp>max)
                        max=temp;
                } else{
                    Double  temp = Double.parseDouble(matcher.group(2));
                    map.put(matcher.group(1), temp);
                    if (temp>max)
                        max=temp;
                }
            }
        }
        fileReader.close();
        reader.close();
        TreeSet<String> treeSet=new TreeSet<>();
        for (String string:map.keySet())
            if (map.get(string)==max)
               treeSet.add(string);
        treeSet.forEach((key)->{System.out.println(key);});
    }
}
