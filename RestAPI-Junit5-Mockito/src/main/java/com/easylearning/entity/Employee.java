package com.easylearning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Employee {

  
	@Id
    private int id;
    private String empName;
    private String role;
    
	public Employee(int id, String empName, String role) {
		super();
		this.id = id;
		this.empName = empName;
		this.role = role;
	}
    
    

}
