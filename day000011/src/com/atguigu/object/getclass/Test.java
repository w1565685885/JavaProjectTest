package com.atguigu.object.getclass;
/*

getClass： 获取运行时类型   //获取运行时候的类型。getClass  能看清运行时候的这个方法是啥种类型。

      多态创建的哪一个实际对象
 */
public class Test {

    public static void main(String[] args) {

        Animal ani = new Dog();

        Class aClass = ani.getClass();

        System.out.println(aClass);


        Animal animal = new Cat();

        System.out.println(animal.getClass());

    }
}

