package Encapsulation;

public class MethodVariables
{
	public int a;
	public int b;
	
	public static void add(int num1, int num2)
	{
		int result = num1 + num2;
		
		System.out.println(result);
	}
	public static void sub(int num1, int num2)
	{
		int result = num1 - num2;
		System.out.println(num1-num2);
		//result = num1+num2;
	}
	public static void mul(int num1, int num2)
	{
		int result = num1 * num2;
		System.out.println(num1*num2);
	}
	public static void div(int num1, int num2)
	{
		int result = num1 / num2;
		System.out.println(num1/num2);
	}




}
