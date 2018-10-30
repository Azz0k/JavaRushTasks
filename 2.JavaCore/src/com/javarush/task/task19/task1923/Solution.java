package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileReader fileReader=new FileReader(args[0]);
        FileWriter fileWriter=new FileWriter(args[1]);
        BufferedReader reader=new BufferedReader(fileReader);


        while (reader.ready())
        {
            String line=reader.readLine();
            Pattern pattern =Pattern.compile("\\b\\S*\\d+\\S*\\b");
            Matcher matcher=pattern.matcher(line);
            while (matcher.find()){
                 fileWriter.write(matcher.group() + " ");

                }
            }





        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
