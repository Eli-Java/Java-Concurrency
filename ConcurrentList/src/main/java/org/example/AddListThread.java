package org.example;

import java.util.LinkedList;

public class AddListThread implements Runnable{
    String car_type;
    LinkedList<String> l;
    public AddListThread(String car_type, LinkedList<String> l){
        this.car_type = car_type;
        this.l = l;
    }
    @Override
    public void run() {
        l.add(car_type);
    }
}