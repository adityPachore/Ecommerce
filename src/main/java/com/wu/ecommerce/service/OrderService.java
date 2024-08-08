package com.wu.ecommerce.service;

import java.util.ArrayList;
import java.util.Optional;

import com.wu.ecommerce.dto.Order;
import com.wu.ecommerce.dto.Product;
//import com.wu.ecommerce.exceptions.IdNotFoundException;
import com.wu.ecommerce.exception.IdNotFoundException;

public interface OrderService {
	
public Order addOrder(Order order);
	
	public Order getOrderByOrderId(String orderId);
	
	public ArrayList<Order> getOrderByUserId(String userId);
	
	public Order updateOrderDetails(String id, Order order);
	
	public String deleteOrder(String id);

	public void addProduct(Order order);

}