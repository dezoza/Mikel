package Polymorphism;

public class OverloadingTest 
{
	public void Animal()
	{
		System.out.println("Dog Moves");
	}
	public void animal(String animalName, int total, String type)
	{
		System.out.println("****animal****");
		System.out.println("animalName:" +animalName);
		System.out.println("total:" +total);
		System.out.println("type:" +type);
	}
	public void aniaml1(String animal1Name, double weight, int total)
	{
		System.out.println("****Animal1****");
		System.out.println("animal1Name:"+ animal1Name);
		System.out.println("weight:" +weight);
		System.out.println("total:" +total);
	}
	public static void main(String[] args) 
	{
		OverloadingTest ot = new OverloadingTest();
		ot.Animal();
		ot.animal("Tiger", 10, "cat");
		ot.aniaml1("Deer", 55.500, 10);
}
	
	
}
