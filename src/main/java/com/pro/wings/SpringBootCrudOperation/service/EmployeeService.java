package com.pro.wings.SpringBootCrudOperation.service;

import java.util.List;

import com.pro.wings.SpringBootCrudOperation.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(int id);

	public Employee updateEmployee(Employee emp, int id);

	public Employee deleteEmployee(int id);

}
