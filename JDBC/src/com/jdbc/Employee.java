package com.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")  
public class Employee 	
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Statement stm=null;
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
//		String sql="create table Employee4(eid int(5),ename varchar(100),esal varchar(100),edept varchar(100),eaddr varchar(100))";
//		System.out.println("Employee4 Table created successsfully ");
//		Statement smt = con.createStatement();
//		smt.execute(sql);
		
		Scanner sc = new Scanner(System.in);
		for(int i =1; i<=5 ;i++) 
		{
			System.out.println("Enter the Employee Id =");
			int eid = sc.nextInt();
			System.out.println("Enter the Employee Name =");
			String ename = sc.next();
			System.out.println("Enter the Employee Salary =");
			String esal = sc.next();
			System.out.println("Enter the Employee Department =");
			String edept = sc.next();
			System.out.println("Enter the Employee Address =");
			String eaddr = sc.next();
			
			String sql="insert into Employee4 values("+eid+",'"+ename+"','"+esal+"','"+edept+"','"+eaddr+"')";
		    System.out.println(sql);
			stm = con.createStatement();
			stm.execute(sql);
//======================================================================
//			1.query for cal even and odd records from table
//======================================================================
/*			
			mysql> select *from  employee4 where MOD(eid,2)=0;
			+------+---------+-------+-------+--------+
			| eid  | ename   | esal  | edept | eaddr  |
			+------+---------+-------+-------+--------+
			|    2 | Gaju    | 60000 | Admin | Akurdi |	<=======even records
			|    4 | Dhaynaa | 55000 | HR    | Pune   |
			+------+---------+-------+-------+--------+
			2 rows in set (0.00 sec)

			mysql> select *from  employee4 where MOD(eid,2)=1;
			+------+---------+-------+-----------+---------+
			| eid  | ename   | esal  | edept     | eaddr   |
			+------+---------+-------+-----------+---------+
			|    1 | Shubham | 50000 | HR        | Pune    | <=======odd records
			|    3 | Swapnil | 45000 | Admin     | Nagpur  |
			|    5 | Ankush  | 58000 | Resourses | Kartraj |
			+------+---------+-------+-----------+---------+
*/			
//======================================================================
//			2.query for cal third-highest salary from table
//======================================================================
/*			
			mysql> select *from  employee4
			    -> order by esal desc
			    -> limit 2,1;
			+------+---------+-------+-------+-------+
			| eid  | ename   | esal  | edept | eaddr |
			+------+---------+-------+-------+-------+
			|    4 | Dhaynaa | 55000 | HR    | Pune  |
			+------+---------+-------+-------+-------+
*/		
//======================================================================
//			query for cal second-highest salary from table
//======================================================================
/*			
				mysql> select *from  employee4
			        -> order by esal desc
			        -> limit 1,1;
			+------+--------+-------+-----------+---------+
			| eid  | ename  | esal  | edept     | eaddr   |
			+------+--------+-------+-----------+---------+
			|    5 | Ankush | 58000 | Resourses | Kartraj |
			+------+--------+-------+-----------+---------+
*/
//========================================================================================
//			3.query for cal Nth highest salary from table without using TOP/limit keyword
//========================================================================================
			
/*			
			mysql> select *from  employee4 e1
			    -> where 3-1=
			    -> (select count(distinct esal)
			    -> from employee4 e2
			    -> where e2.esal>e1.esal);
			+------+---------+-------+-------+-------+
			| eid  | ename   | esal  | edept | eaddr |
			+------+---------+-------+-------+-------+
			|    4 | Dhaynaa | 55000 | HR    | Pune  |
			+------+---------+-------+-------+-------+
*/
			
//======================================================================
//			4.query to find duplicate rows in table
//======================================================================
//				by using ename 
//======================================================================
/*		mysql> select ename									
			    -> from employee4
			    -> group by ename
			    -> having count(eid)>1;
			+---------+
			| ename   |
			+---------+
			| Shubham |
			+---------+

			
//======================================================================
//			5.by using eid
//======================================================================
  			mysql> select ename
			    -> from employee4
			    -> group by ename
			    -> having count(eid)>1;
			+---------+
			| ename   |
			+---------+
			| Shubham |
			+---------+
 */

//======================================================================
//			6.query to find first and last record from the table
//======================================================================
/*
				mysql> select * from employee4
			    -> where eid=(select min(eid)
			    -> from employee4);
			+------+---------+-------+--------------+---------+
			| eid  | ename   | esal  | edept        | eaddr   |
			+------+---------+-------+--------------+---------+
			|    1 | Shubham | 50000 | HR           | Pune    |
			|    1 | Prafull | 48000 | Construction | Gujarat |
			+------+---------+-------+--------------+---------+
	
	
			mysql> select * from employee4
			    -> where eid=(select max(eid)
			    -> from employee4);
			+------+--------+-------+-----------+---------+
			| eid  | ename  | esal  | edept     | eaddr   |
			+------+--------+-------+-----------+---------+
			|    5 | Ankush | 58000 | Resourses | Kartraj |
			+------+--------+-------+-----------+---------+
			
*/

//================================================================================
//			7.query to retrive the list of employee working in the same department
//================================================================================
/*
			mysql> select distinct e.ename,e.edept
			    -> from employee4 e,employee4 e1
			    -> where e.edept=e1.edept
			    -> and e.eid!=e1.eid;
			+----------+-------+
			| ename    | edept |
			+----------+-------+
			| Vrushabh | HR    |
			| Dhaynaa  | HR    |
			| Swapnil  | Admin |
			| Gaju     | Admin |
			| Shubham  | HR    |
			+----------+-------+
		
*/
//================================================================
//			8.query to retrive the last 3 records of employee 
//================================================================
/*
	mysql> select * from (select * from employee4
		-> order by eid desc limit 3)
		-> temp order by eid asc;
			+------+---------+-------+-----------+---------+
			| eid  | ename   | esal  | edept     | eaddr   |
			+------+---------+-------+-----------+---------+
			|    3 | Swapnil | 45000 | Admin     | Nagpur  |
			|    4 | Dhaynaa | 55000 | HR        | Pune    |
			|    5 | Ankush  | 58000 | Resourses | Kartraj |
			+------+---------+-------+-----------+---------+
*/
//===============================================================================
//			9.query to retrive the info about employee whose name start with 'G' 
//===============================================================================
/*		
			mysql> select * from employee4 where ename LIKE 'G%';
			+------+-------+-------+-------+--------+
			| eid  | ename | esal  | edept | eaddr  |
			+------+-------+-------+-------+--------+
			|    2 | Gaju  | 60000 | Admin | Akurdi |
			+------+-------+-------+-------+--------+
			1 row in set (0.00 sec)
			
//===============================================================================
//			10.query to retrive the info about employee whose name start with 'S' 
//===============================================================================


			mysql> select * from employee4 where ename LIKE 'S%';
			+------+---------+-------+--------+--------+
			| eid  | ename   | esal  | edept  | eaddr  |
			+------+---------+-------+--------+--------+
			|    1 | Shubham | 50000 | HR     | Pune   |
			|    3 | Swapnil | 45000 | Admin  | Nagpur |
			|    2 | Shubham | 46000 | Coding | Pune   |
			+------+---------+-------+--------+--------+
			3 rows in set (0.00 sec)
*/
	
//===============================================================================
//			11.query to retrive the info about employee whose name end with 'm' 
//===============================================================================
/*
			
			mysql> select * from employee4 where ename LIKE '______m';
			+------+---------+-------+--------+-------+
			| eid  | ename   | esal  | edept  | eaddr |
			+------+---------+-------+--------+-------+
			|    1 | Shubham | 50000 | HR     | Pune  |
			|    2 | Shubham | 46000 | Coding | Pune  |
			+------+---------+-------+--------+-------+
			
*/
		}
	}
}
