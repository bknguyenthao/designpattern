package com.nguyenthao.Stategy;

public class Context {
	private Calculation cal;

	public Context(Calculation cal) {
		this.cal = cal;
	}

	public int executeStrategy(int num1, int num2) {
		return cal.doOperation(num1, num2);
	}
}
