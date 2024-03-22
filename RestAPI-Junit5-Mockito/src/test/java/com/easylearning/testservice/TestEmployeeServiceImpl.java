package com.easylearning.testservice;

import com.easylearning.entity.Employee;
import com.easylearning.repository.EmployeeRepository;
import com.easylearning.service.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.*;

@SpringBootTest(classes = {EmployeeServiceImpl.class})
public class TestEmployeeServiceImpl {

    private EmployeeRepository employeeRepository;

	
    private EmployeeServiceImpl employeeService;

    private List<Employee> employees;

    @BeforeEach
    public void setUp() {
        employeeRepository = mock(EmployeeRepository.class);
        employeeService = new EmployeeServiceImpl(employeeRepository);
        employees = new ArrayList<>();
        employees.add(new Employee(10, "saddam", "Backend role"));
        employees.add(new Employee(20, "Ravi", "support role"));
    }

    @Test
    public void test_getListOfEmployees() throws NotFoundException {
        when(employeeRepository.findAll()).thenReturn(employees);

        List<Employee> result = employeeService.getListOfEmployees();

        assertEquals(employees, result);
        verify(employeeRepository).findAll();
    }
}




