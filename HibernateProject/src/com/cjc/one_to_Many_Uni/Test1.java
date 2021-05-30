package com.cjc.one_to_Many_Uni;

import org.hibernate.Session;

public class Test1 {
	public static void main(String[] args) 
	{
		Department1 dpt = new Department1();
		dpt.setDid(20);
		dpt.setName("IT");
		
		Employee e1 = new Employee();
		e1.setEmpid(111);
		e1.setName("Shrikant");
		e1.setDesignation("Tester");
		
		
		Employee e2 = new Employee();
		e2.setEmpid(1);
		e2.setName("Shubham");
		e2.setDesignation("Developer");
		
		dpt.getSemp().add(e1);
		dpt.getSemp().add(e2);
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.save(dpt);
	
		session.beginTransaction().commit();
		
	}

}
