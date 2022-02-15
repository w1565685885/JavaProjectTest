package com.atguigu.object.toString;
/*
如果输出属性名，则会自动调用toString()
不想看相关 地址信息 想看属性信息，需要重写toString（）；


 */
public class Person extends Object{

    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getInfo() {
        return "名字是" + name + " 年龄是" + age + " 身高是" + height;
    }

   /* @Override
    public String toString() {
        return "名字是" + name + " 年龄是" + age + " 身高是" + height;
    }*/
    /*
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';

     */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

