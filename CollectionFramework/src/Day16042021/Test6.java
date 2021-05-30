package Day16042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Iterator;
import java.util.List;
import java.util.Iterator;
import java.util.List;
import java.util.Iterator;
import java.util.List;
import java.util.Iterator;
import java.util.List;

public class Test6
{
	public static void main(String args[])
	   
	   {
	     Calculator c=new  Calculator();
	     int a1= c.add(10, 20);
	     int a2 =c.sub(10,5);
	     int a3 =c.mul(10, 20);
	     int a4= c.div(20, 5);
	     
	   // System.out.println(a1);
	     List l=new ArrayList();
	     l.add(a1);
	     l.add(a2);
	     l.add(a3);
	     l.add(a4);
	     
	     Iterator itr = l.iterator();
	     while(itr.hasNext())
	     {
	    	 int  i =(int) itr.next();
	    	 System.out.println("Result is =" +i);
	     }
	     
	   }

}
