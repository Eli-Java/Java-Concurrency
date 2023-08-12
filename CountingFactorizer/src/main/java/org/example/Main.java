package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        int numOfThreads = 5;
        for (int i=0; i < numOfThreads; i++){
            threadList.add(new Thread(new CountingThreads()));
        }

        for (Thread t: threadList){
            t.start();
        }

        for (Thread t:threadList){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(CountingThreads.count);
    }
}