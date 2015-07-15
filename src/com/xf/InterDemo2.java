package com.xf;

interface InterA{
	
	void ma();
	
	void mb();
	
	void mc();
}
// implements
abstract class InterAImpl implements InterA{
	public void ma(){
		System.out.println("ma");
	}
}


public class InterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
