package Day16042021;

import java.util.*;

public class CollectionArray 
{
	public static void main(String[] args) {
		List mh =new ArrayList();
		mh.add("Pune");
		mh.add("mumbai");
		mh.add("Aurangabad");
		mh.add("Amravati");
		
		List ts=new ArrayList();
		ts.add("Hyderabad");
		ts.add("Secuandarabad");
		ts.add("Ameerpeth");
		ts.add("Highteck city");
		
		
		List america =new ArrayList();
		america.add("new York");
		america.add("Chicago");
		america.add("san Fransisco");
		
		
		List japan=new ArrayList();
		japan.add("Tokyo");
		japan.add("osaka");
		japan.add("sapporo");
		
		
		List india=new ArrayList();
		india.add(mh);
		india.add(ts);
		
		List world=new ArrayList();
		world.add(india);
		world.add(america);
		world.add(japan);
		
		Iterator itr = world.iterator();
		while(itr.hasNext())
		{
			List l=(List) itr.next();
			Iterator itr1 = l.iterator();
			while(itr1.hasNext())
			{
				Object s1= itr1.next();
				System.out.println(s1);
			}
			
		
	}
		
		
		
	}
}
