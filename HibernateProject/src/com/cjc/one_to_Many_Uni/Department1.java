package com.cjc.one_to_Many_Uni;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Department1 {

		@Id
		@Column(name = "dpt_id")
		private int did;
		
		@Column(name = "dpt_name")
		private String name;
		
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name = "dept_id")

		Set<Employee> semp = new HashSet<Employee>();
	
		public int getDid() {
			return did;
		}

		public void setDid(int did) {
			this.did = did;
		}

		public Set<Employee> getSemp() {
			return semp;
		}

		public void setSemp(Set<Employee> semp) {
			this.semp = semp;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
