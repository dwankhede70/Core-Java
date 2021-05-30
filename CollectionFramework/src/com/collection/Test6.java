package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test6 
{
public static void main(String[] args) 
	{
	
	List mh = new ArrayList();
	mh.add("Pune");
	mh.add("Mumbai");
	System.out.println("Cities in mh state =" +mh);
	
	List ts = new ArrayList();
	ts.add("Hyd");
	ts.add("Trichii");
	System.out.println("Cities in ts state =" +ts);
	
	List jh = new ArrayList();
	jh.add("Ranchi");
	jh.add("Bokaro");
	System.out.println("Cities in jh state =" +jh);
	
	List ind = new ArrayList();
	ind.add(mh);
	ind.add(ts);
	ind.add(jh);
	System.out.println("States in India =" +ind);
	
	Iterator itr = ind.iterator();
	while(itr.hasNext())
	{
		List l = (List) itr.next();
		Iterator itr1 = l.iterator();
		while(itr1.hasNext())
		{
			String s =(String) itr1.next();
			System.out.println(s);
		}
		
	}
	}
}
