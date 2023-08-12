package org.example;

public class IncrementThreadNotThreadSafe implements Runnable{
    public static int count = 0;

    @Override
    public void run() {
        count += 1;
    }
}
