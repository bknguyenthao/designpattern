package com.nguyenthao.Adapter;

public class Main {
	
	public static void main(String[] args) {
		OldVersion old = new Adapter();
		System.out.println(old.calculateOld(5, 6));
	}
}
