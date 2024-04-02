package com.service;

import com.repo.StudentRepo;

public class StudentService {

	private StudentRepo studentRepo;

	public StudentService() {
		super();
	}

	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public String getNameByUserID(int id) {

		String name = studentRepo.findNameById(id);
		return name;
	}

	public String getEmailByUserID(int id) {

		String name = studentRepo.findEmailById(id);
		return name;
	}

	
}
