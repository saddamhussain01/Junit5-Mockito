package com.easylearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.easylearning.service.WelcomeService;


@RestController
@RequestMapping("/api/v1")
public class GreetingsController {
	
	
	@Autowired
	private WelcomeService welcomeService;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> greeting(){
		String greetings =  welcomeService.getGreetings();
		
		return new ResponseEntity<>(greetings, HttpStatus.OK);
	}
	
	

}
