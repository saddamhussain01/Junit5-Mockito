package com.easylearning.entity;


public class Employee {


    private int id;
    private String empName;
    private String role;
    
	public Employee(int id, String empName, String role) {
		super();
		this.id = id;
		this.empName = empName;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
    
    

}
