package com.braindatawire.collegemanagementsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Faculty {
	
	@Id
	private int fid;
	private String fname;
	@OneToOne(cascade = CascadeType.ALL)
	private Course Curs;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCurs() {
		return Curs;
	}
	public void setCurs(Course curs) {
		Curs = curs;
	}
	

}
