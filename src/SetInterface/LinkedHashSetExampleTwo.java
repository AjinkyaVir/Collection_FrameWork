package SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExampleTwo {

	public static void main(String[] args) {
		// LinkedHashSet example two
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		//LinkedHashSet doesn't allow duplicate value
		
		lhs.add("Raju");
		lhs.add("Ravi");
		lhs.add("Raju");
		lhs.add("Manju");
		
		for(String s : lhs) {
			System.out.println(s);
		}

	}

}
