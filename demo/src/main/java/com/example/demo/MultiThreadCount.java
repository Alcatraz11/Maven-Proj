package com.example.demo;

public class MultiThreadCount extends Thread{
    @Override
    public void run(){
        for (int i =1;i<=3;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
