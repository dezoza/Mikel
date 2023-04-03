package While;

public class NestedWhileTest
{
	public static void name()
	{
		System.out.println("Myself Adlof Hitler");
	}
	public static void main(String[] args) 
	{
		int a = 1;
		int i = 1;
		while(i<15)
		{
			int j = 1;
			{
				System.out.print(i+ " ");
				name();
				i++;
				j++;
			}
			a++;
			System.out.println();
			
		}
	}
}
