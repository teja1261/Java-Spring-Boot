package com.main;

import java.util.function.Consumer;//Pre-defined Function

import com.service.InterfaceOne;
import com.service.interfaceOneImpl;

public class Demo_1_Main {

	public static void main(String[] args) {

		Consumer<String> consumer = (name) -> {
			System.out.println("Lamda Expression " + name);
		};// Lambda Expression
		consumer.accept("Teja Narendra");

		InterfaceOne interfaceOne = new interfaceOneImpl();
		interfaceOne.functionOne("Functional Interface");
		interfaceOne.add(200, 20);

		// Interface.static function()
		InterfaceOne.sub(200, 20);// Invoking static Function

		InterfaceOne interfaceOne2 = (name) -> {
			System.out.println("Called By Interface: " + name);
		};
		
		interfaceOne2.functionOne("Functional Interface");

	}

}
