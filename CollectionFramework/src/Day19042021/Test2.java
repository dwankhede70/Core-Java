package Day19042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2
{

	public static void main(String[] args) 
	{
		 
		List <Double>l1 = new ArrayList<Double>();
		
		// we can not add diffirent type of data other than double type data where
		//list generic type is double
		
		//complier error
		
		l1.add(10.0);    
		l1.add(10.2);   
		l1.add(20.00);  
		l1.add(25.12); 
//==================================================================    
//		
//		Iterator itr= l1.iterator();
//		while(itr.hasNext())
//		{
//			double d = (double) itr.next();
//			
//			System.out.println(d);
//			
//		}
//===================================================================		
		for(double d:l1)
		{
			System.out.println(d);
		}
	}	
	
}
