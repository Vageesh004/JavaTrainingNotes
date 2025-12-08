package com.dec8hibern.util;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory=buildSessionFactory();
	
	public static SessionFactory buildSessionFactory() {
		
		Properties props = new Properties();
        try {
			props.load(HibernateUtil.class.getClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(com.dec8hibern.model.Order.class);
		
		cfg.setProperties(props);
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		
		return cfg.buildSessionFactory(builder.build());
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
