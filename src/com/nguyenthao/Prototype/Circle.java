package com.nguyenthao.Prototype;

public class Circle extends Shape{
	public Circle(){
	     type = "Circle";
	   }
	@Override
	public void draw() {
		System.out.println("This is Circle");
		
	}
}
