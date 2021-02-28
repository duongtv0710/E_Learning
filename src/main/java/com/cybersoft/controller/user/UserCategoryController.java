package com.cybersoft.controller.user;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.dto.CategoryDto;
import com.cybersoft.service.CategoryService;

//Object name:
//Description:
//Input params:
//Output:
//Creator: Trường
//Version:
//Created on:
@RestController
@CrossOrigin("*")
@RequestMapping("/api/user/category")
public class UserCategoryController {
	
private CategoryService categoryService;
	
	public UserCategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping("")
	public Object get() {	
		try {
			List<CategoryDto> listCategory = categoryService.getAll();	
			return new ResponseEntity<Object>(listCategory, HttpStatus.OK);	
			
		} catch (Exception e) {
			e.printStackTrace();	
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}

}
