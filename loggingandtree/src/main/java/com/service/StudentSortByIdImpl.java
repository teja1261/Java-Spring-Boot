package com.service;

import java.util.Comparator;

import com.model.StudentModel;

public class StudentSortByIdImpl implements Comparator<StudentModel> {

	@Override
	public int compare(StudentModel o1, StudentModel o2) {
		return o1.getStudentId() - o2.getStudentId(); //Compare by student ID
	}

}
