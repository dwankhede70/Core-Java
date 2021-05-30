package com.braindata.bankmanagement.model;

public class Account 
{
	private String accNo;
	private String name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private String age;
	private String minBal;
	public String getAccNo()
	{
		return accNo;
	}
	public String getMinBal() {
		return minBal;
	}
	public void setMinBal(String minBal) {
		this.minBal = minBal;
	}
	public void setAccNo(String accNo) 
	{
		this.accNo = accNo;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getMobNo()
	{
		return mobNo;
	}
	public void setMobNo(String mobNo) 
	{
		this.mobNo = mobNo;
	}
	public String getAdharNo()
	{
		return adharNo;
	}
	public void setAdharNo(String adharNo) 
	{
		this.adharNo = adharNo;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getAge() 
	{
		return age;
	}
	public void setAge(String age) 
	{
		this.age = age;
	}

}
