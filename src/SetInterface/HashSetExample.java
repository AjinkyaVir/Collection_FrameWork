package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// WAP to show the use of the HashSet
		
		/**
		 * HashSet will not allowed duplicate value
		 * Insertion order is also not preserved
		 * 
		 * Methods of HashSet class
		 * 
		 * boolean remove(object)
		 * boolean  add(object)
		 * void clear
		 * boolean contains(object)
		 * boolean isEmpty()
		 * int size()
		 * 
		 */
		
		HashSet<String> hs = new HashSet<>();
		hs.add("America");
		hs.add("India");
		hs.add("Bhutan");
		hs.add("China");
		hs.add("Nepal");
		hs.add("America");
		
		System.out.println(hs);
		
		//Iterate value using iterator
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			
			String country = (String) itr.next();
			System.out.println(country);
			
		}
		
		
		//remove element from the hash set
		hs.remove("China");
		System.out.println("After removing HashSet element : ");
		//for each loop to retrieve element from hashset
		for(String ss : hs) {
			
			System.out.println(ss);
			
		}
		

	}

}
