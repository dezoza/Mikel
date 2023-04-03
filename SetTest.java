package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest 
{
	public static void Hashset()
	{
		HashSet<String> set = new HashSet<>(0);
		System.out.println("HASHSET");
		set.add(null);
		set.add("Michael");
		set.add("David");
		set.add("Dsouza");
		set.add("Dominic");
		System.out.println(set);
	}
	public static void LinkedHashset()
	{
		System.out.println("LINKEDHASHSET");
		HashSet<String> lsh = new LinkedHashSet<>();
		lsh.add(null);
		lsh.add("ONE");
		lsh.add("TWO");
		lsh.add(null);
		lsh.add("FIVE");
		System.out.println(lsh);
	}
	public static void Treeset()
	{
		System.out.println("TREESET");
		TreeSet<String> tr = new TreeSet<>();
		tr.add("AMAZON");
		tr.add("ZEBRA");
		tr.add("FRANCE");
		//tr.add(null);
		tr.add("SPAIN");
		tr.add("BRAZIL");
		System.out.println(tr);
	}
	public static void main(String[] args) 
	{
		Hashset();
		LinkedHashset();
		Treeset();
	}
}
