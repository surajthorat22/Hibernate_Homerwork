package com.DemoHiberEmployee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Main {

	public static void main(String[] args) {
		
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(EmployeeEntity.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
	
	EmployeeEntity e = new EmployeeEntity();
	System.out.println("Application is Started!!!");

	}
}