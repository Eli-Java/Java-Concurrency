package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int numOfThreads = 5042;
        ArrayList<Thread> threadList = new ArrayList<>();
        for (int i=0; i < numOfThreads; i++){
            //threadList.add(new Thread(new IncrementThreadSynchronizedObject()));
            threadList.add(new Thread(new IncrementThreadUsingLocks()));
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

        //System.out.println(IncrementThreadSynchronizedObject.count.size());
        System.out.println(IncrementThreadUsingLocks.count);
    }
}