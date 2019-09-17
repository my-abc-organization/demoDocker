package com.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping(path = "/api/v1")
public class TestController {
	
	@GetMapping(path="/Hi",produces = "application/json")
	public String sayHi() {
		return "Hello Sandip"; 
	}

}
