package com.zeetech.springbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeetech.springbootmysql.pojo.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
