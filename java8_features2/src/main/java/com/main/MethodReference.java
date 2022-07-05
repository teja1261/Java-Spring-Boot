package com.main;

import com.service.InterfaceOne;

public class MethodReference {

	// Static method
	public static String sayCallable(String name) {
		return "Welcome to " + name;
	}

	// concrete method
	public String saySomething(String name) {
		return "Welcome to " + name;
	}

	public static void main(String[] args) {

		// Interface interfaceName = ContainingClass::staticMethodName(Static Method
		// Reference)
		InterfaceOne interfaceOne = MethodReference::sayCallable;
		String str1 = interfaceOne.sayHello("Reference to a Static Method.");
		System.out.println(str1);

		MethodReference methodReference = new MethodReference(); // Creating object
		// Interface interfaceName = conatiningObject::instanceMethodName(Instance Method Reference)
		InterfaceOne interfaceTwo = methodReference::saySomething;
		// Calling interface method
		String str2 = interfaceTwo.sayHello("Reference to a Instance Method.");
		System.out.println(str2);
		
		// Referring non-static method using anonymous object
		InterfaceOne interfaceThree = new MethodReference()::saySomething; // You can use anonymous object also
		// Calling interface method
		String str3 = interfaceThree.sayHello("Reference to a Instance Method with Anonymous object.");
		System.out.println(str3);
		

	}

}
