package com.cjc.karvenagar;

public class Student {
	int rollno;
	String name;
	protected Hostel stdInfo(int x,String s)
{
	Hostel h = new Hostel();
	rollno=x;
	name=s;
	return h;
}

}
public class B extends Hostel
{
	
}
