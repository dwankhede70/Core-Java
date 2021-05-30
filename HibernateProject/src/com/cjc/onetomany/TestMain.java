package com.cjc.onetomany;

import org.hibernate.Session;

public class TestMain {

	public static void main(String[] args) {
		
		Department dpt = new Department();
		
		dpt.setDid(111);
		dpt.setName("IT");
		
		
		Department dpt2 = new Department();
		dpt2.setDid(121);
		dpt2.setName("SOFTWARE");
		
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setName("Gajanan");
		e1.setDesignation("Developer");
		
		e1.setDept(dpt);
		
		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setName("Shubham");
		e2.setDesignation("Testing");
		
		e2.setDept(dpt);
		
		Employee e3 = new Employee();
		e3.setEid(3);
		e3.setName("Mayuri");
		e3.setDesignation("Developer");
		
		e3.setDept(dpt2);
		
		Employee e4 = new Employee();
		e4.setEid(4);
		e4.setName("Anjali");
		e4.setDesignation("Testing");
		
		e4.setDept(dpt2);
		
		dpt.getSemp().add(e1);
		dpt.getSemp().add(e2);
		
		dpt2.getSemp().add(e3);
		dpt2.getSemp().add(e4);
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		session.save(dpt);
		session.save(dpt2);
		session.beginTransaction().commit();
		
	}
}
