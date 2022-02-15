package com.atguigu.object.equals;

import java.util.Objects;

/*

   ==: 比较基本类型 数据 比较的是值
       比较引用数据类型 比较的是地址值

equals:只能比较引用类型数据

equals:如果没有重写  那么使用的就是 Object类中的equals()  Object类中的equals()   比较的是地址值
       如果没有重写   比较的是地址值


重写equals()的目的: 当两个对象的属性完全一样 的时候  就认为俩对象是一个对象。

==比较基本类型  比较的是值，
    比较引用数据类型   比较的是地址值
 equals只能比较引用类型数据
 equals如果没有重写，那么使用的就是object类中的equals方法。 object类中的equals比较的是地址值
 重写equals的目的  当两个对象是一样的时候  我们就默认为是一个对象。

 */
public class EqualsTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a == b);
        Student s1 = new Student(10, 1.3, "张三");
        Student s2 = new Student(10, 1.3, "张三");
        System.out.println(s1 == s2);// false 1   =比较的是地址值
        System.out.println(s1.equals(s2));//false 2    equals比较的也是地址值

        System.out.println("======================================================");

        Student s3 = new Student(10, 1.3, "张三");

        Student s4 = s3;
        boolean flag = s4.equals(s3);
        System.out.println(flag); //true
        Student s5 = null;
        flag = s3.equals(s5);
        System.out.println(flag);//false

        Student s6 = new Student(10, 1.3, "张三");
        System.out.println("----------------------------------------------");
        flag = s3.equals(s6);
        System.out.println(flag);
    }
}

class Student {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.height, height) == 0 && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, name);
    }
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        if (this.getAge() != student.getAge()) return false;

     */
        /*
        以为浮点类型 存储的是约数 不建议使用== 比较浮点类型
        浮点数1==浮点数2 返回 0

        浮点数1>浮点数2 返回正数

        浮点数1< 浮点数2 返回负数

        Double.compare(浮点数1, 浮点数2）

         */
    /*
        if (Double.compare(student.getHeight(), getHeight()) != 0) return false;
        return getName().equals(student.getName());

     */



    /* @Override
    public boolean equals(Object obj) {//Object obj = s6;
        //当比较的两个对象的地址值一样时
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        //因为比较时 要使用 子类独有资源 name  age  height
        Student s = (Student) obj;
        if (this.age == s.age && this.name.equals(s.name) && this.height == s.height) {

            return true;
        }
        return false;

    }*/

    private int age;
    private double height;
    private String name;

    public Student() {
    }


    public Student(int age, double height, String name) {
        this.age = age;
        this.name = name;
        this.height = height;
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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}