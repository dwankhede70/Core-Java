package com.cjc1;

public class Oracle implements Connection {
	
//	public void commitOracle()
//	{
//		System.out.println("commit---oracle");
//	}
//	public void rollbackOracle()
//	{
//		System.out.println("rollback---oracle");
//	}
	
	public void commit()
	{
		System.out.println("commit---oracle");
	}
	public void rollback()
	{
		System.out.println("rollback---oracle");
	}

}
