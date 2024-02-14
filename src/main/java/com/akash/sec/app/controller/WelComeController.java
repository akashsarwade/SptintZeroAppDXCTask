package com.akash.sec.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.sec.app.model.UserDto;

import jakarta.validation.Valid;

@RestController
public class WelComeController {

	@PostMapping("/greeting")
	public String greeting( @Valid @RequestBody UserDto userDto) {

		return "Spring Security User Login Successfuly   - Welcome -------- ";
	}
}
