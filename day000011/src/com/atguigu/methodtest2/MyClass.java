package com.atguigu.methodtest2;

class MyClass {
    public void method(Father f) {//Father f = daughter;
        System.out.println("father");
    }

    public void method(Son s) {
        System.out.println("son");
    }
}
class MySub extends MyClass {
    public void method(Father d) {
        System.out.println("sub--");
    }
    public void method(Daughter d) {
        System.out.println("daughter");
    }
}

class Father {
}
class Son extends Father {
}
class Daughter extends Father {
}