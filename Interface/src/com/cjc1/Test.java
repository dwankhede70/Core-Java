package com.cjc1;

public class Test
{
	public static void main(String[] args) 
	{
		
	
//	    Oracle o = new Oracle();
//		o.commitOracle();
//		o.rollbackOracle();
		
//		Mysql m = new Mysql();
//		m.commitMysql();
//		m.rollbackMysql();
		
		Connection con = new Oracle();
		con.commit();
		con.rollback();
		
		Connection con1 = new Mysql();
		con1.commit();
		con1.rollback();
	}
}

