package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws  Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName=reader.readLine()).equals("exit")){
            ReadThread readThread=new ReadThread(fileName);
            readThread.start();
        }

    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            super();
            this.fileName=fileName;
        }

        @Override
        public void run()  {
            FileInputStream fileInputStream=null;
            byte[] buffer=new byte[1];
            try {
                fileInputStream = new FileInputStream(fileName);
                buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                fileInputStream.close();
            }
            catch (Exception e){}
            HashMap<Byte,Integer> map=new HashMap<>();
            int max=0;
            byte index=0;
            for (int i = 0; i <buffer.length ; i++) {
                if (map.containsKey(buffer[i]))
                {
                    int temp=map.remove(buffer[i]);
                    map.put(buffer[i],++temp);
                    if (temp>max){
                        index=buffer[i];
                        max=temp;
                    }
                }
                else
                    map.put(buffer[i],1);
            }
            synchronized (resultMap){
                resultMap.put(fileName,new Integer(index));
            }



        }
    }
}
