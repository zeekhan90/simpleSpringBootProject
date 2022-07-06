package com.zeetech.springbootmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeetech.springbootmysql.pojo.Employee;
import com.zeetech.springbootmysql.service.EmployeeService;
import com.zeetech.springbootmysql.service.EmployeeServiceImp;

@RestController
public class EpmployeeController {
	 // Annotation
    @Autowired 
    private EmployeeService employeeService;
    
    
    @GetMapping("/")
    public String returnIndex() {
    	return "Welcome to the simple spring boot project";
    }
    
    
   // Read operation
    @GetMapping("/getall")
    public List<Employee> fetchEmpoyeeList()
    {
        return employeeService.fetchEmployeeList();
    }

 
    // Save operation
    @PostMapping("/saveemployee")
    public Employee saveEmployee(@RequestBody Employee empolyee)
    {
    	Employee obj = new Employee();
    	obj.setName(empolyee.getName());
    	obj.setEmail(empolyee.getEmail());
    	obj.setAddress(empolyee.getAddress());
        return employeeService.saveEmployee(obj);
    }
 
        

}
