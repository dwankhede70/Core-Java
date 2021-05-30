package Day22042021;

import java.util.*;

//public class college{
//public ........... m1(){
////set all student data and add it into the map here
// Map eng=new HashMap();
//Student s=new Student();
//  }
//public static void main(String args[]){
//   //get all student data using iterator and for each loop here
//}
//}

public class College 
{
	
	Map<Integer , Object> eng = new TreeMap<>();
	
		public Map m1()
		{
			//Map<Integer , Object> eng = new HashMap<>();
			//Map eng = new HashMap();
			
			Student s = new Student();
			s.setRollno(111);
			s.setName("Gaju");
			
			Student s1 = new Student();
			s1.setRollno(222);
			s1.setName("Shubham");

			Student s2 = new Student();
			s2.setRollno(444);
			s2.setName("Shyam");
			
			Student s3 = new Student();
			s3.setRollno(333);
			s3.setName("Kunal");
			
			Student s4 = new Student();
			s4.setRollno(253);
			s4.setName("Rahul");
			
			eng.put(11, s);
			eng.put(22, s1);
			eng.put(33, s3);
			eng.put(55, s4);
			eng.put(44, s2);
			
			
			return eng;
			
		}
		
		public static void main(String[] args) {
			
			
			College c = new College();
			Map s =c.m1();
			
			Set<Integer> st = s.keySet();
			
			System.out.println(st);
			
			System.out.println("=======================");
			for (Integer keys : st) {
				System.out.println(keys);
				Student st2 = (Student) s.get(keys);
				System.out.println(st2.getRollno());
				System.out.println(st2.getName());
				System.out.println("==============");
			}
		}
		
	}
	
