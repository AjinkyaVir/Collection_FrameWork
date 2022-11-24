package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// WAP to perfome ArrayList methods use

		ArrayList<String> al = new ArrayList<>();

		al.add("Mango");
		al.add("Chikoo");
		al.add("Banana");
		al.add("Papaya");

		Iterator<String> itr = al.iterator();
		System.out.println("List of ArrayList elements : ");
		while (itr.hasNext()) {

			String fruit = itr.next();
			System.out.println(fruit);

		}

		System.out.println("Performing arraylist methods : ");

		al.add(3, "Apple");

		System.out.println("Updated ArrayList : ");

		for (String updatedFruitList : al) {

			System.out.println(updatedFruitList);

		}

		System.out.println(al.size());

		al.remove(1);

		System.out.println("After removing element from  ArrayList : ");

		for (int i = 0; i <= al.size() - 1; i++) {

			System.out.println(al.get(i));

		}

	}

}
