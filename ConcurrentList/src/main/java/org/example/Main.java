package org.example;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        Thread t1 = new Thread(new AddListThread("Volvo", cars));
        Thread t2 = new Thread(new AddListThread("BMW", cars));
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(cars);
    }
}