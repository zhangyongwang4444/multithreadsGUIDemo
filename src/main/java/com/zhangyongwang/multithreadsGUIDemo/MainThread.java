package com.zhangyongwang.multithreadsGUIDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainThread {
    public static void main(String args[]) throws IOException {
        int index = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;


        do {
            str = reader.readLine();
            Thread thread = new NewThread(index, str);
            thread.start();
            index++;
        } while (!str.equals("end"));
    }
}
