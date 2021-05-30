package comm1;
import java.util.*;
public class Vowel {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		//String s="i love my india";
		int vcount=0;
		int ccount=0;
		int space=0;
	int schar=0;
		s= s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vcount++;
				
				
			}
			else if(ch==' ')
			{
				space++;
			}
			else if(ch=='@' || ch=='$' || ch=='&')
			{
				schar++;
			}
				
			
						else  {
				ccount++;
			}
			
			}
				
		
		System.out.println("Numbers of vowels are :" +vcount);
		System.out.println("Numbers of consonants are :" +ccount);
		System.out.println("Number of spaces are : " +space);
		System.out.println("Number of specail character :" +schar);
		
	}
	}


