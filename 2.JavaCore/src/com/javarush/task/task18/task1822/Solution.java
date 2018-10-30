package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cReader=new BufferedReader(new InputStreamReader(System.in));
        String fileName=cReader.readLine();
        FileReader fileReader=new FileReader(fileName);
        BufferedReader reader=new BufferedReader(fileReader);
        String line;
        Pattern pattern=Pattern.compile("^"+args[0]+"\\s");

        while (!(line=reader.readLine()).isEmpty())
        {
            Matcher matcher=pattern.matcher(line);
            if (matcher.find())
            {
                System.out.println(line);
                break;
            }
        }
        reader.close();
        cReader.close();
    }
}
