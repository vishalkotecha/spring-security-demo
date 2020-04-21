package com.vishalkotecha.ssdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class DashboardController {
	
	@GetMapping
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok().body("Welcome");
	}

}
