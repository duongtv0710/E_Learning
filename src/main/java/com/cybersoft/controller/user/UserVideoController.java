package com.cybersoft.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

}
