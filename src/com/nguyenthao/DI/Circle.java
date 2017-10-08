package com.nguyenthao.DI;

public class Circle implements Shape {
	private static final float PI = 3.1415f;
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public float getPerimeter() {
		return radius * 2 * PI;
	}

	@Override
	public float getArea() {
		return (float) (Math.pow(radius, 2) * PI);
	}
}
