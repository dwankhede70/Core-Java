package com.cjc.onetomany.unidirctional;

import org.hibernate.Session;




public class TestD {
public static void main(String[] args) {
		
		Department dpt = new Department();
		
		dpt.setDid(111);
		dpt.setName("IT");
		
		
//		Department dpt2 = new Department();
//		dpt2.setDid(121);
//		dpt2.setName("SOFTWARE");
		
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setName("Gajanan");
		e1.setDesignation("Developer");
		e1.setDept(dpt);
		
		Employee e3 = new Employee();
		e3.setEid(3);
		e3.setName("Mayuri");
		e3.setDesignation("Developer");
		e3.setDept(dpt);
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		session.save(e1);
		session.save(e3);
		session.beginTransaction().commit();
	}
}
