package com.easylearning.service;

import com.easylearning.entity.Employee;
import com.easylearning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;

	

	public List<Employee> getListOfEmployees() {
		
		return employeeRepository.findAll();

	}
	
	
}
