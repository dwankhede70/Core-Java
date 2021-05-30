package Day16042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 
{
	
		public static void main(String[] args) 
		{
			List l = new ArrayList();
			l.add(34);
			l.add("abc");
			l.add('m');
			l.add("xyz");
			l.add(45);
			l.add('A');
			
			Iterator itr = l.iterator();
			
			while(itr.hasNext())
			{
			Object s=itr.next();
				System.out.print(s+ " ");// 34 abc m xyz 45 A 
			}
			
		}
		
	}

