package com.dec8hibern;

import com.dec8hibern.dao.OrderDao;
import com.dec8hibern.model.Order;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        OrderDao dao=new OrderDao();
        
        //dao.addOrder();
        
        dao.findAllOrders().forEach(System.out::println);
        
        Order o3=new Order(125,"2025-12-8",190,"Ice cream");
        //dao.updateOrder(o3, 125);
        
        dao.deleteOrder(123);
        
        
        
        
    }
}
