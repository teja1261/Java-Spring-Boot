package com.service;

@FunctionalInterface
public interface InterfaceOne {
	public abstract void functionOne(String name);
	
	//default method
	public default void add(int num1, int num2) {
		System.out.println("Addition : " + (num1 + num2));
	}
	
	
	//static method
	public static void sub(int num1, int num2) {
		System.out.println("Subtract : " + (num1 - num2));
	}

}
