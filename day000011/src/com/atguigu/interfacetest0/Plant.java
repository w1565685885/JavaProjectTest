package com.atguigu.interfacetest0;

import java.sql.SQLOutput;

/**
 * {DAY}
 * 周三
 * WangYakun
 */
public class Plant implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吸入营养");
    }

    @Override
    public void breathe() {
        System.out.println("吸入二氧化碳，呼出氧气");
    }

    @Override
    public void sleep() {
        System.out.println("植物睡觉了");
    }
}
