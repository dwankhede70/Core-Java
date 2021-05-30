package comm1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching
{
	public static void main(String[] args) 
	{
		int count=0;
		Pattern p = Pattern.compile("ab");
		Matcher m=p.matcher("abababbbbaabaa");
		
		while(m.find())
		{
			count++;
			System.out.print(m.start());
		}
		System.out.println("The no of occurence of req pattern :" +count);
	
	}

}
