package com.thread.extendsthread;

public class RabbitThread extends Thread {


    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"  跑");
        }
    }
}
