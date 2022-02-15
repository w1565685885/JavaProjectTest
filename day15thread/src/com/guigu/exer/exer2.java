package com.guigu.exer;

import org.junit.Test;

import java.util.Scanner;

/**
 * {DAY}
 * 周二
 * WangYakun
 */
public class exer2 {
    @Test
    public void main(String[] args) throws InterruptedException {
        PrintRunnable printRunnable = new PrintRunnable();
        Thread T1 = new Thread(printRunnable, "自定义线程");
        T1.start();
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {

                T1.join();
            }

            System.out.println(Thread.currentThread().getName() + "--->  " + i);
        }

    }

    class PrintRunnable implements Runnable {
        Scanner in = new Scanner(System.in);

        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "是否结束？Y/y");
                String result = in.next();
                if (result.equals("Y") || result.equals("y")) {
                    break;
                }
            }
        }
    }
}

