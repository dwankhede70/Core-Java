package comm1;
import com.cjc.pune.*;


public class Info extends carupdate
{
	protected void displayInfo()
	{
		Info z = new Info();
		Info c = z.getData();
		
		
		/*i.setUpdcno(c1.getCno());
		i.setUpdcname(c1.getCname());
	    i.setUpdcmodel(c1.getCmodel());
	    i.setUpdcowner(c1.getCowner());
	    i.setUpdcprice(c1.getCprice());*/
	      
	
	System.out.println("car no is:" +c.getUpdcno());
	System.out.println("car name is :" +c.getUpdcname());
	System.out.println("car model is :" +c.getUpdcmodel());
	System.out.println("car owner name is :" +c.getUpdcowner());
	System.out.println("car price is :" +c.getUpdcprice());
	
	}
}