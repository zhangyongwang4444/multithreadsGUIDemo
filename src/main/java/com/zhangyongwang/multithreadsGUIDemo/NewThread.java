package com.zhangyongwang.multithreadsGUIDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class NewThread extends Thread {

    private int index;
    private String str;

    public NewThread(int index, String str) {
        this.index = index;
        this.str = str;
    }

    public void run() {
        try {
            FileOutputStream file = new FileOutputStream("C:\\Users\\34936\\Desktop\\txt\\" + index + ".txt");
            OutputStreamWriter writer = new OutputStreamWriter(file, "UTF-8");
            writer.append(str);
            writer.close();
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
