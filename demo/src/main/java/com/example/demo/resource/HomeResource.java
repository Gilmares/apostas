package com.example.demo.resource;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/")
public class HomeResource {

	
	@GetMapping
	public String getHello() {
		return "Teste Olá Mundo!!!!!!!";
	}
}
