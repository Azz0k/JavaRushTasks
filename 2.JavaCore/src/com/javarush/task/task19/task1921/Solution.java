package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception{
        FileReader fileReader=new FileReader(args[0]);
        BufferedReader reader=new BufferedReader(fileReader);
        SimpleDateFormat sdf=new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
        Pattern pattern=Pattern.compile("^(.*?)\\s([0-9\\.\\s]+)");
        Matcher matcher;
        while (reader.ready())
        {
            String line=reader.readLine();
            matcher=pattern.matcher(line);
            if (matcher.find()) {
                PEOPLE.add(new Person(matcher.group(1),sdf.parse(matcher.group(2))));
            }
        }
        fileReader.close();
        reader.close();

    }
}
