package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.model.StudentModel;
import com.service.StudentSortByDeptImpl;
import com.service.StudentSortByIdImpl;

public class MainApplication {
	
	public static void main(String[] args) {
		
		List<StudentModel> students = new ArrayList<StudentModel>();
		
		students.add(new StudentModel(1257, "Muthyala Deva Teja", 24, "IT"));
		students.add(new StudentModel(1259, "Nalukurthi Bhargav", 23, "ECE"));
		students.add(new StudentModel(1261, "Narendra Teja", 25, "IT"));
		students.add(new StudentModel(1263, "Nenduri Harini", 19, "ECE"));
		students.add(new StudentModel(1258, "Muthyala Rajya Lakshmi", 22, "IT"));
		students.add(new StudentModel(1260, "Namidi Rahul", 26, "ECE"));
		students.add(new StudentModel(1262, "Narne Tejaswini", 20, "IT"));
		students.add(new StudentModel(1265, "Obellineni Bhavana", 21, "ECE"));
		
		
		System.out.println("List Before Unsorted");
		System.out.println("----------------------------");
		
		for (Iterator<StudentModel> iterator = students.iterator(); iterator.hasNext();) {
			StudentModel studentModel = (StudentModel) iterator.next();
			System.out.println("Student Id: " + studentModel.getStudentId());
//			System.out.println("Student Name: " + studentModel.getStudentName());
//			System.out.println("Student Age: " + studentModel.getStudentAge());
//			System.out.println("Student Department: " + studentModel.getStudentDept());
			
		}
		
		Collections.sort(students, new StudentSortByIdImpl());
		
		System.out.println("----------------------------");
		System.out.println("List After sorted by Student Id");
		
		for (Iterator<StudentModel> iterator = students.iterator(); iterator.hasNext();) {
			StudentModel studentModel = (StudentModel) iterator.next();
			System.out.println("Student Id: " + studentModel.getStudentId());
			System.out.println("Student Name: " + studentModel.getStudentName());
//			System.out.println("Student Age: " + studentModel.getStudentAge());
//			System.out.println("Student Department: " + studentModel.getStudentDept());
			
		}
		
		Collections.sort(students, new StudentSortByDeptImpl());
		
		System.out.println("----------------------------");
		System.out.println("List After sorted by Student Name");
		
		for (Iterator<StudentModel> iterator = students.iterator(); iterator.hasNext();) {
			StudentModel studentModel = (StudentModel) iterator.next();
			System.out.println("Student Id: " + studentModel.getStudentId());
			System.out.println("Student Name: " + studentModel.getStudentName());
//			System.out.println("Student Age: " + studentModel.getStudentAge());
			System.out.println("Student Department: " + studentModel.getStudentDept());
			
		}
	}

}
