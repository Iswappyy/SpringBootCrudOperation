package com.pro.wings.SpringBootCrudOperation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.wings.SpringBootCrudOperation.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
