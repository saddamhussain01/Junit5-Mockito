package com.easylearning.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.easylearning.controller.EmployeeController;
import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeServiceImpl;

@WebMvcTest(value = EmployeeController.class)
public class TestEmployeeController {

	@MockBean
	private EmployeeServiceImpl employeeServiceImpl;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getAllEmployees() throws Exception{
		
		
		List<Employee>  employeesList = new ArrayList<>();
		
		employeesList.add(new Employee(10, "saddam", "Backend role"));
		employeesList.add(new Employee(20, "Ravi", "support role"));
		employeesList.add(new Employee(30, "Likesh", "DevOps role"));
		employeesList.add(new Employee(40, "Naveen", "Frontend role"));
		 
		
		when(employeeServiceImpl.getListOfEmployees()).thenReturn(employeesList);
		
		mockMvc.perform(get("/api/v1/list")).andExpect(status().is2xxSuccessful());

		
	}
	
	


}
