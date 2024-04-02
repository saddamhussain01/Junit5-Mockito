package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import com.repo.StudentRepo;
import com.service.StudentService;

public class StudentServiceTest {
	
	
	@Test
	public void test_getNameByUserID() {
		
	StudentRepo mockStudentRepo = 	PowerMockito.mock(StudentRepo.class);
	
	PowerMockito.when(mockStudentRepo.findNameById(1)).thenReturn("Hussain");
	
	StudentService service = new StudentService(mockStudentRepo);
	
	String actualValue = service.getNameByUserID(1);
	
	assertEquals("Hussain", actualValue);
	
		
	}
	
	
	@Test
	public void test_getEmailByUserID() {
		
	StudentRepo mockStudentRepo = 	PowerMockito.mock(StudentRepo.class);
	
	PowerMockito.when(mockStudentRepo.findEmailById(2)).thenReturn("Hussain@gmail.com");
	
	StudentService service = new StudentService(mockStudentRepo);
	
	String actualValue = service.getEmailByUserID(2);
	
	assertEquals("Hussain@gmail.com", actualValue);
	
		
	}
	
	@Test
	public void test_getEmailByUserID1() {
		
	StudentRepo mockStudentRepo = 	PowerMockito.mock(StudentRepo.class);
	
	PowerMockito.when(mockStudentRepo.findEmailById(2)).thenCallRealMethod();
	
	StudentService service = new StudentService(mockStudentRepo);
	
	String actualValue = service.getEmailByUserID(2);
	
	assertEquals("saddam@gmail.com", actualValue);
	
		
	}

	
}
