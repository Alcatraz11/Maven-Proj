package com.example.demo;

public class FifthThread {
    public static void main(String[] args) {
        MultiThreadCount t1 = new MultiThreadCount(); 
        MultiThreadCount t2 = new MultiThreadCount(); 
        MultiThreadCount t3 = new MultiThreadCount(); 
        MultiThreadCount t4 = new MultiThreadCount(); 
        MultiThreadCount t5 = new MultiThreadCount(); 
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t5.start();
    }
}

