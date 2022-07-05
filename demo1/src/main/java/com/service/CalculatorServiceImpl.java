package com.service;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		int res = 0;
		try {
			res = num1 / num2 ;
			
		} catch (java.lang.ArithmeticException ae) {
			System.err.println(ae);
		}
		return res;
	}

}
