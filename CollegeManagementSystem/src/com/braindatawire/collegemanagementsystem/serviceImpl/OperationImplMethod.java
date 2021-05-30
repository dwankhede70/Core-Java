package com.braindatawire.collegemanagementsystem.serviceImpl;

import java.util.Scanner;

import org.hibernate.Session;

import com.braindatawire.collegemanagementsystem.client.Hibernate;
import com.braindatawire.collegemanagementsystem.model.*;
import com.braindatawire.collegemanagementsystem.service.OperationInterface;

public class OperationImplMethod implements OperationInterface{

	Course c = new Course();
	Batch b = new Batch();
	Faculty f = new Faculty();
	Student s = new Student();
	Session sess = Hibernate.getSessionFactory().openSession();
	
	@Override
	public void addCourse() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Course Details");
		System.out.println("Enter the Course Id:");
		c.setCid(sc1.nextInt());
		System.out.println("Enter the Course Name :");
		c.setCname(sc1.next());
		
		sess.save(c);
		sess.beginTransaction().commit();
		
	}

	@Override
	public void viewCourse() {
		
		System.out.println("Course Id     :"+c.getCid());
		System.out.println("Course Name   :"+c.getCname());
	
	}

	@Override
	public void addFaculty() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Faculty Deatils ");
		System.out.println("Enter the Faculty Id   :");
		f.setFid(sc1.nextInt());
		System.out.println("Enter the Faculty Name :");
		f.setFname(sc1.next());
		
		f.setCurs(c);
		sess.save(f);
		sess.beginTransaction().commit();
		
	}

	@Override
	public void viewFaculty() {
		System.out.println("Faculty Id     :"+f.getFid());
		System.out.println("Faculty Name   :"+f.getFname());
		System.out.println("Course Id      :"+f.getCurs().getCid());
		System.out.println("Course Name    :"+f.getCurs().getCname());
	}

	@Override
	public void addBatch() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Batch Deatils ");
		System.out.println("Enter the Batch Id   :");
		b.setBid(sc1.nextInt());
		System.out.println("Enter the Batch Name :");
		b.setBname(sc1.next());
		
		b.setFact(f);
		
		sess.save(b);
		sess.beginTransaction().commit();
		
	}

	@Override
	public void viewBatch() {
		System.out.println("Batch Id       :"+b.getBid());
		System.out.println("Batch Name     :"+b.getBname());
		System.out.println("Faculty Id     :"+b.getFact().getFid());
		System.out.println("Faculty Name   :"+b.getFact().getFname());
		System.out.println("Course Id      :"+b.getFact().getCurs().getCid());
		System.out.println("Course Name    :"+b.getFact().getCurs().getCname());
	}

	@Override
	public void addStudent() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Student Deatils ");
		System.out.println("Enter the Student Id   :");
		s.setSid(sc1.nextInt());
		System.out.println("Enter the Student Name :");
		s.setSname(sc1.next());
		s.setBach(b);
		sess.save(s);
		sess.beginTransaction().commit();
	}

	@Override
	public void viewStudent() {
		System.out.println("Student Id     :"+s.getSid());
		System.out.println("Student Name   :"+s.getSname());
		System.out.println("Batch Id       :"+s.getBach().getBid());
		System.out.println("Batch Name     :"+s.getBach().getBname());
		System.out.println("Faculty Id     :"+s.getBach().getFact().getFid());
		System.out.println("Faculty Name   :"+s.getBach().getFact().getFname());
		System.out.println("Course Id      :"+s.getBach().getFact().getCurs().getCid());
		System.out.println("Course Name    :"+s.getBach().getFact().getCurs().getCname());
		
		
	}

}
