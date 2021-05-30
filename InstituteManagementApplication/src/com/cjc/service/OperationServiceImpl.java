package com.cjc.service;

import com.cjc.db.OperationDbImpl;

public class OperationServiceImpl implements OperationService
{
	OperationDbImpl odb = new OperationDbImpl();

	@Override
	public void addCourse() 
	{
	odb.addCourse();	
		
	}

	@Override
	public void viewCourse()
	{

		odb.viewCourse();
		
	}

	@Override
	public void addFaculty() 
	{
		odb.addFaculty();
		
	}

	@Override
	public void viewFaculty() 
	{
		odb.viewFaculty();
		
	}

	@Override
	public void addBatch()
	{

		odb.addBatch();
		
	}

	@Override
	public void viewBatch() 
	{

		odb.viewBatch();
		
	}

	@Override
	public void addStudent()
	{
		odb.addStudent();
		
	}

	@Override
	public void viewStudent()
	{
		odb.viewStudent();
		
	}

}
