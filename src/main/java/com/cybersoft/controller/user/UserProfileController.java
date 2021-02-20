package com.cybersoft.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.dto.UserDto;
import com.cybersoft.service.UserService;


@RestController
@RequestMapping("api/user/file")
public class UserProfileController {
	
	@Autowired
	UserDetailsService userDetailService;
	@Autowired
	UserService userService;
	
	@GetMapping("")
	public Object get(@PathVariable String email) {	
		try {
			UserDetails userDetails = userDetailService.loadUserByUsername(email);	
			return new ResponseEntity<Object>(userDetails, HttpStatus.OK);	
			
		} catch (Exception e) {
			e.printStackTrace();	
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
	
	@PutMapping("")
	public Object put(@RequestBody UserDto user) {
		try {
			userService.edit(user);
			return new ResponseEntity<Object>(HttpStatus.OK);	
			
		} catch (Exception e) {
			e.printStackTrace();	
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
	@PostMapping("{id}")
	public Object post(@PathVariable int id) {
		try {
			userService.changedPass(id);
			return new ResponseEntity<Object>(HttpStatus.CREATED);	
			
		} catch (Exception e) {
			e.printStackTrace();	
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}

}
