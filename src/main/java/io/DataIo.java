package io;

import java.io.*;
import java.util.*;


public class DataIo {

    private FileWriter fw;


    public DataIo(String filename, Boolean append) throws IOException {
        fw = new FileWriter(filename, append);
    }

    public void write(List<Integer> list) throws IOException {
        StringBuilder str = new StringBuilder();
        int index = 0;
        for (int i : list) {
            str.append(i);
            index++;
            if(index != list.size()){
                str.append(",");
            }
        }
        fw.write(str.toString());
    }

    public void write(String str) throws IOException {
        fw.write(str);
    }

    public void close() throws IOException {
        fw.close();
    }
}
