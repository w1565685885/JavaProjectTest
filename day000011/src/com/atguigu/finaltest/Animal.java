package com.atguigu.finaltest;
/*
1.final  修饰类时，此类不能被继承。  public final class Animal(){}
2.使用final修饰的方法   子类不能重写
3.final修饰的变量【不仅有成员变量，也有局部变量】是常量  鼓点不点的量   不能再进行赋值。
4.final无论修饰什么变量都会变成常量。
5.final修饰的对象，地址值是不能改变的，也就是不能再重新新建一个对象指针指向另外一个地址

 */

public  class Animal {

   final String name = "Animal";


    public  void eat(){
        System.out.println("吃饭。。。。。");
    }

}

class Dog extends Animal{

    int age;
    String color;

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("小狗吃肉 很开心。。。。");
    }
}
