package ListInterface;

import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// WAP to add elements in Vector and display this on console.
		
		Vector<Integer> v = new Vector<>();
		
		int[] nums = {10,20,30,40,50,60};
		
		//Adding int type nums in Integer type Vector
		
		for(int i=0; i<=nums.length-1; i++) {
			
			v.add(nums[i]);
			
		}
		
		System.out.println("Print all the vector elements : ");
		
		ListIterator listVector = v.listIterator();
		
		System.out.println("Print elements in order : ");
		
		while(listVector.hasNext()) {
			
			System.out.print(listVector.next() + " ");
			
		}
		System.out.println("");
		System.out.println("Print elements in reverse order : ");
		while(listVector.hasPrevious()) {
			System.out.print(listVector.previous() + " ");
		}
		

	}

}
