package Day22042021;

import java.util.*;

public class Test1 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		List mh = new ArrayList();
		mh.add("pune");
		mh.add("Mumbai");
		//System.out.println(mh);
		
		List ts = new ArrayList();
		ts.add("Hyd");
		ts.add("Secundrabad");
		//System.out.println(ts);
		
		List a1 = new ArrayList();
		a1.add("abc");
		a1.add("xyz");
		//System.out.println(a1);
		
		List a2 = new ArrayList();
		a2.add("abc1");
		a2.add("xyz1");
		//System.out.println(a2);
		
		List ind = new ArrayList();
		ind.add(mh);
		ind.add(ts);
		//System.out.println(ind);
		
		List america =new ArrayList();
		america.add(a1);
		america.add(a2);
		//System.out.println(america);

		
		Map<List,List<List>> world = new HashMap<>();
		
		world.put(ind,mh);
		world.put(ind, ts);
		world.put(america,a1);
		world.put(america, a2);
		
		Map<String, List<String>> States =new HashMap<>();
		States.put("Maharastra", mh);
		States.put("Telangana", ts);
		States.put("a11", a1);
		States.put("a22", a2);
		
		
		Set<List> keys=world.keySet();
		System.out.println(keys);
		
		for(List<List<String>> key : keys)
		{
			System.out.println(key);
			List l=world.get(key);
			System.out.println(l);
			
			//List<String> l1=States.get(l);
			//System.out.println(l1);
			 

		}
		
		
		
		
		
		
		
		
		
	}
}
