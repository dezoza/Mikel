package Constructor;

public class NonargTest 
{
	public void name()
	{
		//name = "Java";
		System.out.println("Java");
	}
	public void company()
	{
		//name = "oneplus";
		System.out.println("OnePlus");
	}
	
	public static void main(String[] args)
	{
	NonargTest nt = new NonargTest();	
	nt.name();
	nt.company();
	}
}
