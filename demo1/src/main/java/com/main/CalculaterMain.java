package com.main;

import com.service.CalculatorService;
import com.service.CalculatorServiceImpl;

public class CalculaterMain {

	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int ans = 0;
		ans = calculatorService.add(num1, num2);
		System.out.println("Addition: " + ans);
		ans = calculatorService.div(num1, num2);
		System.out.println("Divided: " + ans);
	}

}
