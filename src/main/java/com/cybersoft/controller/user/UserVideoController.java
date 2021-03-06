package com.cybersoft.controller.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.dto.VideoDto;
import com.cybersoft.service.VideoService;

//Object name:
//Description:
//Input params:
//Output:
//Creator: Trường
//Version:
//Created on:
@RestController
@RequestMapping("/api/user/video")
public class UserVideoController {
	
	@Autowired
	private VideoService videoService;

	@GetMapping("")
	public Object get() {
		try {
			List<VideoDto> listVideo = videoService.getAll();
			return new ResponseEntity<Object>(listVideo, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("{id}")
	public Object get(@PathVariable int id) {
		try {
			VideoDto video = videoService.getById(id);
			return new ResponseEntity<Object>(video, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("")
	public Object post(@Valid @RequestBody VideoDto dto) {
		try {
			videoService.save(dto);
			return new ResponseEntity<Object>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("")
	public Object put(@Valid @RequestBody VideoDto dto) {
		try {
			videoService.edit(dto);
			return new ResponseEntity<Object>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("{id}")
	public Object delete(@PathVariable int id) {
		try {
			videoService.deleteById(id);
			return new ResponseEntity<Object>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

}
