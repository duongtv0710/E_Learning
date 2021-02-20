package com.cybersoft.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.dto.LoginDto;
import com.cybersoft.service.AuthService;

@RestController
@RequestMapping("api/auth")
public class AuthController {
	
	private AuthService authService;
	
	public AuthController(AuthService authService) {
		this.authService = authService;
	}

	@PostMapping("login")
	public Object post(@Valid @RequestBody LoginDto dto) {
		try {
			String token = authService.login(dto);
			return new ResponseEntity<Object>(token, HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
