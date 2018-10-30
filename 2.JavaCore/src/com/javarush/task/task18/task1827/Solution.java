package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        if (args.length>3 && args[0].toLowerCase().equals("-c"))
        {
            LinkedList<String> list=new LinkedList<>();
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String fileName=reader.readLine();
            FileInputStream fileInputStream =new FileInputStream(fileName);
            byte[] bytes=new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            String s=new String(bytes);
            s=s.replaceAll("[\\r]"," ");
            s=s.replaceAll("[\\n]","");
            for (int i = 0; i <s.length()/50 ; i++) {
                list.addLast(s.substring(50*i,50*i+50)+"\n");
            }


            fileInputStream.close();
            int max=0;
            for (String lastLine:list) {
                int iD = Integer.parseInt(lastLine.substring(0, 8).replaceAll("\\s", ""));
                if (iD>max)
                    max=iD;

            }
            String argums="";
            for (int i = 1; i <args.length ; i++) {
                argums+=args[i]+" ";
            }
            Pattern pattern=Pattern.compile("^(.+?)\\s([0-9\\.]+?)\\s([0-9]+?)\\s");
            Matcher matcher=pattern.matcher(argums);
            matcher.find();
            String nextLine=String.format("%-8s",""+(++max))+String.format("%-30s",matcher.group(1))+String.format("%-8s",matcher.group(2))+String.format("%-4s",matcher.group(3))+"\n";
            list.addLast(nextLine);
            FileOutputStream fileOutputStream=new FileOutputStream(fileName);
            for (String s1:list)
                fileOutputStream.write(s1.getBytes());
            fileOutputStream.close();
            reader.close();


        }
    }
}
