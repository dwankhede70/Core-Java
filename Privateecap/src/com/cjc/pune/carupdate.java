package com.cjc.pune;
import com.cjc.karve.*;

import comm1.Info;

public class carupdate extends Car{
	private int updcno;
	private String updcname;
	private String updcmodel;
	private String updcowner;
	private double updcprice;
	protected int getUpdcno() {
		return updcno;
	}
	protected void setUpdcno(int updcno) {
		this.updcno = updcno;
	}
	protected String getUpdcname() {
		return updcname;
	}
	protected void setUpdcname(String updcname) {
		this.updcname = updcname;
	}
	protected String getUpdcmodel() {
		return updcmodel;
	}
	protected void setUpdcmodel(String updcmodel) {
		this.updcmodel = updcmodel;
	}
	protected String getUpdcowner() {
		return updcowner;
	}
	protected void setUpdcowner(String updcowner) {
		this.updcowner = updcowner;
	}
	protected double getUpdcprice() {
		return updcprice;
	}
	protected void setUpdcprice(double updcprice) {
		this.updcprice = updcprice;
	}
  
	protected Info  getData()
		{
			carupdate c = new carupdate();
			//Print c = new Print();
			c.setCno(1234);
			c.setCname("Audi");
			c.setCmodel("NXU");
			c.setCowner("Shubham");
			c.setCprice(124500);
			//return c;
			
			
			Info i = new Info();
			
			i.setUpdcno(c.getCno());
			i.setUpdcname(c.getCname());
		    i.setUpdcmodel(c.getCmodel());
		    i.setUpdcowner(c.getCowner());
		    i.setUpdcprice(c.getCprice());
		    return i;
			
		
		/*c.getCno();
		c.getCname();
		c.getCmodel();
		c.getCowner();
		c.getCprice();
		return c;*/
}
}