package Day20042021;

public class Employee implements Comparable<Employee>
{
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public int compareTo(Employee emp)
	{
		//return this.eid-emp.eid;                   // primitive data types
		
		return this.ename.compareTo(emp.ename);  // Non primitive data types
	}
}

