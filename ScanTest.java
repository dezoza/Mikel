package Scanner;

import java.util.Scanner;

public class ScanTest 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println( "result is :" + c);
		sc.nextLine();
		
		System.out.println("Enter the value");
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C= A-B;
		System.out.println("result is :" + C);
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("the name is :" +name);
		sc.close();
		
	}
}
