package com.unique.service;

import java.util.List;
import com.unique.Db.Employee;

public interface EmployeeService {

	public Employee  AddEmp(String name,String city,String state,String phone);
	public Employee  UpdateEmp(int id,String name,String city,String state,String phone);
	public Employee  deleteEmp(int id);
	List<Employee> getAllPersons();
	public Employee getEmpbyid(int id);
}
