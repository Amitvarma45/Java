//program to iterate through all elements in array list

package Corejava;

import java.util.ArrayList;
import java.util.Scanner;

 class ArrayElements {

	public static void main(String[] args) {
		
		//Creating object of Scanner Class
		Scanner sc = new Scanner(System.in);
		
		
		//making len  variable of Int data type
		int len;		 
		
		//taking length of array from user
		System.out.println("Enter the length of Array : ");
		len = sc.nextInt();
		
		//Creating String Array
		String arr[]=new String[len];
		
		//taking array elements from user
		System.out.println("Enter the values : ");
		
		for(int i=0;i<len;i++) {
			
			 arr[i]=sc.next();
			
		}
		
		//Printing Out Put
		System.out.println("Your values are :\n ");
		
		//for loop for iterating through all elements of array
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]); 
		}
		

		
		  
		
		
		
		
		

	}

}
