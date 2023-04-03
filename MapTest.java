package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest 
{
	public static void main(String[] args)
	{
	//HashMap
		Map<String, Integer> hm = new HashMap<>();
		hm.put("KIWI", 150);
		hm.put("Apple", 140);
		System.out.println(hm);
	//LinkedHashMap
		Map<String, Integer> lm = new LinkedHashMap<>(0);
		lm.put("BANANA", 100);
		lm.put("Orange", 80);
		lm.put("GUAVA", 80);
		System.out.println(lm);			
	//TreeMap
		Map<String, Integer> tm = new TreeMap<>();
		tm.put("RoseBerry", 200);
		tm.put("Cherry", 170);
		tm.put("BlueBerry", 100);
		System.out.println(tm);
	//size
		System.out.println("SIZE");
		int hm1 = hm.size();
		System.out.println(hm1);
	//Get
		System.out.println("GET");
		Integer lm1 = lm.get("Orange");
		System.out.println(lm1);
	//ContainKey
		System.out.println("Containskey");
		boolean tm1 = tm.containsKey("Apple");
		System.out.println(tm1);
	//containsValue
		System.out.println("ContainsValue");
		boolean m = hm.containsValue(140);
		System.out.println(m);
	//EntrySet
		System.out.println("EntrySet");
		Set<Entry<String, Integer>> entrySet = lm.entrySet();
		System.out.println(entrySet);
	//KeySet
		System.out.println("KeySet");
		Set<String> ks = tm.keySet();
		System.out.println(ks);
	//Values
		System.out.println("Values");
		Collection<Integer> v = lm.values();
		System.out.println(v);
	//Remove
		System.out.println("RemoveAll");
		tm.remove("Cherry", 170);
		tm.remove("BlueBerry", 100);
		tm.remove("RoseBerry", 200);
		System.out.println(tm);
	}	
}
