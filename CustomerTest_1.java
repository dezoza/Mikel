package Mulitiple_Inheritance;

public class CustomerTest extends AutoMobile
{
	public void CustomerName()
	{
		System.out.println("Michael");
	}

	@Override
	public void FuelCapacity() 
	{
		System.out.println("14L");	
	}

	@Override
	public void BikeColour() 
	{
		System.out.println("Red");
	}
	public static void main(String[] args) 
	{
	CustomerTest cd = new CustomerTest();
	cd.CustomerName();
	cd.BikeName();
	cd.FuelCapacity();
	cd.Economy();
	cd.BikeColour();
	}
	
}
