package com.atguigu.object;

import com.atguigu.finaltest.Animal;

/*
Objcet 是所有类的直接或者间接父类

       如果一个类没有显示的继承另一个类 那么默认继承自Object类

       数组的父亲也是Object
objcet是一切类的直接或者间接父类。
    如果一个类没有显示继承其他的类那么默认继承objcet类

 */
public class ObjectTest {
    public static void main(String[] args) {

        Object obj = new Object();

        Animal ani = new Animal();


        int[] arr = {};

        arr.hashCode();
    }
}
