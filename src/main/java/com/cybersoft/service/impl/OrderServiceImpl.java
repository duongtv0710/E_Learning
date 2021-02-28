package com.cybersoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.entity.Order;
import com.cybersoft.entity.OrderDetail;
import com.cybersoft.entity.Role;
import com.cybersoft.repository.OrderDetailRepository;
import com.cybersoft.repository.OrderRepository;
import com.cybersoft.repository.RoleRepository;
import com.cybersoft.service.AuthService;
import com.cybersoft.service.OrderDetailService;
import com.cybersoft.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
private OrderRepository orderRepository;

	private OrderDetailService orderDetailService;
	
	public OrderServiceImpl(OrderDetailService orderDetailService) {
		this.orderDetailService = orderDetailService;
	}

	@Override
	public void save(Order order,OrderDetail orderDetail) {
		Order entity = new Order();
		entity.setId(order.getId());
		entity.setTotal(order.getTotal());
		
		orderRepository.save(entity);
		
		OrderDetail entityDetail = new OrderDetail();
		entityDetail.setId(orderDetail.getId());
		entityDetail.setOrderID(orderDetail.getOrderID());
		orderDetailService.save(entityDetail);
		
	}

}
