package com.zeetech.springbootmysql.service;

import java.util.List;

import com.zeetech.springbootmysql.pojo.Employee;

public interface EmployeeService {
	
	// Save operation
    Employee saveEmployee(Employee employee);
 
    // Read operation
    List<Employee> fetchEmployeeList();

}
