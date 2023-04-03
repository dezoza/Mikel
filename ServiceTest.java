package Multilevel_Inheritance;

public class ServiceTest extends CustomerTest
{
	public void ServiceType()
	{
		System.out.println("WaterWash");
	}
	public void ServiceAmount()
	{
		System.out.println("300 for waterwash");
	}
	public static void main(String[] args)
	{
	ServiceTest st = new ServiceTest();
	st.ServiceType();
	st.ServiceAmount();
	st.CustomerName();
	st.CustomerMobile();
	}
}
