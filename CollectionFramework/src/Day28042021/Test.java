package Day28042021;

import java.util.*;

public class Test
{
	public static void main(String[] args) 
	{
		
//=============================================================================
//        conversion of Array to Arraylist
//=============================================================================		
//		String[] s= {"Shubham","Gaju","Dhyana","Swapnil"};
//		
//		List<String> al = new ArrayList<String>(Arrays.asList(s));
//		al.add("Ajay");
//		al.add("Shubhya");
//		al.add("Vrshya");
//		
//		for(String s1:al)
//		{
//			System.out.println(s1);
//		}
//=============================================================================
//      conversion of Arraylist to Array
//=============================================================================		
	
	List<String> al=new ArrayList<>();
	al.add("Ajay");
	al.add("Gajya");
	al.add("Vrushya");
	al.add("Dhanya");
	al.add("Shubhya");
	System.out.println(al);
	
	String[] s =new String[al.size()];
	
	al.toArray(s);// used only when we used Generic Version(Same type of data)
	
	for(String str : al)
	{
		System.out.println(str);
	}
	System.out.println("=======================================================");
	List a1=new ArrayList();
	a1.add("Ajay");
	a1.add(10);
	a1.add(10.5);
	a1.add('a');
	a1.add(true);
	System.out.println(a1);
	
	Object[] oo=a1.toArray();// used only when we used Normal Version 
							//bcoz we dont know which object is return 
	
	for(Object o : oo)
	{
		System.out.println(o);
	}
	
	}
}
