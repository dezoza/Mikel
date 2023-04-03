package AccessModifier;

public class AccessTest 
{
	public static void add()
	{
		System.out.println("Addition");
	}
	private static void sub()
	{
		System.out.println("Subtraction");
	}
	protected static void mul()
	{
		System.out.println("Multiplication");
	}
	static void div()
	{
		System.out.println("Divison");
	}
	
	public static void main(String[] args)
	{
	add();
	sub();
	mul();
	div();
	}
}
