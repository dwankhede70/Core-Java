package pack;

public class SBI extends Bank {
 @Override
	protected float rateOfInterest(int x)
	{
		int rate = 100*x;
		return rate;
	}

}
