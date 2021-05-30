package Day22042021;
//Q4. Wtite the collection program for Map of Employee.
//i) Without generic 
//ii) With generic using iterator
//iii) With generic using for each loop
//public class Employee{
//   priavte int eid;
//   private String ename;
//   private double esalary;
//  //setter/getter
//}
//public class company{
//  public ........... designation(){
//    //set all employee data and add it into the map here
//     Map team=new HashMap();
//       }
//  public static void main(String args[]){
//       //get all employee data using iterator and for each loop here  
// }
public class Employee 
{
	private int eid;
	private String ename;
 	public int getEid() 
 	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public double getEsalary()
	{
		return esalary;
	}
	public void setEsalary(double esalary) 
	{
		this.esalary = esalary;
	}
	private double esalary;
}
