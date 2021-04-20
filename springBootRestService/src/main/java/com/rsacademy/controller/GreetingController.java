package com.rsacademy.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
//http://localhost:8080/greeting?name=Rahul
	
	@Autowired
	Greeting greeting;  //it will create obj
	
	AtomicLong counter =new AtomicLong(); 
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name")String name)
	{
		//logic
		greeting.setId(counter.incrementAndGet());
		
		greeting.setContent("Learning from :"+ name);
		
		return greeting;
	}
}
