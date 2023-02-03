package com.unique.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;
import com.unique.Db.Employee;
import com.unique.service.EmployeeService;

public class EmployeeImplement implements EmployeeService{
	
	@Inject
	private Provider<EntityManager> emp;
	
	@Inject
	private EntityManager em;
	
	
	@Transactional
	@Override
	public Employee AddEmp(String name, String city, String state, String phone) {
		Employee e = new Employee(name, city, state, phone);
		emp.get().persist(e);
		return e;
	}

	@Override
	public Employee UpdateEmp(int id, String name, String city, String state, String phone) {
		return null;
	}

	@Override
	public Employee deleteEmp(int id) {
		return null;
	}

	@Override
	public List<Employee> getAllPersons() {
		return null;
	}

	@Override
	public Employee getEmpbyid(int id) {
		return null;
	}

}
