package com.nguyenthao.Factory2;

public class Main {
	public static void main(String[] args) {
		Shape square = new Square();
		Shape rectangle = new Rectangle();
		Shape circle = new Circle();
		square.draw();
		rectangle.draw();
		circle.draw();
	}
}
