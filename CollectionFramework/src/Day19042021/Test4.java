package Day19042021;
import java.util.*;

	public class Test4 
	{
		public static void main(String[] args) 
		{
			List<String> mh = new ArrayList<>();
			mh.add("pune");
			mh.add("Mumbai");
			System.out.println(mh);
			
			List<String> ts = new ArrayList<>();
			ts.add("Hyd");
			ts.add("Secundrabad");
			System.out.println(ts);
			
			List<String> a1 = new ArrayList<>();
			a1.add("abc");
			a1.add("xyz");
			System.out.println(a1);
			
			List<String> a2 = new ArrayList<>();
			a2.add("abc1");
			a2.add("xyz1");
			System.out.println(a2);
			
			List<List<String>> ind = new ArrayList<>();
			ind.add(mh);
			ind.add(ts);
			System.out.println(ind);
			
			List<List<String>> america =new ArrayList<>();
			america.add(a1);
			america.add(a2);
			System.out.println(america);

			
			List<List<List<String>>> world = new ArrayList<>();
			world.add(ind);
			world.add(america);
			System.out.println(world);
			  
//===================================================================
//			retrive data here by using for-each loop		
			
//			for(List<List<String>> l:world)
//			{
//			for(List<String> l1:l)
//			{
//				for(String l2 :l1)
//				System.out.println(l2);
//			}
//			}
			
//===================================================================
//			retrive data here by using Iterator				
			
			Iterator<List<List<String>>> itr = world.iterator();
			while(itr.hasNext())
			{
				List<List<String>> l=itr.next();
				Iterator<List<String>> itr1 = l.iterator();
				while(itr1.hasNext())
				{
					List<String> l1=itr1.next();
					System.out.println(l1);
				}
				
			}
			
		}
	}


