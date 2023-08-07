package org.example;

public class IncrementThread implements Runnable {
    public static int num = 20;
    public IncrementThread(){

    }
    @Override
    public void run() {
        num ++;
    }
}
