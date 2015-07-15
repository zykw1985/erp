package com.xf;

class Demo{
	static int x=10;
	
	static{
		x/=2;
		x=20;
	}
}

class Demo2{
	static final int NUMBER=10;
	final int N;
	static int a;
	
	public Demo2(int n){
		//this.NUMBER=n;
		N=a++;
		System.out.println(N);
		System.out.println(a);
	}
}

public class StaticDemo {
	public static void main(String args[]){
//		System.out.println(Demo.x);
		Demo2 d1=new Demo2(10);
		Demo2 d2=new Demo2(10);
		Demo2 d3=new Demo2(10);
	}
}
