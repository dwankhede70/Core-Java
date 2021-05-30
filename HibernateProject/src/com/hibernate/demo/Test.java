package com.hibernate.demo;
public class Test 
{
	public static void main(String[] args) 
	{
		StandardServiceRegistry registry = new 	StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds= new MetadataSources(registry);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sessionf=md.getSessionFactoryBuilder().build();
		Session session =sessionf.openSession();
		Student s = new Student();
		s.setRollno(1);
		s.setName("Shubham");
		s.setAddr("Pune");
		session.save(s);
		session.beginTransaction().commit();
		
	}
}
