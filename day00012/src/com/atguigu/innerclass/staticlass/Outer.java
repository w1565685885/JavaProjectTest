package com.atguigu.innerclass.staticlass;


class Outer  {

    int num = 10;
    private static int age = 66;


    public void outerMethod1() {
        System.out.println("this is outerMethod1");
    }

    public static void outerMethod2() {
        System.out.println("this is static outerMethod2");
        System.out.println(Inner.name);
    }

     static class Inner {

        int num = 66;
        static int age = 99;

        static String name = "李白";

        public void innerMethod() {

            // System.out.println(num);

            System.out.println(age);
            outerMethod2();
        }

        public static void innerMethod2(){

            int age = 199;
            System.out.println("局部变量："+age);
            System.out.println("inner:"+Inner.age);
            System.out.println("outer:"+Outer.age);

            System.out.println("this is static innerMethod2");
        }

    }
}

class Animal {
}

class Person {
}
