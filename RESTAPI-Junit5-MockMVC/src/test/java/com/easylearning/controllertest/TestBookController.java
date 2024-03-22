package com.easylearning.controllertest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.easylearning.DTO.Book;
import com.easylearning.controller.BookController;
import com.easylearning.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(value = BookController.class)
public class TestBookController {

	@MockBean
	private BookService bookService;

	@Autowired
	private MockMvc mockMvc;

	
	@Test
	public void testAddBook() throws Exception {

		when(bookService.saveBook(ArgumentMatchers.any())).thenReturn(true);
		Book book = new Book(100, "Java", 500.0);
		ObjectMapper mapper = new ObjectMapper();

		// writeValueAsString method is converting java object to json
		String bookJson = mapper.writeValueAsString(book);

		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.post("/addbook")
				                                                         .contentType(MediaType.APPLICATION_JSON)
				                                                         .content(bookJson);
                
		
//		                                                           MockMvcRequestBuilders.put();
//		                                                           MockMvcRequestBuilders.delete();
		
		ResultActions perform = mockMvc.perform(reqBuilder);

		MvcResult result = perform.andReturn();
		MockHttpServletResponse response = result.getResponse();
		int status =   response.getStatus();
		
		assertEquals(201, status);

	}

}
