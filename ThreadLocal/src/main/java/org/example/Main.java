package org.example;

public class Main{
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 4);

    public static void main(String[] args) {
        Runnable task = () -> {
            int threadId = (int) Thread.currentThread().getId();
            int value = threadLocalValue.get();
            threadLocalValue.set(value + 1); // Increment the thread-local value by 1
            System.out.println("Thread " + threadId + ": Value = " + threadLocalValue.get());
        };

        // Create multiple threads to demonstrate thread-local behavior
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
