package com.pro.wings.SpringBootCrudOperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.wings.SpringBootCrudOperation.dao.EmployeeDao;
import com.pro.wings.SpringBootCrudOperation.entity.Employee;
import com.pro.wings.SpringBootCrudOperation.exception.MyCusomeException;
import com.pro.wings.SpringBootCrudOperation.exception.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public Employee addEmployee(Employee emp) {

		return empDao.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {

		Optional<Employee> emp1 = empDao.findById(id);

		if (emp1.isPresent()) {
			return emp1.get();
		} else {
			throw new ResourceNotFoundException("Employee", "Id", id);
		}

	}

	@Override
	public Employee updateEmployee(Employee emp, int id) {
		Employee existingEmp = empDao.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

		existingEmp.setFirstName(emp.getFirstName());
		existingEmp.setLastName(emp.getLastName());
		existingEmp.setSalary(emp.getSalary());

		empDao.save(existingEmp);

		return existingEmp;
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee employee = empDao.findById(id)
				.orElseThrow(() -> new MyCusomeException("Employee Not found please correct id: " + id));
		empDao.deleteById(id);
		return employee;
	}

}
