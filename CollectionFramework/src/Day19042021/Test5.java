package Day19042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5 
{

	public static void main(String[] args) 
	{
		List mh = new ArrayList();
		mh.add("pune");
		mh.add("Mumbai");
		System.out.println(mh);
		
		List ts = new ArrayList();
		ts.add("Hyd");
		ts.add("Secundrabad");
		System.out.println(ts);
		
		List a1 = new ArrayList();
		a1.add("abc");
		a1.add("xyz");
		System.out.println(a1);
		
		List a2 = new ArrayList();
		a2.add("abc1");
		a2.add("xyz1");
		System.out.println(a2);
		
		List ind = new ArrayList();
		ind.add(mh);
		ind.add(ts);
		System.out.println(ind);
		
		List america =new ArrayList();
		america.add(a1);
		america.add(a2);
		System.out.println(america);

		
		List world = new ArrayList();
		world.add(ind);
		world.add(america);
		System.out.println(world);
//=================================================================================
//		retrive data here without using generics
		 
		Iterator itr = world.iterator();
		while(itr.hasNext())
		{
			List  l=(List) itr.next();
			Iterator itr1 = l.iterator();
			while(itr1.hasNext())
			{
				List l1= (List) itr1.next();
				
				Iterator itr2=l1.iterator();
				while(itr2.hasNext())
				{
					String l2 =(String) itr2.next(); 
					System.out.println(l2);
				}
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}