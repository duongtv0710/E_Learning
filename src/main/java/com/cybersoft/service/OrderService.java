package com.cybersoft.service;

import com.cybersoft.entity.Order;
import com.cybersoft.entity.OrderDetail;

public interface OrderService {
	void save(Order order,OrderDetail orderDetail);

}
