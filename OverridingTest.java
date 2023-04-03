package Polymorphism;

public class OverridingTest extends OverloadingTest
{
	public void Cat()
	{
		System.out.println("drinks milk");
		super.Animal();
	}
	
	public static void main(String[] args) 
	{
		OverridingTest sd = new OverridingTest();
		sd.Animal();
		sd.aniaml1("Tiger", 130, 10);
		sd.Cat();
		sd.animal("lion", 130, "cat");
	}
}
