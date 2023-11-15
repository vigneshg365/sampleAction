package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	
	@GetMapping("/userDetails")
	public ResponseEntity<String> getUserDetails(){
		return new ResponseEntity<String>("user details listed successfully",HttpStatus.OK);
	}

}
