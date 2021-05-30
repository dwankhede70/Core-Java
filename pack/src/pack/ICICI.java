
package pack;

public class ICICI extends Bank {
	@Override
	protected float rateOfInterest(int x)
	{
		int rate = 100*x;
		return rate;
	}

}
