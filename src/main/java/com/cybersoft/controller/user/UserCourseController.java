package com.cybersoft.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.dto.CourseDto;
import com.cybersoft.service.CourseService;

@RestController
@RequestMapping("/api/user/course")
public class UserCourseController {
	
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

}
