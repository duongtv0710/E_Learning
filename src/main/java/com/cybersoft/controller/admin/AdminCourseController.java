package com.cybersoft.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.dto.CourseDto;
import com.cybersoft.service.CourseService;

@RestController
@RequestMapping("/api/admin/course")
public class AdminCourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("")
	public Object get() {
		try {
			List<CourseDto> listCourse = courseService.getAll();
			return new ResponseEntity<Object>(listCourse, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
	
	@PostMapping("")
	public Object post(@RequestBody CourseDto courseDto) {
		try {
			courseService.add(courseDto);
			return new ResponseEntity<Object>(HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
	
	@PutMapping("")
	public Object put(@RequestBody CourseDto courseDto) {
		try {
			courseService.update(courseDto);
			return new ResponseEntity<Object>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
	
	@DeleteMapping("{id}")
	public Object delete(@RequestParam int id) {
		try {
			courseService.deleteById(id);
			return new ResponseEntity<Object>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}
}