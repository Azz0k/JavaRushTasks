package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args)throws Exception {
        FileReader fileReader=new FileReader(args[0]);
        FileWriter fileWriter=new FileWriter(args[1]);
        BufferedReader reader=new BufferedReader(fileReader);
        StringBuffer stringBuffer=new StringBuffer();
        while (reader.ready()){
            String line=reader.readLine();
            Pattern pattern=Pattern.compile("[^\\s]+",Pattern.DOTALL);
            Matcher matcher=pattern.matcher(line);
            while (matcher.find()){
                if (matcher.group().length()>6)
                    stringBuffer.append(matcher.group()).append(",");
            }
        }
        fileWriter.write(stringBuffer.toString().substring(0,stringBuffer.toString().length()-1));
        fileReader.close();
        fileWriter.close();
        reader.close();
    }
}
