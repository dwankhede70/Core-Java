package pack;

		class Testimmutablestring1
		{
//			 public static void main(String args[])
//			 {
//			   String s="Sachin";
//			   s=s.concat(" Tendulkar");
//			   System.out.println(s);
//			 }
//			}

//	public class Testimmutablestring1
//	{  
//				public static void main(String args[])
////			{  
//				String s1="javatpoint";  
//				String s2="javatpoint";  
//				String s3="JAVATPOINT";  
//				String s4="python";  
//				System.out.println(s1.equals(s2));//true because content and case is same  
//				System.out.println(s1.equals(s3));//false because case is not same  
//				System.out.println(s1.equals(s4));//false because content is not same  
//			}
//	}  
//						  
//	public static void main(String args[])
//	{  
//				String s1="javatpoint";  
//				String s2="javatpoint";  
//				String s3="JAVATPOINT";  
//				String s4="python";  
//				System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
//				System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
//				System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
//				}
//	}  
	public static void main(String args[])
			{  
//			String s1="java string";  
//			s1.concat("is immutable");  
//			System.out.println(s1);  
//			s1=s1.concat(" is immutable so assign it explicitly");  
//			System.out.println(s1);  
//			}
		
//		String s="shubham";
//		StringBuffer sb = new  StringBuffer(s); //String to StringBuffer 
//		System.out.println(sb);
		
//		StringBuffer sb = new  StringBuffer("Shubham"); //StringBuffer to String
//		String s=sb.toString();
//		sb.append(" Bhelonde");
//		System.out.println(sb);
		
		
		String s1="shubham";
		String s2="shubham";
		System.out.println(s1.equals(s2));
		
		String s=new String("shubham");
		String s3=new String("bhelonde");
		System.out.println(s.equals(s3));
	}  
}