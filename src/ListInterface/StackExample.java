package ListInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int choice = 0,position,element;
		
		Stack<Integer> s = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		while(choice < 5) {
			
			System.out.println("Select Operation to perform : ");
			System.out.println("1 Push Element in stack");
			System.out.println("2 Pop Eleemnt from stack");
			System.out.println("3 Search Element from Stack");
			System.out.println("4 Print stack");
			System.out.println("5 Exit");
			System.out.println();
			System.out.println("Enter your choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice) {
			
			case 1 : 
				System.out.println("Enter element : ");
				element = Integer.parseInt(br.readLine());
				s.push(element);
				break;
				
			case 2 : 
				System.out.println("Remove Element from stack : ");
				s.pop();
				break;
				
			case 3:
				System.out.println("Search Element in stack : ");
				element = Integer.parseInt(br.readLine());
				s.search(element);
				break;
				
			case 4:
				System.out.println("Print stack");
				for(Integer ss : s) {
					System.out.println(ss);
				}
				
				break;
				
			case 5:
				System.out.println("Exit from stack");
				break;
				
			default:
				System.out.println("Wrong choice!");
			
			
			}
		}
	
		System.out.println("Elements from Stack : ");
		for(Integer i : s) {
			System.out.println(i);
		}
		
	}
	
}
