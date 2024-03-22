package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import com.repo.StudentRepo;
import com.service.StudentService;

public class StudentServiceTest {

	@Test
	public void testGetNameByUserID() {

		StudentRepo mockStudentRepo = PowerMockito.mock(StudentRepo.class);
		PowerMockito.when(mockStudentRepo.findNameById(1)).thenReturn("hussain");

		StudentService service = new StudentService(mockStudentRepo);
		String name = service.getNameByUserID(1);
		assertEquals("hussain", name);

	}

	@Test
	public void testGetEmailByUserID() {

		StudentRepo mockStudentRepo = PowerMockito.mock(StudentRepo.class);
		PowerMockito.when(mockStudentRepo.findEmailById(1)).thenReturn("hussain@gmail.com");

		StudentService service = new StudentService(mockStudentRepo);
		String email = service.getEmailByUserID(1);
		assertEquals("hussain@gmail.com", email);

	}

	@Test
	public void testGetRealEmailByUserID() {

		StudentRepo mockStudentRepo = PowerMockito.mock(StudentRepo.class);
		PowerMockito.when(mockStudentRepo.findEmailById(1)).thenCallRealMethod(); // this method is calling real data

		StudentService service = new StudentService(mockStudentRepo);
		String email = service.getEmailByUserID(1);
		assertEquals("saddam@gmail.com", email);

	}

//	@Test
//	  public void testVoidMethodDoProcess() { 
//		
//		StudentService studentService = PowerMockito.mock(StudentService.class);
//	  
//	  try { PowerMockito.doNothing().when(studentService, "checkMethod",anyString()); 
//	  studentService.doProcess(); 
//	  } 
//	  catch (Exception e) { // TODO
//	    e.printStackTrace();
//	    
//	  } 
//	  
//	}
	
//	@Test
//	public void testPrivateMethodDoWork() throws Exception {
//		StudentService studentService = new StudentService();
//		StudentService spy = PowerMockito.spy(studentService);
//		PowerMockito.doReturn("TO UPPERCASE").when(spy, "formatteMsg", "to uppercase");
//		String formattedMsg = spy.doWork("to uppercase");
//		assertEquals("TO UPPERCASE", formattedMsg);
//	}

}
