package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader=new FileReader(reader.readLine());
        int sym;
        StringBuffer stringBuffer=new StringBuffer();
        while ((sym=fileReader.read())!=-1)
            stringBuffer.append((char)sym);
        Pattern pattern=Pattern.compile("(?:\\b)(world)(?:\\b)",Pattern.DOTALL+Pattern.MULTILINE);
        Matcher matcher=pattern.matcher(stringBuffer.toString());
        int count=0;
        while (matcher.find())
            count++;
        System.out.println(count);
        fileReader.close();
        reader.close();
    }
}
