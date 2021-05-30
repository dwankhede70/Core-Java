package Day16042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		l.add(73.30f);
		l.add(256.39d);
		l.add(11);
		l.add(77l);
		l.add(79.10);
		l.add(87d);
		l.add(58l);
		
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
		Object s= itr.next();
			System.out.print(s+ " "); // 73.3 256.39 11 77 79.1 87.0 58
		}
		
	}
}
