package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();

    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=null;
        String fileName2=null;
        FileReader fileReader1=null;
        FileReader fileReader2=null;
        BufferedReader fileBufferedReader1=null;
        BufferedReader fileBufferedReader2=null;
        String tempString=null;
        try {
            fileName1=reader.readLine();
            fileName2=reader.readLine();
            fileReader1=new FileReader(fileName1);
            fileReader2=new FileReader(fileName2);
            fileBufferedReader1=new BufferedReader(fileReader1);
            fileBufferedReader2=new BufferedReader(fileReader2);
            //allLines = Files.readAllLines(Paths.get(bufferedReader.readLine()));
            while ((tempString=fileBufferedReader1.readLine())!=null){
                allLines.add(tempString);

            }
            while ((tempString=fileBufferedReader2.readLine())!=null){
                forRemoveLines.add(tempString);
            }
            fileBufferedReader1.close();
            fileBufferedReader2.close();
            fileReader1.close();
            fileReader2.close();
        }
        catch (Exception e)
        {}
        try {
            new Solution().joinData();
        }
        catch (CorruptedDataException e){}

    }

    public  void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);

        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }


    }
}
