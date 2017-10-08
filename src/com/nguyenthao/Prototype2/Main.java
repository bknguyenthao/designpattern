package com.nguyenthao.Prototype2;

import java.util.HashMap;

public class Main {
	// //Read 2 example to understand clone
	// public static void main(String[] args) {
	// HashMap<String, Student> studentArr = new HashMap<String, Student>();
	// Student studentOrigin = new Student("1", "Thao");
	// Student studentCopy = studentOrigin;
	// studentArr.put(studentCopy.getId(), studentCopy);
	//
	// studentOrigin.setName("name origin");
	//
	// studentOrigin.showInfo();
	// studentArr.get("1").showInfo();
	//
	// }

	public static void main(String[] args) {
		HashMap<String, Student> studentArr = new HashMap<String, Student>();
		Student st1 = new Student("1", "Thao");
		Student st2 = (Student) st1.clone();
		studentArr.put(st2.getId(), st2);

		st1.setName("name changed");

		st1.showInfo();
		studentArr.get("1").showInfo();
	}
}
