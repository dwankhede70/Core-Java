package pack;

public class C {
	int x;

}
class K  extends C
{
	int x=10;
}
class D{
	public C m1()
	{
		C c= new C();
		return c;
	}
}
class E extends D
{
	public K m1()
	{
		K k = new K();
		return k;
		
	}
}
