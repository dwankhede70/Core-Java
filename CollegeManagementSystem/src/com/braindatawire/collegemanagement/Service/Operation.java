package com.braindatawire.collegemanagement.Service;

import com.braindatawire.collegemanagement.ServiceImpl.NameInvalidException;

@SuppressWarnings("unused")
public interface Operation 
{
	public void addCourse()  throws NameInvalidException;
	public void viewCourse();
	public void addFaculty() throws NameInvalidException;
	public void viewFaculty();
	public void addBatch()   throws NameInvalidException;
	public void viewBatch();
	public void addStudent() throws NameInvalidException;
	public void viewStudent();
	
}
