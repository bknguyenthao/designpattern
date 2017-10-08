package com.nguyenthao.Prototype2;

public class Student implements Cloneable {
	private String id;
	private String name;

	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

	public void showInfo() {
		System.out.println("Name: "+this.name +" ID: " +this.id);
	}
}
