package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        FileInputStream fileInputStream=new FileInputStream(fileName);
        load(fileInputStream);

    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop=new Properties();
        prop.putAll(properties);
        prop.save(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop=new Properties();
        prop.load(inputStream);
        properties.clear();
        for (Object key:prop.keySet())
            properties.put((String)key,prop.getProperty((String)key));

    }

    public static void main(String[] args) {

    }
}
