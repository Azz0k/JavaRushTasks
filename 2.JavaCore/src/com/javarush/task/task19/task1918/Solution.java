package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader=new FileReader(reader.readLine());
        reader.close();
        reader=new BufferedReader(fileReader);
        StringBuffer sb=new StringBuffer();

        while (reader.ready())
                    sb.append(reader.readLine());
        fileReader.close();
        reader.close();
        Pattern pattern=Pattern.compile("(<"+args[0]+")|(</"+args[0]+">)",Pattern.MULTILINE+Pattern.DOTALL);
        Matcher matcher=pattern.matcher(sb.toString());
        ArrayList<Tag> tags=new ArrayList<>();
        int index=0;
        int balance=0;
        while (matcher.find())
        {
            if (balance==0)
                index=tags.size();
            if (matcher.group(0).equals("<"+args[0]))
            {
                tags.add(index,new Tag(matcher.start()));
                index++;
                balance++;
            }
            else
            {
                index--;
                balance--;
                tags.get(index).end=matcher.end();
            }
        }
        for (Tag tag:tags)
            System.out.println(sb.toString().substring(tag.start,tag.end));
    }
    public static class Tag{
        public int start;
        public int end;

        public Tag(int start) {
            this.start = start;
        }

    }

}
