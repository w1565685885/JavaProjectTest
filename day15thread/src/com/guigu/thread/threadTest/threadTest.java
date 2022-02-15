package com.guigu.thread.threadTest;

/**
 * {DAY}
 * 周一
 * WangYakun
 *
 *
 * isAlive :判断当前线程是否处于活动状态。
 * 可能会被执行的概率。
 * 如果没有指定线程优先级 线程的优先级都是5
 * 先去执行优先级高的  再去执行优先级低的。
 * thread.sleep(): 让当前线程 睡眠一段时间。单位是ms
 *
 */
public class threadTest {
    public static void main(String[] args) {
        /*
    RabbitThread r1 = new RabbitThread("小灰兔兔子线程");
    r1.setName("小白白兔子线程");
    RabbitThread r2 = new RabbitThread("小白兔兔子线程");
    r1.start();
    r2.start();

         */
        TortiseRunnable t1 = new TortiseRunnable();
        Thread thread = new Thread(t1);
        thread.setName("小兔子线程");
        thread.start();
        thread.isAlive();//判断当前线程是否处于活跃状态。
        thread.setPriority(100);

    }
}

class  RabbitThread extends Thread{
    public RabbitThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this.getName()+"兔子在跑");
        }
    }
}
class  TortiseRunnable implements Runnable{

//要有一个类实现Runable接口

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                //run方法中的异常，只能使用try catch进行处理因为子类不能抛出比父类更
                //子类不能抛出比父类更大的异常，而且子类没有抛出异常。
                //runable中的run方法没有抛出异常。
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"小兔子");
        }
    }
}