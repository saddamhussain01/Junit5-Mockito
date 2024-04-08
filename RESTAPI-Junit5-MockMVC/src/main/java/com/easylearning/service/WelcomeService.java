package com.easylearning.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String getGreetings() {
		
		return "Welcome to Easy learning Channel";
		
	}

}
