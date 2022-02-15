package com.atguigu.methodtest;

public class TestOverload {
	public static void main(String[] args) {
		//多态
		MyClass my = new MySub();

		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();
		MySub mySub = new MySub();

	//	my.method(f);//father

		//my.method(s);//son
		my.method(d);//father
		mySub.method(d);
	}
}