package Mulitiple_Inheritance;

public class ServiceTest extends AutoMobile
{
	public void ServiceType()
	{
		System.out.println("WaterWash");
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
	public static void main(String[] args) {
		ServiceTest sd = new ServiceTest();
		sd.ServiceType();
		sd.BikeColour();
		sd.BikeName();
		sd.Economy();
		sd.FuelCapacity();	
}
}