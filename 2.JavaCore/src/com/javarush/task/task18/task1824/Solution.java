package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    private static boolean isStopped=false;
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        do {
            Test test=new Test(reader.readLine());
            test.start();
            test.join();
        }while (!isStopped);


    }
    public static class Test extends Thread{
        String fileName;

        public Test(String fileName) {
            super();
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream fileInputStream=new FileInputStream(fileName);
                fileInputStream.close();
            }
            catch (FileNotFoundException e){
                isStopped=true;
                System.out.println(fileName);
            }
            catch (IOException e){}
        }
    }

}
