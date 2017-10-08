package com.nguyenthao.DI;

public class Square implements Shape {
	private int size;

	public Square(int size) {
		this.size = size;
	}

	@Override
	public float getPerimeter() {
		return size * 4;
	}

	@Override
	public float getArea() {
		return (float) Math.pow(size, 2);
	}

}
