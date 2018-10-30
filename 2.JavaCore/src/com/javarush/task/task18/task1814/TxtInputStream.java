package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    private FileInputStream wrapper;
    public TxtInputStream(String fileName) throws Exception {
        super(fileName);
        wrapper=this;
        if (!fileName.matches(".+\\.txt$"))
        {
            wrapper.close();
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

