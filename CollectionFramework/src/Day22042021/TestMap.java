package Day22042021;

import java.util.HashMap;
import java.util.*;

public class TestMap 
{
	public static void main(String[] args) 
	{
		Map<String, String> m = new HashMap<>();
		m.put("aaa", "Java");
		m.put("bbb", "Python");
		m.put("ccc", "Spring");
		
		Set<String> keys = m.keySet();
		
		for(String key : keys)
		{
			System.out.println(key);
			
			String val=m.get(key);
			
			System.out.println(val);
		}
		
	}
}
