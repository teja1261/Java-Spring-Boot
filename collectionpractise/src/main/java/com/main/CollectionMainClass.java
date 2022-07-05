package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.model.AddressModel;
import com.model.DepartmentModel;
import com.model.EmployeeModel;
import com.service.ReadDeptService;
import com.service.ReadDeptServiceImpl;

public class CollectionMainClass {

	public static void main(String[] args) {
		
		List<AddressModel> address = new ArrayList<AddressModel>();
		AddressModel address1 = new AddressModel(1, "Perungudi", "Chennai", "TN");
		AddressModel address2 = new AddressModel(1, "Tharamani", "Chennai", "TN");
		AddressModel address3 = new AddressModel(1, "MVP", "Visakapatnam", "AP");
		AddressModel address4 = new AddressModel(1, "RK Beach", "Visakapatnam", "AP");
		address.add(address1);
		address.add(address2);
		address.add(address3);
		address.add(address4);
		
		Set<EmployeeModel> faculties = new HashSet<EmployeeModel>();
		EmployeeModel employee1 = new EmployeeModel(1000, "ABC", "C & C++Language", "IT", address);
		EmployeeModel employee2 = new EmployeeModel(1001, "DEF", "Javascript using React Native Framework", "IT", address);
		EmployeeModel employee3 = new EmployeeModel(2000, "ABC", "Digital Signal Processing", "ECE", address);
		EmployeeModel employee4 = new EmployeeModel(2001, "DEF", "Information Theory & Coding", "ECE", address);
		faculties.add(employee1);
		faculties.add(employee2);
		faculties.add(employee3);
		faculties.add(employee4);
		
		Set<DepartmentModel> department = new HashSet<DepartmentModel>();
		DepartmentModel dept1 = new DepartmentModel(1, "IT", faculties);
		DepartmentModel dept2 = new DepartmentModel(1, "ECE", faculties);
		
		ReadDeptService readDeptService = new ReadDeptServiceImpl();
		readDeptService.readDetails(dept1);
		
		readDeptService.readDetails(dept2);
	}

}
