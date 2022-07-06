package com.zeetech.springbootmysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeetech.springbootmysql.pojo.Employee;
import com.zeetech.springbootmysql.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		List<Employee> listObj = employeeRepository.findAll();
		return listObj;
	}
	
	public void getName() {
		
	}

}
