package com.cybersoft.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cybersoft.entity.Order;
import com.cybersoft.entity.OrderDetail;
import com.cybersoft.service.OrderService;

//Object name:
//Description:
//Input params:
//Output:
//Creator: Trường
//Version:
//Created on:
@RequestMapping("/api/user/order")
public class UserOrderController {
	@Autowired
	private OrderService orderService;
	
	@PostMapping("")
	public Object post(@RequestBody Order order,@RequestBody OrderDetail orderDetail) {
		try {
			orderService.save(order, orderDetail);
			return new ResponseEntity<Object>(HttpStatus.CREATED);
			
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			
		}
	}

}
