package com.guigu.create;

/**
 * {DAY}
 * 周一
 * WangYakun
 * 使用实现的方式 创建多线程
 * 1.创建一个类 实现 Runnable接口。
 * 2.重写 run方法。
 * 3.创建Runnable方法，
 * 4.创建Thread对象，将Runnable对象，作为参数进行传递。
 * 5.调用start()方法 启动线程。
 *
 * 继承的方式与实现的方式做对比
 *  1.继承的方式简单
 *  2.实现的方式可以更好的资源共享。
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建runnable对象
        RabbitRunable rabbitRunable = new RabbitRunable();
        //创建thread 类，将rabbitrunnable对象作为参数进行传递。
        Thread t1 = new  Thread(rabbitRunable);
        t1.start();//开启线程。
        /*
        while (true){

            System.out.println("乌龟跑");
        }
         */
        Tortisethread tortisethread = new Tortisethread();
        tortisethread.start();
    }
}


class Tortisethread extends  Thread{

    @Override
    public void run() {
        while ( true){
            System.out.println("乌龟跑。。。。。");
        }
    }
}
