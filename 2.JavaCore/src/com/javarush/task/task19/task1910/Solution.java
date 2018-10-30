package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
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
        bufferedWriter.write(stringBuffer.toString().replaceAll("\\p{Punct}",""));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
        fileReader.close();
        fileWriter.close();
    }
}
