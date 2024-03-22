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

	public void doProcess() {
		System.out.println("method start");
		checkMethod("hello");
		System.out.println("method ended");
	}

	public void checkMethod(String str) {

		System.out.println("Printing the string " + str);

	}

	public String doWork(String str) {

		String formattedMsg = formatteMsg(str);
		return formattedMsg;

	}

	private String formatteMsg(String str) {
		return str.toUpperCase();
	}
}
