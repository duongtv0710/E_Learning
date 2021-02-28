package com.cybersoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.entity.Order;
import com.cybersoft.entity.OrderDetail;
import com.cybersoft.repository.OrderDetailRepository;
import com.cybersoft.repository.OrderRepository;
import com.cybersoft.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	

	@Override
	public void save(OrderDetail dto) {
		OrderDetail entity = new OrderDetail();
		entity.setId(dto.getId());
		entity.setOrderID(dto.getOrderID());
		
		orderDetailRepository.save(entity);
		
	}

}
