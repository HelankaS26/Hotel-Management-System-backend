package com.hotelmanagement.service.impl;

import com.hotelmanagement.repository.OrderRepository;
import com.hotelmanagement.service.OrderServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements OrderServiceable {

    @Autowired
    private OrderRepository orderRepository;
}
