package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Test1 
{
public static void main(String[] args)
{
	List b= new ArrayList();
	System.out.println("Elements in List =" +b);
	b.add(10);
	b.add(20);
	b.add(30);
	System.out.println("Elements in List =" +b);
	b.add(40);
	b.add(50);
	b.add(60);
	
	System.out.println("Elements in List =" +b);
	System.out.println("Size of List =" +b.size());
	
	b.add(1, "shubham");
	System.out.println("Elements in List =" +b);
	System.out.println("Size of List =" +b.size());
	
	b.remove(3);
	System.out.println("Elements in List =" +b);
	System.out.println("Size of List =" +b.size());
	
	b.remove("shubham");
	System.out.println("Elements in List =" +b);
	System.out.println("Size of List =" +b.size());
	
	System.out.println(b.isEmpty());
	//b.clear();
	//System.out.println(b.isEmpty());
	
	for(int i =0; i<b.size();i++)
	{
		System.out.println("Data of list b =" +b.get(i));
	}
}
}
