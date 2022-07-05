package com.sbdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbdatajpa.modal.Department;
import com.sbdatajpa.repository.DepartmentRespository;


@RestController
@RequestMapping(value = "/dept")
public class DepartmentController {

	@Autowired
	private DepartmentRespository departmentRespository;
	
	@PostMapping("create")
    public Department createDepartment(@RequestBody Department department) {
          return this.departmentRespository.save(department);
	}

	@GetMapping(value = "/getdepartByName/{name}")
	public Department readDepartmentById(@PathVariable("name") String deptName){
		return departmentRespository.findByDeptName(deptName);
	}

}
