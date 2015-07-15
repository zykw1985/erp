package com.xf;

class Parent{
	int age=10;
	
	public void test(){
		System.out.println(age);
	}
}

class Son extends Parent{
	int age=20;
	
	public void test(){
		System.out.println(this.age);
	}
}

public class ExtendsDemo {

	public static void main(String[] args) {
		Parent p=new Son();
		p.test();
		System.out.println(p.age);
	}

}
