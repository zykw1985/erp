package com.xf;

interface A{
	void ma();
}

interface B{
	void mb();
}

interface C extends A,B{
	void mc();
}

class D implements C{

	public void ma() {
		
	}

	public void mb() {
		
	}

	public void mc() {
		
	}
}


public class IterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
