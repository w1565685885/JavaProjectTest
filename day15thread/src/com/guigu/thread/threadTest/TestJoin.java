package com.guigu.thread.threadTest;

/**
 * {DAY}
 * 周二
 * WangYakun
 * 插队的线程 调用join方法。
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
RabbitRunnable rabbitRunnable = new RabbitRunnable();
Thread t1 = new Thread(rabbitRunnable,"小兔子线程");
        t1.start();
        for (int i = 0; i < 100; i++) {
            if (i == 10){
            t1.join(1000);
            }
            System.out.println("主线程跑"+i);}
    }
}

class RabbitRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"跑的飞快。。。。。/t"+i);

        }

    }
}