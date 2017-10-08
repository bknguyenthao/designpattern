package com.nguyenthao.DI;

public class Main {

	public static void main(String[] args) {
		ShapeManager manager = new ShapeManager();

		manager.setShape(new Circle(5));
		System.out.println(
				"Circle with perimeter and area: " + manager.calculatePerimeter() + ":" + manager.calculateArea());

		manager.setShape(new Square(5));
		System.out.println(
				"Square with perimeter and area: " + manager.calculatePerimeter() + ":" + manager.calculateArea());
	}

}
