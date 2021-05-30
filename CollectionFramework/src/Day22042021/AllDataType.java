package Day22042021;

import java.util.*;

public class AllDataType 
{

	public static void main(String[] args) {
		
		List mh=new ArrayList<>();
		mh.add("pune");
		mh.add("mumbai");
		mh.add("mumbai");
		mh.add(10);
		mh.add(20);
		mh.add(30);
		
		
		
		Iterator itr=mh.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
			
			if(o instanceof Integer ) 
			
			{
				int x=(int)o;
				System.out.println(x);
			}
			
			if(o instanceof String)
			
			{
				String s=(String)o;
				System.out.println(s+s );
			}
			
			
			
			}
	}
	

}
