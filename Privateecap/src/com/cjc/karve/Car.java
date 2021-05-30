package com.cjc.karve;

public class Car {
	private int cno;
	private String cname;
	private String cmodel;
	private String cowner;
	private double cprice;
	protected int getCno() 
	{
		return cno;
	}
	protected void setCno(int cno) 
	{
		this.cno = cno;
	}
	protected String getCname() 
	{
		return cname;
	}
	protected void setCname(String cname)
	{
		this.cname = cname;
	}
	protected String getCmodel()
	{
		return cmodel;
	}
	protected void setCmodel(String cmodel)
	{
		this.cmodel = cmodel;
	}
	protected String getCowner()
	{
		return cowner;
	}
	protected void setCowner(String cowner) 
	{
		this.cowner = cowner;
	}
	protected double getCprice() 
	{
		return cprice;
	}
	protected void setCprice(double cprice)
	{
		this.cprice = cprice;
	}
	
	
}