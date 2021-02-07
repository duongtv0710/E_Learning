package com.cybersoft.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.dto.CategoryDto;
import com.cybersoft.service.CategoryService;

@RestController
@RequestMapping("/api/admin/category")
public class AdminCategoryController {
	
	@Autowired
	CategoryService categoryService;

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
	
	@PostMapping("")
	public Object post(@RequestBody CategoryDto category) {
		try {
			categoryService.save(category);	
			return new ResponseEntity<Object>(HttpStatus.CREATED);	
			
		} catch (Exception e) {
			e.printStackTrace();	
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
	
	@PutMapping("")
	public Object put(@RequestBody CategoryDto category) {
		try {
			categoryService.edit(category);
			return new ResponseEntity<Object>(HttpStatus.OK);	
			
		} catch (Exception e) {
			e.printStackTrace();	
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
	
	@DeleteMapping("{id}")
	public Object delete(@PathVariable int id) {
		try {
			categoryService.deleteById(id);
			return new ResponseEntity<Object>(HttpStatus.OK);	
			
		} catch (Exception e) {
			e.printStackTrace();	
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
}
