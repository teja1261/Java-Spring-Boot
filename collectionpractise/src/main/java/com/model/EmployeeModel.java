package com.model;

import java.util.List;

public class EmployeeModel {

	private int facultyId;
	private String facultyName;
	private String facultySubject;
	private String facultyDept;
	private List<AddressModel> address;

	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeModel(int facultyId, String facultyName, String facultySubject, String facultyDept,
			List<AddressModel> address) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultySubject = facultySubject;
		this.facultyDept = facultyDept;
		this.address = address;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultySubject() {
		return facultySubject;
	}

	public void setFacultySubject(String facultySubject) {
		this.facultySubject = facultySubject;
	}

	public String getFacultyDept() {
		return facultyDept;
	}

	public void setFacultyDept(String facultyDept) {
		this.facultyDept = facultyDept;
	}

	public List<AddressModel> getAddress() {
		return address;
	}

	public void setAddress(List<AddressModel> address) {
		this.address = address;
	}

}
