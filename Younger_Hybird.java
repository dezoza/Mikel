package Hybird_Inheritance;

public class Younger implements Elder
{
	public void goal()
	{
		System.out.println("Footballer");
	}
	@Override
	public void Department() 
	{
		System.out.println("CSE");	
	}

	@Override
	public void Institute() 
	{
		System.out.println("AU");
	}

	@Override
	public void Sem()
	{
		System.out.println("3rd Sem");
	}
	public static void main(String[] args)
	{
		Younger y = new Younger();
		y.goal();
		y.Department();
		y.Institute();
		y.Sem();
		
	}
	}
	

