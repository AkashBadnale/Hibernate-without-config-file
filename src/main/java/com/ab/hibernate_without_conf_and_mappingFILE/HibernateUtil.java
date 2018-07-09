package com.ab.hibernate_without_conf_and_mappingFILE;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private  static  SessionFactory  sessionFactory = null;
	private  static  Session  session  = null;
	
	public  static  Session  getSession() {
		
		Properties  properties  = new Properties();
		properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/test");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "root");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		properties.setProperty("show_sql", "true");
		
		Configuration  cfg = new Configuration();
		cfg.addAnnotatedClass(Person.class);
		cfg.setProperties(properties);
		
		if(sessionFactory == null) {
		sessionFactory = cfg.buildSessionFactory();
		session = sessionFactory.openSession();
		return  session;
		}
		session = sessionFactory.openSession();
		return session;
	}//getSession()
	
	public  static  void  flushNcommit(Session  session , Transaction  tx) {
		if(session != null) {
			session.flush();
		}
		if(tx != null) {
			tx.commit();
		}
	}//flushNcommit
}//HibernateUtil
