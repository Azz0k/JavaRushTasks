package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws Exception{
        File yourFile = File.createTempFile("your_file_name", null);
        OutputStream outputStream = new FileOutputStream(yourFile);
        InputStream inputStream = new FileInputStream(yourFile);
        Solution savedObject=new Solution(4);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(savedObject);
        objectOutputStream.close();
        outputStream.close();
        Solution loadedObject=new Solution(5);
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        loadedObject=(Solution) objectInputStream.readObject();
        System.out.println(new Solution(4));
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
