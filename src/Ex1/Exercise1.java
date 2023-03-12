package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listGenericTotal(addElementGenericArray());
		
	}
	
	//Add the elements to the Array List
	public static ArrayList<Integer> addElementGenericArray(){
		ArrayList<Integer> list = new ArrayList<>(); //ArraylistObject
		
		Scanner sc = new Scanner(System.in);
		
		if(list.isEmpty()==true)
		{
			System.out.println("Array List is Empty");
		}
		
		System.out.println("Please Enter Values for the List");
		
		for(int i =0; i<10;i++)
		{
			System.out.print("Enter Value "+(i+1)+" : ");
			list.add(sc.nextInt());
		}
		
		return list;
		
	}
	
	//get total
	//Travesing through the list
	public static void listGenericTotal(ArrayList<Integer> list) {
		
		int total =0;
		int i =0;
		
		for(Integer x : list) {
			total += x;
			System.out.println("Value "+(i+1)+" : "+x);
			i++;
		}
		System.out.println("Total is "+total);
	}

}

