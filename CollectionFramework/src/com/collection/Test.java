package com.collection;
import java.util.*; 
public class Test 
{
	public static void main(String args[])
	{  
	List list=new ArrayList();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay");  
	//Traversing list through Iterator  
	Iterator itr=list.iterator();  
	while(itr.hasNext())
	{ 
		 
	System.out.println(itr.next());  
	}  
	}  
}  

