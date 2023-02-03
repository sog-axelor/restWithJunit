package com.unique.impl;

import java.util.List;
import com.unique.Db.Employee;
import com.unique.service.EmployeeService;
import javax.persistence.EntityManager;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class EmployeeImplement implements EmployeeService{
	@Inject
	private EntityManager em;
	
	@Inject
	private Provider<EntityManager> emp;
	
	@Override
	public Employee AddEmp(String name, String city, String state, String phone) {
		return null;
	}
	
	@Override
	public Employee UpdateEmp(int id, String name, String city, String state, String phone) {
		return null;
	}
	
	@Transactional
	@Override
	public Employee deleteEmp(int id) {
			Employee e = em.find(Employee.class,id);
			em.remove(e);
		return null;
	}
	
	@Transactional
	@Override
	public List<Employee> getAllPersons() {
		em = emp.get();
		List<Employee> emplist = em.createQuery("from Employee",Employee.class).getResultList();
		System.out.println(emplist);

		return emplist;
	}
	


	@Override
	public Employee getEmpbyid(int id) {
		return null;
	}

}
