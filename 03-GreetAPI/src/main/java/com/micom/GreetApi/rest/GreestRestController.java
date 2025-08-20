package com.micom.GreetApi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreestRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String getGreestMsg() {
		String port = env.getProperty("server.port");

		return "Good Afternoon ! " + port;
	}

}
