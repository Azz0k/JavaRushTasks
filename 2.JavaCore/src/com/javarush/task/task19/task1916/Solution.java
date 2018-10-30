package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName1=reader.readLine();
        String fileName2=reader.readLine();
        reader.close();
        ArrayList<String> file1=new ArrayList<>();
        ArrayList<String> file2=new ArrayList<>();
        FileReader fileReader1=new FileReader(fileName1);
        FileReader fileReader2=new FileReader(fileName2);
        String line="";
        reader=new BufferedReader(fileReader1);
        while (reader.ready())
        {
            line=reader.readLine();
            file1.add(line);
        }
        reader=new BufferedReader(fileReader2);
        while (reader.ready())
        {
            line=reader.readLine();
            file2.add(line);
        }
        int indexFile1=0;
        int indexFile2=0;
        do {
            if (indexFile1==file1.size() && indexFile2<file2.size())
            {
                lines.add(new LineItem(Type.ADDED,file2.get(indexFile2)));
                break;
            }
            else
                if (indexFile2==file2.size() && indexFile1<file1.size()){
                    lines.add(new LineItem(Type.REMOVED,file1.get(indexFile1)));
                    break;
                }
            else
                if (indexFile1==file1.size() && indexFile2==file2.size())
                    break;
                else
            if (file1.get(indexFile1).equals(file2.get(indexFile2))) {
                lines.add(new LineItem(Type.SAME, file1.get(indexFile1)));
                indexFile1++;
                indexFile2++;
            }
            else
                if (indexFile2+1<file2.size() && file1.get(indexFile1).equals(file2.get(indexFile2+1))){
                    lines.add(new LineItem(Type.ADDED,file2.get(indexFile2)));
                    indexFile2++;
                }
            else
                if (indexFile1+1<file1.size() && file1.get(indexFile1+1).equals(file2.get(indexFile2))){
                    lines.add(new LineItem(Type.REMOVED,file1.get(indexFile1)));
                    indexFile1++;
                }

        }while (true);
        fileReader1.close();
        fileReader2.close();
        reader.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
