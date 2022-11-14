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
		
	
		while(choice < 4) {
			
			System.out.println("Select Operation to perform : ");
			System.out.println("1 Push Element in stack");
			System.out.println("2 Pop Eleemnt from stack");
			System.out.println("3 Search Element from Stack");
			System.out.println("4 Exit");
			System.out.println("Enter your choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice) {
			
			case 1 : 
				System.out.println("Enter element : ");
				element = Integer.parseInt(br.readLine());
				s.push(element);
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
