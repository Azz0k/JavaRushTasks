package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map=new HashMap<>();
        map.put("january","1");
        map.put("february","2");
                map.put("march","3");
                        map.put("april","4");
                                map.put("may","5");
                                        map.put("june","6");
                                                map.put("july","7");
                                                        map.put("august","8");
                                                                map.put("september","9");
                                                                        map.put("october","10");
                                                                                map.put("november","11");
                                                                                        map.put("december","12");
                                                                                        Scanner scanner=new Scanner(System.in);
                                                                                        String str=scanner.nextLine();
                                                                                        System.out.println(str+" is the "+map.get(str.toLowerCase())+" month");
    }
}
