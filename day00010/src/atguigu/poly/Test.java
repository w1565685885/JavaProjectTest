package atguigu.poly;

import java.util.Calendar;

/*
封装： 隐藏内部的实现细节 只对外暴露少量的接口 供外界访问
      属性的封装
      方法对功能的封装
      类 对方法的封装  Math
      包 对模块的封装 java.util. Scanner

继承： 实现资源的复用
          方法
          属性

多态：一个对象的多种形态。
作用：可以让代码更加灵活
     看山是山 看水是水
         int age = 10;
         String name = "李白";
     看山不是山 看水不是水


      看山是山 看水是水

实现多态的条件：
  1.有继承

  2.有方法的重写

  3.父类的引用指向子类的对象

多态有两种状态：  左边是编译时状态 = 右边是运行时状态
   编译时状态  运行时状态
   多态创建的对象 能够调用什么方法 要看 编译时状态

   运行时状态：当代码跑起来（右键 run ） 对象是谁

           编译时状态    运行时状态
           Animal ani = new Cat();

           ani.eat(); 表面上看 调用的是 Animal 的eat（）

                      但是因为实际上运行的是 cat对象 所以在执行时 执行的是 cat中eat();


实现多态的条件：
    1.有继承。
    2.有方法的重写。
    3.父类的引用，指向子类的对象。
    4.new的是谁，建立的对象就是谁。
    多态有两种状态，一种是编译是状态，一种是运行时状态。
    左边是编译时状态  右边是运行时状态。
    能够调用那种方法  要看编译时状态，等号左边的类型有那些方法，就可以调用那些方法，
    运行时状态：当代码跑起来，（右键run）对象是谁，就是谁。
    Animal ani = new Cat();
    animal是编译时状态，  cat是运行时状态。
 */
public class Test {

    public static void main(String[] args) {


      Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();

        // Animal ani = new Animal();
        Animal ani = new Cat();
        ani.eat();//子类重写父类的方法    //表面上看调用的是animal方法，实际上是调用的运行时，cat的方法。

        ani.sleep();//从父类继承的方法
//
      //  ani.catchMouse();没有重写的方法不能在子类中调用。
        Animal a = new Dog();
    //    a.lookHome();没有重写的方法不能在子类中调用。
        a.eat();
    }
}
