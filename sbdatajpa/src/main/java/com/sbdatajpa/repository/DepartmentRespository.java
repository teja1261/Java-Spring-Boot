package com.sbdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbdatajpa.modal.Department;

@Repository
public interface DepartmentRespository extends CrudRepository<Department, Integer>{

	public abstract Department findByDeptName(String deptName);
}
