package com.service;

import com.model.DepartmentModel;
import com.model.EmployeeModel;

public class ReadDeptServiceImpl implements ReadDeptService {

	@Override
	public void readDetails(DepartmentModel departmentModel) {
		
		for (EmployeeModel employeeModel : departmentModel.getEmployees()) {
			if(departmentModel.getDeptName() == employeeModel.getFacultyDept()) {
				System.out.println("<--------------------------------------------->");
				System.out.println("Faculty Id: "+ employeeModel.getFacultyId());
				System.out.println("Faculty Name: "+ employeeModel.getFacultyName());
				System.out.println("Faculty Subject: "+ employeeModel.getFacultySubject());
				System.out.println("Faculty Department: "+ employeeModel.getFacultyDept());
			}
		}

	}

}
