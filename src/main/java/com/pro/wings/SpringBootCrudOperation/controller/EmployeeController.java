package com.pro.wings.SpringBootCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.wings.SpringBootCrudOperation.entity.Employee;
import com.pro.wings.SpringBootCrudOperation.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@PostMapping("/addEmployee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee emp) {

		Employee employee = empService.addEmployee(emp);

		ResponseEntity<Employee> re = new ResponseEntity<Employee>(employee, HttpStatus.CREATED);

		return re;

	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {

		return empService.getAllEmployee();

	}

	@GetMapping("/employees/employee/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") int empId) {

		Employee employee = empService.getEmployeeById(empId);

		ResponseEntity<Employee> re = new ResponseEntity<Employee>(employee, HttpStatus.OK);

		return re;

	}

	@PutMapping("/employee/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable("id") int empId, @RequestBody Employee emp) {

		Employee employee = empService.updateEmployee(emp, empId);

		ResponseEntity<Employee> er = new ResponseEntity<Employee>(employee, HttpStatus.OK);

		return er;

	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") int empId) {

		Employee employee = empService.deleteEmployee(empId);

		ResponseEntity<Employee> re = new ResponseEntity<Employee>(employee, HttpStatus.OK);

		return re;
	}
}
