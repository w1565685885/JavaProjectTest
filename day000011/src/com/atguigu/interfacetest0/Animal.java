package com.atguigu.interfacetest0;

import java.sql.SQLOutput;

/**
 * {DAY}
 * 周三
 * WangYakun
 */
public class Animal implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void breathe() {
        System.out.println("吸入氧气 呼出二氧化碳");

    }

    @Override
    public void sleep() {
        System.out.println("闭上眼睛睡觉");
    }
}
