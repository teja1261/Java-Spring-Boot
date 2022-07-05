package com.service;

import java.util.Comparator;

import com.model.StudentModel;

public class StudentSortByDeptImpl implements Comparator<StudentModel> {

	@Override
	public int compare(StudentModel o1, StudentModel o2) {
		return o1.getStudentDept().compareTo(o2.getStudentDept()); //Compare by student Department
	}

}
