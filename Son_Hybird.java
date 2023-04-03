package Hybird_Inheritance;

public class Son implements Father
{
	public void SonDOB()
	{
		System.out.println("12-02-1254");
	}

	@Override
	public void F_Name() 
	{
		System.out.println("Alaska");
	}

	@Override
	public void F_Income() 
	{
		System.out.println("50LPA");
	}
	public static void main(String[] args) 
	{
	Son s = new Son();
	s.F_Name();
	s.F_Income();
	s.SonDOB();
	}
	
}
