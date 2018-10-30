package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args)throws Exception {
        FileReader fileReader=new FileReader(args[0]);
        BufferedReader reader=new BufferedReader(fileReader);
        HashMap<String,Double> map=new HashMap<>();
        Pattern pattern=Pattern.compile("^(.*?)\\s([0-9\\.\\-]+)");
        Matcher matcher;
        while (reader.ready())
        {
            String line=reader.readLine();
            matcher=pattern.matcher(line);
            if (matcher.find()) {
                if (map.containsKey(matcher.group(1))) {
                    Double temp = map.remove(matcher.group(1));
                    temp += Double.parseDouble(matcher.group(2));
                    map.put(matcher.group(1), temp);
                } else
                    map.put(matcher.group(1), Double.parseDouble(matcher.group(2)));
            }
        }
        fileReader.close();
        reader.close();
        TreeMap<String,Double> tmap=new TreeMap<>();
        tmap.putAll(map);
        tmap.forEach((key,val)->{System.out.println(key+" "+val);});

    }
}
