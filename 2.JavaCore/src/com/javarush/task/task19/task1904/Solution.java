package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args)throws Exception {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String s=fileScanner.nextLine();
            Pattern pattern=Pattern.compile("^(.+)\\s(.+)\\s(.+)\\s([0-9]+)\\s([0-9]+)\\s([0-9]+)");
            Matcher matcher=pattern.matcher(s);
            matcher.find();
            String date=String.format("%1$02d %2$s %3$s",Integer.parseInt(matcher.group(4)),matcher.group(5),matcher.group(6));
            SimpleDateFormat sdf=new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            try {
                return new Person(matcher.group(2), matcher.group(3), matcher.group(1), sdf.parse(date));
            }
            catch (ParseException e){}
            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
