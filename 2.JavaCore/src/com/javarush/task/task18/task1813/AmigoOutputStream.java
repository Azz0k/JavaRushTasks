package com.javarush.task.task18.task1813;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream wrapper;
    public static void main(String[] args) throws Exception {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws Exception {
        super(fileOutputStream.getFD());
        this.wrapper = fileOutputStream;
    }

    @Override
    public void close() throws IOException {
        wrapper.flush();
        wrapper.write("JavaRush © All rights reserved.".getBytes());
        wrapper.close();
    }

    @Override
    public FileChannel getChannel() {
        return wrapper.getChannel();
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
}
