package Constructor;

public class ParameterizedConstructor
{
	
	public void Student(int id,	String name)
	{
		int ID;
		String Name;
		System.out.println("constructor with two paremeter");
	}
	public static void main(String[] args) 
	{
		ParameterizedConstructor pc = new ParameterizedConstructor();
		pc.Student(123,"Michael");
	}
}