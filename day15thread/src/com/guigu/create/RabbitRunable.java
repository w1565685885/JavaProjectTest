package com.guigu.create;

/**
 * {DAY}
 * 周一
 * WangYakun
 */
public class RabbitRunable implements  Runnable{
    int a = 10;

    @Override
    public void run() {
        while (true){
            System.out.println("兔子跑");
            System.out.println("a = " + a);
        }

    }
}
