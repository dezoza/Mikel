package Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest 
{
	private static final Integer Interger = null;
	//ArithmeticException
	public static void AE()
	{
		System.out.println(10);
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//ArrayIndexOutOfBoundsException
	public static void AIOBE()
	{
		int a[] = new int [3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		try {
			a[3] = 5;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//StringIndexOutofBoundException
	public static void SIOBE() 
	{
		String s = "Selenium";
		try {
			System.out.println(s.charAt(9));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//IndexOutBoundofException
	public static void IOBE()
	{
		List<Integer> list1 = new ArrayList<>();
		try {
			list1.get(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//NullPointException
	public static void NPE()
	{
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	//InputMismatchException
	public static void IME()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name");
		try {
			int age = sc.nextInt();
			System.out.println("Your Age is:" +age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//NumberFormatException
	public static void NFE()
	{
		String s = "Age27";
		try {
			int snum = Interger.parseInt(s);
			int n = 6;
			System.out.println(snum+n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		AE();
		AIOBE();
		SIOBE();
		IOBE();
		NPE();
		IME();
		NFE();
	}
}
