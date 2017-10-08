package com.nguyenthao.Singleton;

public class SingleObject {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// create an object of SingleObject
	private static SingleObject instance = new SingleObject();

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World! I'm " + this.getName());
	}
}
