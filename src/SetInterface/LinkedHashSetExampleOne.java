package SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExampleOne {

	public static void main(String[] args) {
		// LinkedHashSet Example one
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}

	}

}
