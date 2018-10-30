package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console=System.out;
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        Pattern pattern=Pattern.compile(".+");
        Matcher matcher=pattern.matcher(byteArrayOutputStream.toString());
        StringBuffer stringBuffer=new StringBuffer();
        int counter=0;
        while (matcher.find())
        {
            counter++;
            stringBuffer.append(matcher.group()).append( System.lineSeparator());
            if (counter%2==0)
                stringBuffer.append("JavaRush - курсы Java онлайн").append( System.lineSeparator());
        }
        System.setOut(console);
        System.out.print(stringBuffer.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
