package com.atguigu.interfacetest0;

/**
 * {DAY}
 * 周三
 * WangYakun
 */
public class Test {
    public static void main(String[] args) {
        LiveAble animal = new Animal();
        animal.breathe();
        animal.eat();
        animal.sleep();
        LiveAble plant = new Plant();
        plant.breathe();;
        plant.eat();
        plant.sleep();
    }
}
