package com.dec8hibern.dao;

import java.util.List;

import com.dec8hibern.model.Order;

public interface OrderDaoInterface {
	
	public void addOrder();
	public List<Order> findAllOrders();
	
	public Order updateOrder(Order order,int id);
	public void deleteOrder(int id);
	
	public List<Order> findOrderById();
	
	public List<Order> findOrdersBtwRange();
	
	public List<Order> findOrdersGreaterThan();
	
	
	
	

}
