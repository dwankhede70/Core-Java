package Day16042021;
//6. Write the collection program to set employee data and add into list and get this data using iterator.
//public class Employee{
//	private  int empid;
//	private  String empname;
//	private  String empdesig;
//	private double empsalary;
//	//  setter/getter
//}
//public class Details{
//	public ......... setdetails(){
//     	//set employee data here and add it into list.
//     		Employee e=new Employee();
//
//   
//   	}
//    	public ............. getdetails(.............){
//     //get employee data here using iterator.
//    	}
//}
//public class Test{    
//	public static void main(String args[]){
//        		Details d=new Details();
//         	...... data = d.setdetails(...........);
//        		d.getdetails(.............);
//  	}
//}
public class Employee
{
	private  int empid;
	private  String empname;
	private  String empdesig;
	private double empsalary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesig() {
		return empdesig;
	}
	public void setEmpdesig(String empdesig) {
		this.empdesig = empdesig;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	
}
