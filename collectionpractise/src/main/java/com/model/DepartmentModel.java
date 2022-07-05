package com.model;

import java.util.Set;

public class DepartmentModel {

	private int deptId;
	private String deptName;
	private Set<EmployeeModel> employees;

	public DepartmentModel() {
		super();
	}

	public DepartmentModel(int deptId, String deptName, Set<EmployeeModel> employees) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employees = employees;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<EmployeeModel> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeModel> employees) {
		this.employees = employees;
	}

}
