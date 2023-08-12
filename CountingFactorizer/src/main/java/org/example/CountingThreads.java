package org.example;

import java.util.concurrent.atomic.AtomicLong;

public class CountingThreads implements Runnable{
    public static AtomicLong count = new AtomicLong(0);

    public long getCount(){
        return count.get();
    }
    @Override
    public void run() {
        count.incrementAndGet();
    }
}
