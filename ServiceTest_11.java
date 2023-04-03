package Herarchical_Inheritance;

public class ServiceTest extends HerarchicalTest
{
	public void NameofService()
	{
		System.out.println("Rearranging Mach parts");
	}
	public static void main(String[] args) 
	{
	ServiceTest md = new ServiceTest();
	md.NameofService();
	md.IndustryName();
	md.LandDetail();
	}
}
