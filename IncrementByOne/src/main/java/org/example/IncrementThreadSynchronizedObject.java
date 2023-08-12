package org.example;

import java.util.ArrayList;

public class IncrementThreadSynchronizedObject implements Runnable{
    public static ArrayList<Integer> count = new ArrayList<>();
    @Override
    public void run() {
        synchronized (count){
            count.add(1);
        }
    }
}
