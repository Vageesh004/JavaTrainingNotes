package com.dec8hibern.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dec8hibern.util.HibernateUtil;

import com.dec8hibern.model.Order;

public class OrderDao implements OrderDaoInterface{
	
	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Order o=new Order(123,"2025-12-8",150,"Double Patty Burger");
		Order o2=new Order(124,"2025-12-8",200,"Veg Pizza");
		Order o3=new Order(125,"2025-12-8",200,"Biryani");
		
		
		session.save(o);
		session.save(o2);
		session.save(o3);
		
		transaction.commit();
		session.close();
		
		
	}

	@Override
	public List<Order> findAllOrders(){
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<Order> orderList=session.createQuery("From Order",Order.class).list();
		session.close();
		return orderList;
	}

	@Override
	public List<Order> findOrderById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findOrdersBtwRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findOrdersGreaterThan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Order updatedOrder, int id) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Order existing=session.get(Order.class, id);
		
		if(existing==null) {
			session.close();
			return null;
		}
		
		existing.setOrderDate(updatedOrder.getOrderDate());
		existing.setCost(updatedOrder.getCost());
		existing.setListOfItems(updatedOrder.getListOfItems());
		
		transaction.commit();
		session.close();
		
		return existing;
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Order o=session.get(Order.class,id);
		
		if(o!=null) {
			session.delete(o);
		}
		
		tx.commit();
		session.close();
		
	}

	
}
