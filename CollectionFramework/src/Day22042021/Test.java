package Day22042021;


import java.util.*;

public class Test
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		List mh = new ArrayList();
		mh.add("a.Pune");
		mh.add("b.Mumbai");
		mh.add("c.Nagpur");
		mh.add("d.Nanded");
		mh.add("e.Amravati");
		
		List ts = new ArrayList();
		ts.add("a.Hyd");
		ts.add("b.Koti");
		ts.add("c.Ammerpeth");
		ts.add("d.HighTechCity");
		ts.add("e.Secundrabad");
		
		Map<String,List<String>> ind = new HashMap<>();
		ind.put("1.Maharastra", mh);
		ind.put("2.Telangana", ts);
		
		Set<String> keys = ind.keySet();
		System.out.println("No of States In India");
		System.out.println(keys);
		System.out.println("================================");
		
		for(String key : keys)
		{
			System.out.println(key);
			
			List<String> list=ind.get(key);
			
			System.out.println("No of Cities in this State");
			System.out.println("================================");
			//System.out.println(list);
			
			for(String city :list)
			{
				System.out.println(city);
			}
			System.out.println("================================");
		}
		
						
		
	}
}