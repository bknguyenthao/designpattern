package com.nguyenthao.Factory;

public class Main {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape square = shapeFactory.getShape("Square");
		Shape rectangle = shapeFactory.getShape("Rectangle");
		Shape circle = shapeFactory.getShape("Circle");
		square.draw();
		rectangle.draw();
		circle.draw();
	}
}
