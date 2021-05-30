package com.braindatawire.collegemanagementsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	@OneToOne(cascade = CascadeType.ALL)
	private Batch bach;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getBach() {
		return bach;
	}
	public void setBach(Batch bach) {
		this.bach = bach;
	}

	
}
