package Multilevel_Inheritance;

public class CustomerTest extends MultiTest
{
	public void CustomerName()
	{
		System.out.println("Michael");
	}
	public void CustomerMobile()
	{
		System.out.println("9677904612");
	}
	public static void main(String[] args) 
	{
	CustomerTest c = new CustomerTest();
	c.CustomerName();
	c.CustomerMobile();
	c.ShowroomName();
	c.Location();
	}
}
