package com.dec8hibern.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.NamedQuery;

import jakarta.persistence.NamedQueries;

@Entity
@Table(name="orderss")
public class Order {
	
	@Id
	public int orderId;
	public String orderDate;
	public double cost;
	public String listOfItems;
	
	public Order(int orderId, String orderDate, double cost, String listOfItems) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.cost = cost;
		this.listOfItems = listOfItems;
	}

	public Order() {
		super();
	}

	
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(String listOfItems) {
		this.listOfItems = listOfItems;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", cost=" + cost + ", listOfItems="
				+ listOfItems + "]";
	}
	
	

}
