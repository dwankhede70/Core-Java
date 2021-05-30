package Day19042021;
import java.util.*;
public class Test 
 
	{
		public static void main(String[] args) 
		{
			// all type of data added here in the list 
			List <String>l1 = new ArrayList<String>();
			
			// we can not add diffirent type of data other than string type data where
			//list generic type is String
			
			//complier error
			
			l1.add("10");    
			//l1.add(10.2f);   //complier error
			//l1.add(20.00);   //complier error
			//l1.add('a');    //complier error
			
			// we can add only string type data when list generic type is string
			l1.add("Xyz");
			
			//int x = (int)l1.get(0);// complier error
			
			String s = l1.get(0);
			String s1 = l1.get(1);
			System.out.println(s);
			System.out.println(s1);
			
			
			
			
			
			
			
		}

	}

