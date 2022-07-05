package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class StreamMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Apple", 1010.10f));
		employees.add(new Employee(20, "Banana", 2020.20f));
		employees.add(new Employee(30, "Carrot", 3030.30f));
		employees.add(new Employee(40, "Kiwi", 4040.40f));
		employees.add(new Employee(50, "Avacodo", 5050.50f));
		employees.add(new Employee(60, "Blue Berry", 6060.60f));
		
		employees.stream().filter(p -> p.getEmpName().startsWith("A")).forEach(System.out::println);

	}

}
