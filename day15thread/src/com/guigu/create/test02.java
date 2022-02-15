package com.guigu.create;

/**
 * {DAY}
 * 周一
 * WangYakun
 */
public class test02 {
    public static void main(String[] args) {


        new Thread(){
            @Override
            public void run() {
                while(true) {
                    System.out.println("乌龟跑。。。。。。。。。。。。。。。。。。。");
                }
            }
        }.start();

        new Thread(){ //创建了一个匿名子类。
            @Override
            public void run() {
                while (true){
                System.out.println("兔子跑..............");}
            }
        }.start();
    }
}
