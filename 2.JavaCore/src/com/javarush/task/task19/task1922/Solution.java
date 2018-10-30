package com.javarush.task.task19.task1922;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=reader.readLine();
        FileReader fileReader=new FileReader(fileName);
        reader.close();
        reader=new BufferedReader(fileReader);
        while (reader.ready()){
            String line=reader.readLine();
            int counter=0;
            for (String s:words){
                Pattern pattern=Pattern.compile("\\b"+s+"\\b");
                Matcher matcher=pattern.matcher(line);
                if (matcher.find())
                    counter++;
            }
            if (counter==2)
                System.out.print(line);
        }
        reader.close();
        fileReader.close();

    }
}
