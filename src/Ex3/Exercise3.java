package Ex3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no duplicate values
		//hasheset constructor
		Set studentHeight = new HashSet();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			
			System.out.print("Enter the height of student "+(i+1)+" : ");
			studentHeight.add(sc.nextInt());
				
		}
		
		//Loop through hashSet
		//Iteration the set elemenets using for each loop
		
		System.out.println("Display unique heights...");
		for(Object object : studentHeight) {
			System.out.println(object);
		}
	}

}
