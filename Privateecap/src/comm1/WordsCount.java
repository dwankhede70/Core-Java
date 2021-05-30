package comm1;
import java.util.Scanner;
	class WordsCount
	 {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String s=sc.nextLine();
			int count=1;
			for(int i=0;i<s.length();i++)
			{
			char c= s.charAt(i);
			char d= s.charAt(i+1); 
			if(c == ' ' &&  d != ' ')
			count++;
			}
			System.out.println("Total no of words in string :" +count);
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the String");
//			String s=sc.nextLine();
//			int l = s.length();
//			int y=s.length()-1;
//			for(int i=y;i>=0;i--)
//			{
//			char c= s.charAt(i);
//			System.out.print(c);
//			}
	}

}
	 