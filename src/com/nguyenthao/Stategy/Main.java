package com.nguyenthao.Stategy;

public class Main {
	static Context context;
	public static void main(String[] args) {
		context = new Context(new Add());
		System.out.println("10 + 20 = " + context.executeStrategy(10, 20));

		context = new Context(new Sub());
		System.out.println("10 - 20 = " + context.executeStrategy(10, 20));
		
		context = new Context(new Division());
		System.out.println("20 : 10 = " + context.executeStrategy(20, 10));
	}
}
