package com.xf;

abstract class Demo8{
	final public  void m(){
		
	}
	
	abstract public  void t();
	
	public static final   void p(){
		
	}
}

class MyClass {
	final int value;

	public MyClass() {
		value=20;
	}

	public MyClass(int value) {
		this.value=value;
	}
	
	public void changeValue(int value){
		value = value * 2;
		System.out.println(value);
	}
}

public class Demo3 {

}
