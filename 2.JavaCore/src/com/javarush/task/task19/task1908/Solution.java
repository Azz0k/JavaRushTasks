package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader=new FileReader(reader.readLine());
        FileWriter fileWriter=new FileWriter(reader.readLine());
        reader.close();
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        StringBuffer stringBuffer=new StringBuffer();
        String sym;
        while ((sym=bufferedReader.readLine())!=null)
            stringBuffer.append(sym);
        Pattern pattern=Pattern.compile("(?:\\b)([0-9]+)(?:\\b)");
        Matcher matcher=pattern.matcher(stringBuffer.toString());
        String res="";
        while (matcher.find())
           res+=matcher.group()+" ";
        bufferedWriter.write(res);
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();


    }
}
