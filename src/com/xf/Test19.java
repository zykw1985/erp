package com.xf;

abstract class Shape
{
	public abstract double area();

	public abstract double girth();
}

class Circle extends Shape
{
	private double r;

	public Circle(double r){
		this.r=r;
	}

	public void setR(double r){
		this.r=r;
	}
	//get

	public double area(){
		return Math.PI*r*r;
	}

	public double girth(){
		return 2*Math.PI*r;
	}
}

class Rect extends Shape
{
	private double width;
	private double height;

	public Rect(double width,double height){
		this.width=width;
		this.height=height;
	}

	public Rect(){
	}

	public void setWidth(double width){
		this.width=width;
	}

	public void setHeight(double height){
		this.height=height;
	}
	//get

	public double area(){
		return width*height;
	}

	public double girth(){
		return 2*(height+width);
	}
}

class Square extends Rect
{
	private double length;

	public Square(double length){
		this.length=length;
	}

	public void setLength(double length){
		this.length=length;
	}

	public double area(){
		return length*length;
	}

	public double girth(){
		return 4*length;
	}
}

public class Test19
{
	public static void main(String args[]){
		/**
		Shape array[]=new Shape[3];
		Circle c=new Circle();
		c.setR(1);
		Rect r=new Rect();
		r.setWidth(2);
		r.setHeight(4);
		Square s=new Square();
		s.setLength(3);

		//将三个对象放入数组
		array[0]=c;
		array[1]=r;
		array[2]=s;
		for(int i=0;i<array.length;i++){
			System.out.println(array[i].area());
			System.out.println(array[i].girth());
		}
		*/
		Shape s=getShap(2);
		System.out.println(s instanceof Square);
		print(s);
	}


	public static Shape getShap(int i){
		Shape s=null;
		if(i==0){
			s=new Circle(1);
		}else if(i==1){
			s=new Rect(2,3);
		}else if(i==2){
			s=new Square(2);
		}else{
			System.out.println("无此类型");
		}
		return s;
	}

	public static void print(Shape s){
		System.out.println("周长:"+s.girth());
		System.out.println("面积:"+s.area());
	}
}