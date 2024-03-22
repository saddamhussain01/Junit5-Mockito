package com.easylearning.controller;

import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> list = employeeService.getListOfEmployees();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
