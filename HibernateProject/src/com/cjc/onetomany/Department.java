package com.cjc.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Department {
	@Id
	@Column(name="d_id")
	private int did;
	private String name;
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "dept")
	private Set<Employee> semp = new HashSet<Employee>();
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getSemp() {
		return semp;
	}
	public void setSemp(Set<Employee> semp) {
		this.semp = semp;
	}

}
