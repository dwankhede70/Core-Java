package comm1;

public class mystring {
	public static void main(String[] args) {
//		String s = "abc";
//		String s1 = "abc";
//		String s2 = new String ("abc");
//		String s3 = new String ("demo");
//		System.out.println(s1==s2); // check reference
//		System.out.println(s==s1);
//		System.out.println(s.equals(s2));  //check content
//		 s3 = s3.concat("pqr");
//		System.out.println(s3);
		
		String s = "abcdefgh";
		char c1 = s.charAt(2);
		System.out.println(c1);
		
		int x = s.length();
		System.out.println(x);
		
		 s = s.substring(1);
		System.out.println(s);
		
		s = s.substring(1, 4);
		System.out.println(s);
		 
		System.out.println(s.equals(s));
		
		s = s.concat("pqr");
		System.out.println(s);
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());

	}

}
