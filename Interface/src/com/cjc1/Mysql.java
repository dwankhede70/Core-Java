package com.cjc1;

public class Mysql implements Connection {
//	public void commitMysql()
//	{
//		System.out.println("commit---Mysql");
//	}
//	public void rollbackMysql()
//	{
//		System.out.println("rollback---Mysql");
//	}
	
	public void commit()
	{
		System.out.println("commit---Mysql");
	}
	public void rollback()
	{
		System.out.println("rollback---Mysql");
	}
}
