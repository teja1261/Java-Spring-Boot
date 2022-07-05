package com.service;

public class interfaceOneImpl implements InterfaceOne {

	@Override
	public void functionOne(String name) {
		System.out.println("Function one Called with " + name);

	}

	@Override
	public void add(int num1, int num2) {
		InterfaceOne.super.add(num1, num2);
	}
	
	

}
