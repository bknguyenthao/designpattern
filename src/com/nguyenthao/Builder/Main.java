package com.nguyenthao.Builder;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student.Builder()
				.name("ThaoNM")
				.age(26)
				.language(Arrays.asList("vie", "eng"))
				.sex("Men")
				.build();		
		System.out.println(s1.toString());
		System.out.println(s1.getName());
		
		// Not need Initialize object with full attribute
		Student s2 = new Student.Builder()
				//.name("ThaoNM")
				.age(26)
				.language(Arrays.asList("vie", "eng"))
				.sex("Men")
				.build();		
		System.out.println(s2.toString());
		System.out.println(s2.getName());
	}
}
