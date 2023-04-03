package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Michael");
		list1.add("Dsouzsa");
		list1.add("Dominic");
		list1.add("David");
	
		list1.remove(1);
		list1.add(1, "JOHN");
		list1.addAll(list1);
		list1.set(2, "JOHNKenadeyMichaelDsouzsa");
		list1.get(2);
		list1.indexOf(3);
		//list1.clear();
		
		System.out.println(list1);
		
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
