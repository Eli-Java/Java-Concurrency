package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Thread> threadList = new ArrayList<>();
        int numOfThreads = 5000;
        for (int i=0; i<numOfThreads; i++){
            threadList.add(new Thread(new IncrementThread()));
        }

        for (Thread t : threadList){
            t.start();
        }
        for (Thread t : threadList){
            t.join();
        }

        System.out.println(IncrementThread.num);
    }
}