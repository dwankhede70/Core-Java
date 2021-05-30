package Day16042021;
//5. Write the collection program to set student data using Scanner and get this data using iterator.
//public class Student{
//	private  int rollno;
//  	private  String name;
// 	//  setter/getter
//}
//public class College{
//	public ............ m1(){
//    	//set and add student data into list here
//   		List l=new ArrayList();
//   		Student s=new Student();
//
//
//   		Student s1=new Student();
//
//	}
//}
//public class Univercity{
//	public static void main(String args[]){
//       		College c=new College();
//         		........ data=c.m1();
//      		// get your data using Iterator here
//      	}
//}

public class Student1 
{
	private  int rollno;
  	private  String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
