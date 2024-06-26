package com.easylearning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.easylearning.entity.Employee;
import com.easylearning.repository.EmployeeRepository;

@SpringBootTest(classes = {EmployeeServiceImpl.class})
public class TestEmployeeServiceImplUsingDiffAnnotations {
	
	@MockBean
    private EmployeeRepository employeeRepository;

	@Autowired
    private EmployeeServiceImpl employeeService;

    private List<Employee> employeesList;

    @BeforeEach
    public void setUp() {
      
    	employeesList = new ArrayList<>();
        employeesList.add(new Employee(10, "saddam", "Backend role"));
		employeesList.add(new Employee(20, "Ravi", "support role"));
		employeesList.add(new Employee(30, "Likesh", "DevOps role"));
		employeesList.add(new Employee(40, "Naveen", "Frontend role"));
    }

    
    @Test
    public void test_getListOfEmployees() {
        
    	when(employeeRepository.findAll()).thenReturn(employeesList);
    	
    	List<Employee> listOfEmployees = employeeService.getListOfEmployees();
    	
    
    	assertEquals(employeesList, listOfEmployees);
    
        
    }
    
    

}
