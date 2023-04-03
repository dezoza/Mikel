package StringArray;

public class StringArrayTest 
{
	public static void main(String[] args) 
	{
		String s= "MichaelDsouza";
		String s2 = "DavidDominic";
		System.out.println("****PrintValues****");
		System.out.println(s);
		System.out.println(s2);
	//Equals
		System.out.println("****EqualsPrintValues****");
		boolean equals = s2.equals(s);
		System.out.println(equals);
	//EqualIgnoreCase
		System.out.println("****EqualIgnoreCase****");
		boolean case1 = s.equalsIgnoreCase(s2);
		System.out.println(case1);
	//SplitValues
		System.out.println("****SplitValues****");
		String[] words = s2.split("i");
		{
			for (String word : words) 
			{
				System.out.println(word);
			}
		}
	//upper/lower case
		System.out.println("****upper/lower case");
		System.out.println(s2.toUpperCase());
		System.out.println(s.toLowerCase());
	//Replace
		System.out.println("****Replace****");
		String res = s.replace("MichaelDsouza", "Mich_Des_aEL");
		System.out.println(res);
	//ReplaceFirst
		System.out.println("****ReplaceFirst****");
		String rp = s2.replaceFirst("DavidDominic", "MichaelDominic");
		System.out.println(rp);
		
	}
}
