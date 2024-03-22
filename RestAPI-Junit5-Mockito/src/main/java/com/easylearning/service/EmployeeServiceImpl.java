package com.easylearning.service;

import com.easylearning.entity.Employee;
import com.easylearning.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl() {
		super();
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getListOfEmployees() {
		
		return employeeRepository.findAll();

	}
}
