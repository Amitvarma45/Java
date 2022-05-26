package Corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayAllElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int len;		 
		
		System.out.println("Enter the length of Array : ");
		len = sc.nextInt();
		
		String arr[]=new String[len];
		System.out.println("Enter the values : ");
		
		for(int i=0;i<len;i++) {
			
			 arr[i]=sc.next();
			
		}
		
		System.out.println("Your values are :\n ");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]); 
		}
		

		
		  
		
		
		
		
		

	}

}
