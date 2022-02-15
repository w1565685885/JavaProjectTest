package com.atguigu.interfacetest3;

/**
 * {DAY}
 * 周三
 * WangYakun
 * 当出现重名的方法  则必须进行重写，否则则报错。
 * 还可以在重写的方法内  通过接口名。super。方法名进行调用，
 */
public class Person implements Study,HardStudy{



    public void study() {
        HardStudy.super.study();
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.study();
    }
}
