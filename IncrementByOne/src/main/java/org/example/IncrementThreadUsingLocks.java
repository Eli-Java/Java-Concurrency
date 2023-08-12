package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class IncrementThreadUsingLocks implements  Runnable {
    public static int count = 0;
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lock();
            count++;
        } finally {
            lock.unlock();
        }
    }
}
