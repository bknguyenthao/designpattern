package com.nguyenthao.Stategy;

public class Add implements Calculation{

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
