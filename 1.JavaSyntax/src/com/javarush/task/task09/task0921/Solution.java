package com.javarush.task.task09.task0921;

import javafx.beans.binding.When;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        try {


            while (true) {
                list.add(Integer.parseInt(scanner.nextLine()));
            }
        }
        catch (Exception e)
        {
            list.forEach(integer -> System.out.println(integer));
        }
    }
}
