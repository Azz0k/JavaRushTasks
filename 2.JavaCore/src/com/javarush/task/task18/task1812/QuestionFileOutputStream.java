package com.javarush.task.task18.task1812;

import java.io.*;
import java.util.Scanner;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    public AmigoOutputStream wrapper;

    public QuestionFileOutputStream(AmigoOutputStream wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void flush() throws IOException {
        wrapper.flush();
    }

    @Override
    public void write(int b) throws IOException {
        wrapper.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        wrapper.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        wrapper.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().equals("Д"))
            wrapper.close();
    }
}

