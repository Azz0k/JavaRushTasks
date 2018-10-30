package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        PrintStream printStream=new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(console);
        String str=outputStream.toString();
        Pattern pattern=Pattern.compile("(?:\\b)(\\d+)(?:\\b)");
        Matcher matcherOp=pattern.matcher(str);
        pattern=Pattern.compile("[\\+\\-\\*]");
        Matcher matcherRa=pattern.matcher(str);
        matcherRa.find();
        matcherOp.find();
        int op1=Integer.parseInt(matcherOp.group());
        matcherOp.find();
        int op2=Integer.parseInt(matcherOp.group());
        int res=0;
        switch (matcherRa.group()){
            case "+":res=op1+op2;
                break;
            case "-":res=op1-op2;
                break;
            case "*":res=op1*op2;
                break;

        }
        console.println(str.replaceAll("[\\r\\n]","")+res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

