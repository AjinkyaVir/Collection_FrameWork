package ListInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) throws IOException {
		// WAP that shows use of LinkedList

		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("Nepal");
		countries.add("Bhutan");
		countries.add("Shrilanka");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int choice = 0, position;
		String element;

		while (choice < 4) {

			System.out.println("\nLinkedList operations : ");
			System.out.println("1 Add element in countries list : ");
			System.out.println("2 Remove element from the countries list : ");
			System.out.println("3 Change country name ");
			System.out.println("4 Exit");
			
			System.out.println("Enter your choice : ");
			choice = Integer.parseInt(br.readLine());
			
			switch (choice) {

			case 1:
				System.out.println("Add element in countries list : ");
				element = br.readLine();
				System.out.println("Enter at position : ");
				position = Integer.parseInt(br.readLine());
				countries.add(position-1,element);
				break;
				
			case 2: 
				System.out.println("Remove element at position : ");
				position = Integer.parseInt(br.readLine());
				countries.remove(position-1);
				break;
				
			case 3:
				System.out.println("Change country name ");
				element = br.readLine();
				position = Integer.parseInt(br.readLine());
				countries.set(position, element);
				break;
				
			case 4:
				System.out.println("Exit");
				break;
				
			default:
				return;
			}

			System.out.println("List of countries : ");
			Iterator itr = countries.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next() + " ");
			}
			
		}

	}

}
