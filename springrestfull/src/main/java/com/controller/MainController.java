package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Employee;

@RestController
public class MainController {
	
	@RequestMapping(value = "getEmployee")
	public Employee getEmployee() {
		return new Employee(1261, "Teja Narendra", 126100.04F);
	}

}
